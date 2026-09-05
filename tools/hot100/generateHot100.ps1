param(
    [Parameter(Mandatory = $true)]
    [string]$sourceDir,

    [Parameter(Mandatory = $true)]
    [string]$targetDir,

    [string]$signatureSourceDir = ''
)

Set-StrictMode -Version Latest
$ErrorActionPreference = 'Stop'

$utf8NoBom = New-Object System.Text.UTF8Encoding($false)

function Write-Utf8NoBom {
    param(
        [Parameter(Mandatory = $true)]
        [string]$path,

        [Parameter(Mandatory = $true)]
        [string]$content
    )

    $directoryPath = Split-Path -Path $path -Parent
    if (-not [string]::IsNullOrWhiteSpace($directoryPath)) {
        [System.IO.Directory]::CreateDirectory($directoryPath) | Out-Null
    }
    [System.IO.File]::WriteAllText($path, $content, $utf8NoBom)
}

function ConvertToSnakeCase {
    param(
        [AllowEmptyString()]
        [string]$value
    )

    if ([string]::IsNullOrWhiteSpace($value)) {
        return 'problem'
    }

    $normalizedValue = $value -replace '[^A-Za-z0-9]', '_'
    $normalizedValue = [regex]::Replace($normalizedValue, '([A-Z]+)([A-Z][a-z])', '$1_$2')
    $normalizedValue = [regex]::Replace($normalizedValue, '([a-z0-9])([A-Z])', '$1_$2')
    $normalizedValue = [regex]::Replace($normalizedValue, '_+', '_')
    $normalizedValue = $normalizedValue.Trim('_').ToLowerInvariant()

    if ([string]::IsNullOrWhiteSpace($normalizedValue)) {
        return 'problem'
    }

    return $normalizedValue
}

function ConvertToClassSuffix {
    param(
        [AllowEmptyString()]
        [string]$value
    )

    if ([string]::IsNullOrWhiteSpace($value)) {
        return 'Problem'
    }

    $normalizedValue = $value -replace '[^A-Za-z0-9]', ''
    if ([string]::IsNullOrWhiteSpace($normalizedValue)) {
        return 'Problem'
    }

    if ($normalizedValue.Length -eq 1) {
        return $normalizedValue.ToUpperInvariant()
    }

    return $normalizedValue.Substring(0, 1).ToUpperInvariant() + $normalizedValue.Substring(1)
}

function GetMarkdownContentUtf8 {
    param(
        [Parameter(Mandatory = $true)]
        [string]$path
    )

    return [System.Text.Encoding]::UTF8.GetString([System.IO.File]::ReadAllBytes($path))
}

function GetJavaCodeBlock {
    param(
        [Parameter(Mandatory = $true)]
        [string]$markdownContent
    )

    $codeMatch = [regex]::Match($markdownContent, '(?s)```java\s*(.*?)\s*```')
    if ($codeMatch.Success) {
        return $codeMatch.Groups[1].Value
    }

    return $markdownContent
}

function GetImportList {
    param(
        [AllowEmptyString()]
        [string]$signature
    )

    $importMap = [ordered]@{
        'ListNode'       = 'import com.rsqu.leetcode.util.ListNode;'
        'TreeNode'       = 'import com.rsqu.leetcode.util.TreeNode;'
        'List<'          = 'import java.util.List;'
        'Map<'           = 'import java.util.Map;'
        'Set<'           = 'import java.util.Set;'
        'Queue<'         = 'import java.util.Queue;'
        'Deque<'         = 'import java.util.Deque;'
        'PriorityQueue<' = 'import java.util.PriorityQueue;'
    }

    $result = New-Object System.Collections.Generic.List[string]
    foreach ($pattern in $importMap.Keys) {
        if ($signature -match [regex]::Escape($pattern)) {
            $result.Add($importMap[$pattern])
        }
    }

    return $result | Select-Object -Unique
}

function GetReturnStatement {
    param(
        [Parameter(Mandatory = $true)]
        [string]$returnType
    )

    $normalizedType = ($returnType -replace '\s+', ' ').Trim()

    switch -Regex ($normalizedType) {
        '^void$' {
            return ''
        }
        '^boolean$' {
            return 'return false;'
        }
        '^(byte|short|int)$' {
            return 'return 0;'
        }
        '^long$' {
            return 'return 0L;'
        }
        '^float$' {
            return 'return 0F;'
        }
        '^double$' {
            return 'return 0D;'
        }
        '^char$' {
            return "return ' ';"
        }
        default {
            return 'return null;'
        }
    }
}

function GetProblemInfoFromSourceFile {
    param(
        [Parameter(Mandatory = $true)]
        [System.IO.FileInfo]$file
    )

    if ($file.Name -ieq 'README.md') {
        return $null
    }

    $number = $null
    $title = ''

    if ($file.BaseName -match '^0*(\d+)[_ -](.+)$') {
        $number = [int]$matches[1]
        $title = $matches[2].Trim()
    } elseif ($file.BaseName -match '^(\d+)\.\s*(.+)$') {
        $number = [int]$matches[1]
        $title = $matches[2].Trim()
    } else {
        return $null
    }

    return [PSCustomObject]@{
        Number          = $number
        Title           = $title
        FullName        = $file.FullName
        MarkdownContent = GetMarkdownContentUtf8 -path $file.FullName
    }
}

function GetSignatureMetadata {
    param(
        [Parameter(Mandatory = $true)]
        [System.IO.FileInfo]$file
    )

    if ($file.BaseName -notmatch '^(\d+)\.\s*(.+)$') {
        return $null
    }

    $number = [int]$matches[1]
    $markdownContent = GetMarkdownContentUtf8 -path $file.FullName
    $javaCode = GetJavaCodeBlock -markdownContent $markdownContent
    $classMatches = [regex]::Matches($javaCode, '(?<![A-Za-z0-9_])class\s+([A-Za-z_][A-Za-z0-9_]*)\b')
    $primaryClassName = if ($classMatches.Count -gt 0) { $classMatches[$classMatches.Count - 1].Groups[1].Value } else { '' }
    $methodMatches = [regex]::Matches(
        $javaCode,
        '(?m)^\s*public\s+(?!class\b)([A-Za-z_][A-Za-z0-9_<>\[\], ?.]*)\s+([A-Za-z_][A-Za-z0-9_]*)\s*\(([^)]*)\)\s*\{'
    )

    $isDesignProblem = $false
    if ($primaryClassName -and $primaryClassName -ne 'Solution') {
        $isDesignProblem = $true
    }
    if ($javaCode -match 'Your\s+\w+\s+object\s+will\s+be\s+instantiated') {
        $isDesignProblem = $true
    }

    $methodSignature = ''
    $methodName = ''
    $returnType = ''
    if (-not $isDesignProblem -and $methodMatches.Count -gt 0) {
        $returnType = ($methodMatches[0].Groups[1].Value -replace '\s+', ' ').Trim()
        $methodName = $methodMatches[0].Groups[2].Value.Trim()
        $parameterText = ($methodMatches[0].Groups[3].Value -replace '\s+', ' ').Trim()
        $methodSignature = "public $returnType $methodName($parameterText)"
    }

    $baseIdentifier = ''
    if (-not [string]::IsNullOrWhiteSpace($methodName)) {
        $baseIdentifier = $methodName
    } elseif (-not [string]::IsNullOrWhiteSpace($primaryClassName)) {
        $baseIdentifier = $primaryClassName
    } else {
        $baseIdentifier = "Problem$number"
    }

    return [PSCustomObject]@{
        Number          = $number
        BaseIdentifier  = $baseIdentifier
        MethodSignature = $methodSignature
        ReturnType      = $returnType
        IsDesignProblem = $isDesignProblem
    }
}

function BuildOrdinaryTemplate {
    param(
        [Parameter(Mandatory = $true)]
        [pscustomobject]$problem,

        [Parameter(Mandatory = $true)]
        [string]$packageName,

        [Parameter(Mandatory = $true)]
        [string]$className
    )

    $imports = @(GetImportList -signature $problem.MethodSignature)
    $returnStatement = GetReturnStatement -returnType $problem.ReturnType

    $contentLines = New-Object System.Collections.Generic.List[string]
    $contentLines.Add("package $packageName;")
    $contentLines.Add('')
    foreach ($importLine in $imports) {
        $contentLines.Add($importLine)
    }
    if ($imports.Count -gt 0) {
        $contentLines.Add('')
    }
    $contentLines.Add("public class $className {")
    $contentLines.Add('')
    $contentLines.Add("    $($problem.MethodSignature) {")
    if (-not [string]::IsNullOrWhiteSpace($returnStatement)) {
        $contentLines.Add("        $returnStatement")
    }
    $contentLines.Add('    }')
    $contentLines.Add('')
    $contentLines.Add('    public static void main(String[] args) {')
    $contentLines.Add("        $className solution = new $className();")
    $contentLines.Add('    }')
    $contentLines.Add('}')

    return $contentLines -join "`r`n"
}

function BuildGenericTemplate {
    param(
        [Parameter(Mandatory = $true)]
        [string]$packageName,

        [Parameter(Mandatory = $true)]
        [string]$className
    )

    $contentLines = @(
        "package $packageName;",
        '',
        "public class $className {",
        '',
        '    public Object solution() {',
        '        return null;',
        '    }',
        '',
        '    public static void main(String[] args) {',
        "        $className solution = new $className();",
        '    }',
        '}'
    )

    return $contentLines -join "`r`n"
}

function BuildDesignTemplate {
    param(
        [Parameter(Mandatory = $true)]
        [string]$packageName,

        [Parameter(Mandatory = $true)]
        [string]$className
    )

    $contentLines = @(
        "package $packageName;",
        '',
        "public class $className {",
        '',
        '    public static void main(String[] args) {',
        '    }',
        '}'
    )

    return $contentLines -join "`r`n"
}

function BuildCopyRandomListTemplate {
    param(
        [Parameter(Mandatory = $true)]
        [string]$packageName,

        [Parameter(Mandatory = $true)]
        [string]$className
    )

    $contentLines = @(
        "package $packageName;",
        '',
        "public class $className {",
        '',
        '    static class Node {',
        '        int val;',
        '        Node next;',
        '        Node random;',
        '',
        '        Node(int val) {',
        '            this.val = val;',
        '        }',
        '    }',
        '',
        '    public Node copyRandomList(Node head) {',
        '        return null;',
        '    }',
        '',
        '    public static void main(String[] args) {',
        "        $className solution = new $className();",
        '    }',
        '}'
    )

    return $contentLines -join "`r`n"
}

$resolvedSourceDir = (Resolve-Path -Path $sourceDir).Path
$resolvedTargetDir = [System.IO.Path]::GetFullPath($targetDir)

if (-not (Test-Path -Path $resolvedSourceDir)) {
    throw "Source directory does not exist: $resolvedSourceDir"
}

[System.IO.Directory]::CreateDirectory($resolvedTargetDir) | Out-Null

if (-not $resolvedTargetDir.EndsWith('\hot100', [System.StringComparison]::OrdinalIgnoreCase)) {
    throw "Target directory must be the hot100 directory: $resolvedTargetDir"
}

$signatureMap = @{}
if (-not [string]::IsNullOrWhiteSpace($signatureSourceDir) -and (Test-Path -Path $signatureSourceDir)) {
    $resolvedSignatureSourceDir = (Resolve-Path -Path $signatureSourceDir).Path
    $signatureFiles = Get-ChildItem -Path $resolvedSignatureSourceDir -Recurse -File -Filter '*.md' |
        Where-Object { $_.DirectoryName -like '*\Leetcode\*' }
    foreach ($signatureFile in $signatureFiles) {
        $signatureMetadata = GetSignatureMetadata -file $signatureFile
        if ($null -ne $signatureMetadata -and -not $signatureMap.ContainsKey($signatureMetadata.Number)) {
            $signatureMap[$signatureMetadata.Number] = $signatureMetadata
        }
    }
}

$designProblemNumbers = @{
    146 = $true
    155 = $true
    208 = $true
    295 = $true
}

$manualIdentifierMap = @{
    24   = 'swapPairs'
    25   = 'reverseKGroup'
    35   = 'searchInsert'
    41   = 'firstMissingPositive'
    45   = 'jump'
    49   = 'groupAnagrams'
    51   = 'solveNQueens'
    54   = 'spiralOrder'
    64   = 'minPathSum'
    73   = 'setZeroes'
    74   = 'searchMatrixI'
    76   = 'minWindow'
    108  = 'sortedArrayToBst'
    118  = 'generatePascalTriangle'
    131  = 'partition'
    136  = 'singleNumber'
    138  = 'copyRandomList'
    153  = 'findMin'
    155  = 'minStack'
    189  = 'rotateArray'
    199  = 'rightSideView'
    230  = 'kthSmallest'
    295  = 'medianFinder'
    347  = 'topKFrequent'
    763  = 'partitionLabels'
    994  = 'orangesRotting'
    1143 = 'longestCommonSubsequence'
}

$manualSignatureMap = @{
    24   = [PSCustomObject]@{ MethodSignature = 'public ListNode swapPairs(ListNode head)'; ReturnType = 'ListNode'; IsDesignProblem = $false }
    25   = [PSCustomObject]@{ MethodSignature = 'public ListNode reverseKGroup(ListNode head, int k)'; ReturnType = 'ListNode'; IsDesignProblem = $false }
    35   = [PSCustomObject]@{ MethodSignature = 'public int searchInsert(int[] nums, int target)'; ReturnType = 'int'; IsDesignProblem = $false }
    41   = [PSCustomObject]@{ MethodSignature = 'public int firstMissingPositive(int[] nums)'; ReturnType = 'int'; IsDesignProblem = $false }
    45   = [PSCustomObject]@{ MethodSignature = 'public int jump(int[] nums)'; ReturnType = 'int'; IsDesignProblem = $false }
    49   = [PSCustomObject]@{ MethodSignature = 'public List<List<String>> groupAnagrams(String[] strs)'; ReturnType = 'List<List<String>>'; IsDesignProblem = $false }
    51   = [PSCustomObject]@{ MethodSignature = 'public List<List<String>> solveNQueens(int n)'; ReturnType = 'List<List<String>>'; IsDesignProblem = $false }
    54   = [PSCustomObject]@{ MethodSignature = 'public List<Integer> spiralOrder(int[][] matrix)'; ReturnType = 'List<Integer>'; IsDesignProblem = $false }
    64   = [PSCustomObject]@{ MethodSignature = 'public int minPathSum(int[][] grid)'; ReturnType = 'int'; IsDesignProblem = $false }
    73   = [PSCustomObject]@{ MethodSignature = 'public void setZeroes(int[][] matrix)'; ReturnType = 'void'; IsDesignProblem = $false }
    74   = [PSCustomObject]@{ MethodSignature = 'public boolean searchMatrix(int[][] matrix, int target)'; ReturnType = 'boolean'; IsDesignProblem = $false }
    76   = [PSCustomObject]@{ MethodSignature = 'public String minWindow(String s, String t)'; ReturnType = 'String'; IsDesignProblem = $false }
    108  = [PSCustomObject]@{ MethodSignature = 'public TreeNode sortedArrayToBST(int[] nums)'; ReturnType = 'TreeNode'; IsDesignProblem = $false }
    118  = [PSCustomObject]@{ MethodSignature = 'public List<List<Integer>> generate(int numRows)'; ReturnType = 'List<List<Integer>>'; IsDesignProblem = $false }
    131  = [PSCustomObject]@{ MethodSignature = 'public List<List<String>> partition(String s)'; ReturnType = 'List<List<String>>'; IsDesignProblem = $false }
    136  = [PSCustomObject]@{ MethodSignature = 'public int singleNumber(int[] nums)'; ReturnType = 'int'; IsDesignProblem = $false }
    153  = [PSCustomObject]@{ MethodSignature = 'public int findMin(int[] nums)'; ReturnType = 'int'; IsDesignProblem = $false }
    189  = [PSCustomObject]@{ MethodSignature = 'public void rotate(int[] nums, int k)'; ReturnType = 'void'; IsDesignProblem = $false }
    199  = [PSCustomObject]@{ MethodSignature = 'public List<Integer> rightSideView(TreeNode root)'; ReturnType = 'List<Integer>'; IsDesignProblem = $false }
    230  = [PSCustomObject]@{ MethodSignature = 'public int kthSmallest(TreeNode root, int k)'; ReturnType = 'int'; IsDesignProblem = $false }
    347  = [PSCustomObject]@{ MethodSignature = 'public int[] topKFrequent(int[] nums, int k)'; ReturnType = 'int[]'; IsDesignProblem = $false }
    763  = [PSCustomObject]@{ MethodSignature = 'public List<Integer> partitionLabels(String s)'; ReturnType = 'List<Integer>'; IsDesignProblem = $false }
    994  = [PSCustomObject]@{ MethodSignature = 'public int orangesRotting(int[][] grid)'; ReturnType = 'int'; IsDesignProblem = $false }
    1143 = [PSCustomObject]@{ MethodSignature = 'public int longestCommonSubsequence(String text1, String text2)'; ReturnType = 'int'; IsDesignProblem = $false }
}

Get-ChildItem -Path $resolvedTargetDir -Force | Remove-Item -Recurse -Force

$sourceFiles = Get-ChildItem -Path $resolvedSourceDir -Recurse -File -Filter '*.md'
$problemInfos = foreach ($sourceFile in $sourceFiles) {
    $problemInfo = GetProblemInfoFromSourceFile -file $sourceFile
    if ($null -ne $problemInfo) {
        $problemInfo
    }
}

$selectedProblems = $problemInfos |
    Sort-Object Number, FullName |
    Group-Object Number |
    ForEach-Object { $_.Group | Select-Object -First 1 } |
    Sort-Object Number

foreach ($problem in $selectedProblems) {
    $numberText = '{0:D4}' -f $problem.Number
    $signatureMetadata = $null
    if ($signatureMap.ContainsKey($problem.Number)) {
        $signatureMetadata = $signatureMap[$problem.Number]
    }
    if ($manualSignatureMap.ContainsKey($problem.Number)) {
        if ($null -eq $signatureMetadata) {
            $signatureMetadata = [PSCustomObject]@{
                Number          = $problem.Number
                BaseIdentifier  = ''
                MethodSignature = $manualSignatureMap[$problem.Number].MethodSignature
                ReturnType      = $manualSignatureMap[$problem.Number].ReturnType
                IsDesignProblem = $manualSignatureMap[$problem.Number].IsDesignProblem
            }
        } else {
            $signatureMetadata.MethodSignature = $manualSignatureMap[$problem.Number].MethodSignature
            $signatureMetadata.ReturnType = $manualSignatureMap[$problem.Number].ReturnType
            $signatureMetadata.IsDesignProblem = $manualSignatureMap[$problem.Number].IsDesignProblem
        }
    }

    if ($manualIdentifierMap.ContainsKey($problem.Number)) {
        $baseIdentifier = $manualIdentifierMap[$problem.Number]
    } elseif ($null -ne $signatureMetadata) {
        $baseIdentifier = $signatureMetadata.BaseIdentifier
    } else {
        $baseIdentifier = "Problem$numberText"
    }
    $directoryName = "p${numberText}_$(ConvertToSnakeCase -value $baseIdentifier)"
    $className = "Hot100${numberText}$(ConvertToClassSuffix -value $baseIdentifier)"
    $packageName = "com.rsqu.leetcode.hot100.$directoryName"
    $problemDirectory = Join-Path -Path $resolvedTargetDir -ChildPath $directoryName

    [System.IO.Directory]::CreateDirectory($problemDirectory) | Out-Null

    $readmePath = Join-Path -Path $problemDirectory -ChildPath 'README.md'
    $javaFilePath = Join-Path -Path $problemDirectory -ChildPath "$className.java"

    Write-Utf8NoBom -path $readmePath -content $problem.MarkdownContent

    if ($problem.Number -eq 138) {
        $javaContent = BuildCopyRandomListTemplate -packageName $packageName -className $className
    } elseif ($manualSignatureMap.ContainsKey($problem.Number)) {
        $manualProblem = [PSCustomObject]@{
            MethodSignature = $manualSignatureMap[$problem.Number].MethodSignature
            ReturnType      = $manualSignatureMap[$problem.Number].ReturnType
        }
        $javaContent = BuildOrdinaryTemplate -problem $manualProblem -packageName $packageName -className $className
    } elseif (($null -ne $signatureMetadata) -and -not $signatureMetadata.IsDesignProblem -and -not [string]::IsNullOrWhiteSpace($signatureMetadata.MethodSignature)) {
        $javaContent = BuildOrdinaryTemplate -problem $signatureMetadata -packageName $packageName -className $className
    } elseif ($designProblemNumbers.ContainsKey($problem.Number) -or (($null -ne $signatureMetadata) -and $signatureMetadata.IsDesignProblem)) {
        $javaContent = BuildDesignTemplate -packageName $packageName -className $className
    } else {
        $javaContent = BuildGenericTemplate -packageName $packageName -className $className
    }

    Write-Utf8NoBom -path $javaFilePath -content $javaContent
}

"Generated directories: $($selectedProblems.Count)"
