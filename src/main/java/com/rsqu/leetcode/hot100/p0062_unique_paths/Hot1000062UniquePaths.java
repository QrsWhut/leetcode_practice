package com.rsqu.leetcode.hot100.p0062_unique_paths;

public class Hot1000062UniquePaths {

    private int[][] dp;
    public int uniquePaths(int m, int n) {
        if (m == 0 || n == 0) {
            return 0;
        }
        if (m == 1 || n == 1) {
            return 1;
        }
        dp = new int[m+1][n+1];
        int res = dp(m, n);
        return res;
    }

    private int dp(int m, int n) {
        if (m == 1 || n == 1) {
            return 1;
        }
        int up = 0, left = 0;
        if (dp[m-1][n] != 0) {
            up = dp[m-1][n];
        } else {
            up = dp(m-1, n);
            dp[m-1][n] = up;
        }
        if (dp[m][n-1] != 0) {
            left = dp[m][n-1];
        } else {
            left = dp(m, n-1);
            dp[m][n-1] = left;
        }
        return up + left;
    }

    public static void main(String[] args) {
        Hot1000062UniquePaths solution = new Hot1000062UniquePaths();
    }
}