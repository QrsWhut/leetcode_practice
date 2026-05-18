package com.rsqu.leetcode.hot100.p0070_climb_stairs;

public class Hot1000070ClimbStairs {

    public int climbStairs(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }

    public static void main(String[] args) {
        Hot1000070ClimbStairs solution = new Hot1000070ClimbStairs();
    }
}