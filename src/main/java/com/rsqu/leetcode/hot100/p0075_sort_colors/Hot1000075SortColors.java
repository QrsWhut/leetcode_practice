package com.rsqu.leetcode.hot100.p0075_sort_colors;

public class Hot1000075SortColors {

    public void sortColors(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int i = 0;
        while (i <= right) {
            if (nums[i] == 0) {
                nums[i] = nums[left];
                nums[left] = 0;
                left++;
                i++;
            } else if (nums[i] == 2) {
                nums[i] = nums[right];
                nums[right] = 2;
                right--;
            } else {
                i++;
            }
        }
    }

    public static void main(String[] args) {
        Hot1000075SortColors solution = new Hot1000075SortColors();
    }
}