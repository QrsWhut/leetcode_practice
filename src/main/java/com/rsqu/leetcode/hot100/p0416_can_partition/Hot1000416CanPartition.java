package com.rsqu.leetcode.hot100.p0416_can_partition;

/**
 * 416. 分割等和子集 (Partition Equal Subset Sum)
 *
 * 0-1 背包问题入门：
 *
 * 问题转化：能否选出一些数，和恰好为 sum/2 = target
 * 每个数只能选一次（选=1，不选=0）——这就是 0-1 背包
 *
 * dp[i][j] = 前 i 个物品，能否凑出和为 j
 * 转移公式：dp[i][j] = dp[i-1][j] || dp[i-1][j - nums[i-1]]
 *   不选第 i 个：看前 i-1 个能否凑出 j
 *   选第 i 个：  看前 i-1 个能否凑出 j - nums[i-1]（前提 j >= nums[i-1]）
 */
public class Hot1000416CanPartition {

    /**
     * 二维 DP（最直观的写法，帮助理解）
     * 时间 O(n × target)，空间 O(n × target)
     */
    public boolean canPartition(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        // 总和为奇数，不可能等分
        if (sum % 2 != 0) {
            return false;
        }
        int target = sum / 2;

        // dp[i][j] = 前 i 个物品，能否凑出和为 j
        // i=0 表示一个物品都不用，只有 j=0 为 true
        boolean[][] dp = new boolean[n + 1][target + 1];
        dp[0][0] = true; // 空集凑出 0

        for (int i = 1; i <= n; i++) {
            int num = nums[i - 1]; // 第 i 个物品
            for (int j = 0; j <= target; j++) {
                // 情况 A：不选第 i 个物品
                dp[i][j] = dp[i - 1][j];

                // 情况 B：选第 i 个物品（前提能放得下）
                if (j >= num) {
                    dp[i][j] = dp[i][j] || dp[i - 1][j - num];
                }
            }
            // 提前退出
            if (dp[i][target]) {
                return true;
            }
        }
        return dp[n][target];
    }

    /**
     * 一维 DP（空间优化版）
     * dp[j] = dp[j] || dp[j - num]
     * j 必须从大到小遍历：保证 dp[j - num] 是上一轮的值，避免重复使用同一物品
     */
    public boolean canPartition1D(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        if (sum % 2 != 0) {
            return false;
        }
        int target = sum / 2;

        boolean[] dp = new boolean[target + 1];
        dp[0] = true;

        for (int num : nums) {
            for (int j = target; j >= num; j--) {
                dp[j] = dp[j] || dp[j - num];
            }
            if (dp[target]) {
                return true;
            }
        }
        return dp[target];
    }

    public static void main(String[] args) {
        Hot1000416CanPartition solution = new Hot1000416CanPartition();

        // 二维
        System.out.println(solution.canPartition(new int[]{1, 5, 11, 5})); // true
        System.out.println(solution.canPartition(new int[]{1, 2, 3, 5}));  // false

        // 一维
        System.out.println(solution.canPartition1D(new int[]{1, 5, 11, 5})); // true
        System.out.println(solution.canPartition1D(new int[]{1, 2, 3, 5}));  // false
    }
}