package com.rsqu.leetcode.hot100.p0053_max_sub_array;

public class Hot1000053MaxSubArray {

    public int maxSubArray(int[] nums) {
        int curMax = nums[0];
        int maxSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            curMax = Math.max(curMax + nums[i], nums[i]);
            maxSum = Math.max(maxSum, curMax);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        Hot1000053MaxSubArray solution = new Hot1000053MaxSubArray();
    }
}