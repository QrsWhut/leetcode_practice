package com.rsqu.leetcode.hot100.p0136_single_number;

public class Hot1000136SingleNumber {

    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }

    public static void main(String[] args) {
        Hot1000136SingleNumber solution = new Hot1000136SingleNumber();
    }
}
