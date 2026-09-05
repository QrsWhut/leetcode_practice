package com.rsqu.leetcode.hot100.p0300_length_of_lis;

import java.util.Arrays;

/**
 * 300. 最长递增子序列 (Longest Increasing Subsequence)
 *
 * 关键区分：子序列 vs 子数组
 * - 子序列：可以跳过元素，不要求连续 → 滑动窗口不可用
 * - 子数组：要求连续 → 滑动窗口适用
 *
 * 解法一：DP O(n²)
 *   dp[i] = 以 nums[i] 结尾的最长递增子序列长度
 *   dp[i] = max(dp[j] + 1) 对所有 j < i 且 nums[j] < nums[i]
 *
 * 解法二：贪心+二分 O(n log n) — 纸牌耐心排序
 *   维护 tails 数组，tails[len] = 长度为 len+1 的递增子序列的最小末尾值
 *   遍历 nums，二分查找 tails 中第一个 >= num 的位置并替换
 */
public class Hot1000300LengthOfLIS {

    /**
     * DP 解法：O(n²) / O(n)
     */
    public int lengthOfLIS_dp(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        int maxLen = 1;
        // 每个元素自身至少构成长度为 1 的子序列
        Arrays.fill(dp, 1);

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            maxLen = Math.max(maxLen, dp[i]);
        }
        return maxLen;
    }

    /**
     * 贪心+二分（耐心排序）解法：O(n log n) / O(n)
     *
     * tails 数组的长度就是 LIS 的长度。
     * tails[i] 含义：长度为 i+1 的所有递增子序列中，末尾元素最小的那个值。
     */
    public int lengthOfLIS(int[] nums) {
        int[] tails = new int[nums.length];
        int len = 0; // tails 当前有效长度，也即 LIS 长度

        for (int num : nums) {
            // 二分查找 tails[0..len) 中第一个 >= num 的位置
            int left = 0, right = len;
            while (left < right) {
                int mid = left + (right - left) / 2;
                if (tails[mid] < num) {
                    left = mid + 1;
                } else {
                    right = mid;
                }
            }
            // 替换或追加
            tails[left] = num;
            // 如果 left == len，说明 num 比所有 tails 元素都大，扩展长度
            if (left == len) {
                len++;
            }
        }
        return len;
    }

    public static void main(String[] args) {
        Hot1000300LengthOfLIS solution = new Hot1000300LengthOfLIS();

        // 示例 1
        int[] nums1 = {10, 9, 2, 5, 3, 7, 101, 18};
        System.out.println(solution.lengthOfLIS(nums1)); // 4 → [2,3,7,101]

        // 示例 2
        int[] nums2 = {0, 1, 0, 3, 2, 3};
        System.out.println(solution.lengthOfLIS(nums2)); // 4 → [0,1,2,3]

        // 示例 3
        int[] nums3 = {7, 7, 7, 7, 7, 7, 7};
        System.out.println(solution.lengthOfLIS(nums3)); // 1
    }
}