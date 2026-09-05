package com.rsqu.leetcode.hot100.p0035_search_insert;

public class Hot1000035SearchInsert {

    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length;
        while (left < right){
            int mid = left + (right - left) /2;
            if (nums[mid] >= target){
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        Hot1000035SearchInsert solution = new Hot1000035SearchInsert();
    }
}