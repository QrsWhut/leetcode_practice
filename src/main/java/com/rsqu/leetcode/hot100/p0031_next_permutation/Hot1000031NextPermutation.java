package com.rsqu.leetcode.hot100.p0031_next_permutation;

public class Hot1000031NextPermutation {

    public void nextPermutation(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return;
        }

        int index = nums.length - 2;
        while (index >= 0 && nums[index] >= nums[index + 1]) {
            index--;
        }

        if (index >= 0) {
            int biggerIndex = nums.length - 1;
            while (nums[biggerIndex] <= nums[index]) {
                biggerIndex--;
            }
            swap(nums, index, biggerIndex);
        }

        reverse(nums, index + 1, nums.length - 1);
    }

    private void reverse(int[] nums, int left, int right) {
        while (left < right) {
            swap(nums, left, right);
            left++;
            right--;
        }
    }

    private void swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }

    public static void main(String[] args) {
        Hot1000031NextPermutation solution = new Hot1000031NextPermutation();
    }
}
