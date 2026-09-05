# Hot100 Directory Scaffold Implementation Plan

> **For Claude:** REQUIRED SUB-SKILL: Use superpowers:executing-plans to implement this plan task-by-task.

**Goal:** Pull the Hot100 Markdown repository and convert it into per-problem practice directories under `src/main/java/com/rsqu/leetcode/hot100`, each with `README.md` and a writable Java template class.

**Architecture:** Clone the source repository into a temporary local area, inspect the Markdown naming pattern, then run a local conversion script that creates one directory per problem using normalized directory names, package names, and Java class names. Use conservative template generation for unclear or design-style problems so the generated structure stays usable without guessing wrong method signatures.

**Tech Stack:** PowerShell, Git, Java source scaffolding, local Markdown parsing

---

### Task 1: 获取远端题库并确认命名模式

**Files:**
- Create: `src/main/java/com/rsqu/leetcode/hot100/`
- Verify: `git clone https://github.com/zh-he/LeetCode_Hot100_Java_Solution.git <temp-dir>`
- Verify: `Get-ChildItem <temp-dir> -File -Filter *.md`

**Risk Level:** Standard lightweight verification
**Why:** 这是外部题库拉取与结构探测，不是高风险业务逻辑。

**Step 1: Set verification path**

Skip strict TDD; use lightweight verification.

**Step 2: Prepare verification**

使用最小化的目录列表验证远端仓库是否已拉取，且其中确实存在 Markdown 题目文件。

**Step 3: Write minimal implementation**

创建本地目标目录，拉取远端仓库到临时目录，不进入现有源码树直接覆盖。

**Step 4: Run chosen verification**

Run: `Get-ChildItem <temp-dir> -File -Filter *.md`
Expected: PASS，并能看到题目 Markdown 文件列表。

**Step 5: Record a local checkpoint**

记录远端仓库的本地临时路径，以及 Markdown 的命名规律与数量。

### Task 2: 生成批量整理脚本

**Files:**
- Create: `tools/hot100/generateHot100.ps1`
- Verify: `Get-Content tools/hot100/generateHot100.ps1`

**Risk Level:** Standard lightweight verification
**Why:** 该任务是一次性脚本开发，风险集中在命名归一化而非复杂算法。

**Step 1: Set verification path**

Skip strict TDD; use lightweight verification.

**Step 2: Prepare verification**

先明确脚本输入输出：

- 输入：远端仓库本地路径
- 输出：`src/main/java/com/rsqu/leetcode/hot100`

脚本需负责：

- 扫描 Markdown 文件
- 解析题号与题目英文名
- 生成目录名
- 复制 `README.md`
- 生成 Java 模板类

**Step 3: Write minimal implementation**

脚本中封装小函数处理：

- 文件名清洗
- 目录名转换
- 类名转换
- 设计题识别

**Step 4: Run chosen verification**

Run: `Get-Content tools/hot100/generateHot100.ps1`
Expected: PASS，并且脚本包含完整的输入、生成与写文件逻辑。

**Step 5: Record a local checkpoint**

记录脚本路径、核心命名规则和设计题降级策略。

### Task 3: 执行脚本并生成 hot100 目录

**Files:**
- Create: `src/main/java/com/rsqu/leetcode/hot100/...`
- Verify: `& .\tools\hot100\generateHot100.ps1 -SourceDir <temp-dir> -TargetDir src/main/java/com/rsqu/leetcode/hot100`
- Verify: `Get-ChildItem src/main/java/com/rsqu/leetcode/hot100 -Directory`

**Risk Level:** Standard lightweight verification
**Why:** 该任务主要是批量生成文件，验证重点是结构是否落地。

**Step 1: Set verification path**

Skip strict TDD; use lightweight verification.

**Step 2: Prepare verification**

执行脚本后，检查目标目录是否按每题一个子目录生成。

**Step 3: Write minimal implementation**

运行脚本，必要时根据实际 Markdown 命名格式微调解析规则后再次执行。

**Step 4: Run chosen verification**

Run: `Get-ChildItem src/main/java/com/rsqu/leetcode/hot100 -Directory`
Expected: PASS，并看到规范化后的题目目录列表。

**Step 5: Record a local checkpoint**

记录生成数量，并说明是否存在无法解析而采用保守命名的题目。

### Task 4: 抽样校验模板质量

**Files:**
- Verify: `Get-Content src/main/java/com/rsqu/leetcode/hot100/<sample>/README.md`
- Verify: `Get-Content src/main/java/com/rsqu/leetcode/hot100/<sample>/Hot100xxxxXxx.java`

**Risk Level:** Standard lightweight verification
**Why:** 抽样检查比全量逐个检查更适合本次目录整理任务。

**Step 1: Set verification path**

Skip strict TDD; use lightweight verification.

**Step 2: Prepare verification**

挑选普通题与设计题各至少一个样本，检查：

- 包名是否正确
- 目录名与类名是否一致
- 中文注释是否正常
- README 是否成功复制

**Step 3: Write minimal implementation**

若发现命名或模板错误，修改脚本并重新生成目标目录。

**Step 4: Run chosen verification**

Run: `Get-Content <sample-java-file>`
Expected: PASS，并确认模板内容可直接继续手写。

**Step 5: Record a local checkpoint**

记录抽样结果与必要的修正。

### Task 5: 输出结果与后续使用说明

**Files:**
- Verify: `Get-ChildItem src/main/java/com/rsqu/leetcode/hot100 -Recurse`

**Risk Level:** Standard lightweight verification
**Why:** 该任务是结果汇总，不涉及额外风险。

**Step 1: Set verification path**

Skip strict TDD; use lightweight verification.

**Step 2: Prepare verification**

汇总生成目录数量、示例目录和使用方式。

**Step 3: Write minimal implementation**

整理最终说明，明确哪些题是普通模板，哪些题需要手动调整签名。

**Step 4: Run chosen verification**

Run: `Get-ChildItem src/main/java/com/rsqu/leetcode/hot100 -Recurse`
Expected: PASS，并可证明文件已经完整生成。

**Step 5: Record a local checkpoint**

记录最终交付范围与未覆盖的自动化部分。
