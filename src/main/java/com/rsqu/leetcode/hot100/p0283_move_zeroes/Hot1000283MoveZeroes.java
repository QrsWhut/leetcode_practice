package com.rsqu.leetcode.hot100.p0283_move_zeroes;

import static org.apache.commons.lang3.ArrayUtils.swap;

public class Hot1000283MoveZeroes {

    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = 0;
        while (right < n) {
            if (nums[right] != 0) {
                if (left != right) {
                    swap(nums, left, right);
                }
                left++;
            }
            right++;
        }
    }

    public static void main(String[] args) {
        Hot1000283MoveZeroes solution = new Hot1000283MoveZeroes();
    }
}