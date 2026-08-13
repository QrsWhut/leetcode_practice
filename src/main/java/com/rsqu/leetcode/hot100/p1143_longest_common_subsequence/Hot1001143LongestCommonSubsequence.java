package com.rsqu.leetcode.hot100.p1143_longest_common_subsequence;

public class Hot1001143LongestCommonSubsequence {

    public int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();
        // dp[i][j] 表示 text1 前 i 个字符与 text2 前 j 个字符的最长公共子序列长度
        // dp[0][*] 与 dp[*][0] 默认 0，即空串的 LCS 为 0
        int[][] dp = new int[m + 1][n + 1];
        // 逐行从左到右填满整张表，保证 dp[i-1][j]、dp[i][j-1]、dp[i-1][j-1] 均已就绪
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    // 末尾字符相等，直接拼进公共子序列
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    // 不相等，二选一取更大：跳过 text1 的字符 或 跳过 text2 的字符
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[m][n];
    }

    public static void main(String[] args) {
        Hot1001143LongestCommonSubsequence solution = new Hot1001143LongestCommonSubsequence();
        // 示例 1：LCS 为 "ace"，长度 3
        System.out.println(solution.longestCommonSubsequence("abcde", "ace"));
        // 示例 2：完全相等，长度 3
        System.out.println(solution.longestCommonSubsequence("abc", "abc"));
        // 示例 3：无公共字符，长度 0
        System.out.println(solution.longestCommonSubsequence("abc", "def"));
    }
}