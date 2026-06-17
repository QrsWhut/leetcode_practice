package com.rsqu.leetcode.hot100.p0153_find_min;

public class Hot1000153FindMin {

    public int findMin(int[] nums) {
        int len = nums.length;
        if (len == 1) {
            return nums[0];
        }
        int left = 0;
        int right = len - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < nums[right]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return nums[right];
    }

    public static void main(String[] args) {
        Hot1000153FindMin solution = new Hot1000153FindMin();
    }
}