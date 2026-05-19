package com.rsqu.leetcode.hot100.p0072_min_distance;

public class Hot1000072MinDistance {

    public int minDistance(String word1, String word2) {
        int m = word1.length(), n = word2.length();
        int[][] dp = new int[m + 1][n + 1];
        // 边界：word1前i个字符 -> 空串，需要i次删除
        for (int i = 1; i <= m; i++) dp[i][0] = i;
        // 边界：空串 -> word2前j个字符，需要j次插入
        for (int j = 1; j <= n; j++) dp[0][j] = j;
        // 填表
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.min(dp[i - 1][j - 1],
                               Math.min(dp[i - 1][j], dp[i][j - 1])) + 1;
                }
            }
        }
        return dp[m][n];
    }

    public static void main(String[] args) {
        Hot1000072MinDistance solution = new Hot1000072MinDistance();
    }
}