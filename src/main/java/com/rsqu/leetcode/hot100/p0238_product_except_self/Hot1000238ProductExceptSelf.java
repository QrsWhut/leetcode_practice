package com.rsqu.leetcode.hot100.p0238_product_except_self;

public class Hot1000238ProductExceptSelf {

    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        res[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            res[i] = res[i - 1] * nums[i - 1];
        }
        int right = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            res[i] *= right;
            right *= nums[i];
        }
        return null;
    }

    public static void main(String[] args) {
        Hot1000238ProductExceptSelf solution = new Hot1000238ProductExceptSelf();
    }
}