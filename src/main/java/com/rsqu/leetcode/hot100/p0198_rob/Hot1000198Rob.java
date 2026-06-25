package com.rsqu.leetcode.hot100.p0198_rob;

public class Hot1000198Rob {

    public int rob(int[] nums) {
        int[][] dp = new int[nums.length][2];
        dp[0][0] = 0;
        dp[0][1] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            dp[i][0] = Math.max(dp[i-1][0], dp[i-1][1]);
            dp[i][1] = dp[i-1][0] + nums[i];
        }
        return Math.max(dp[nums.length-1][0], dp[nums.length-1][1]);
    }

    public static void main(String[] args) {
        Hot1000198Rob solution = new Hot1000198Rob();
    }
}