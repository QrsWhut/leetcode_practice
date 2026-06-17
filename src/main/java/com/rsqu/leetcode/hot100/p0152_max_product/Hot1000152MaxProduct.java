package com.rsqu.leetcode.hot100.p0152_max_product;

public class Hot1000152MaxProduct {

    public int maxProduct(int[] nums) {
        int maxProduct = nums[0];
        int minProduct = nums[0];
        int result = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];
            int previousMaxProduct = maxProduct;
            int previousMinProduct = minProduct;

            maxProduct = Math.max(num, Math.max(previousMaxProduct * num, previousMinProduct * num));
            minProduct = Math.min(num, Math.min(previousMaxProduct * num, previousMinProduct * num));
            result = Math.max(result, maxProduct);
        }
        return result;
    }

    public static void main(String[] args) {
        Hot1000152MaxProduct solution = new Hot1000152MaxProduct();
    }
}
