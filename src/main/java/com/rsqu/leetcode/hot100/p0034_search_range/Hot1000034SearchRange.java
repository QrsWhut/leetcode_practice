package com.rsqu.leetcode.hot100.p0034_search_range;

public class Hot1000034SearchRange {

    public int[] searchRange(int[] nums, int target) {
        int first = findFirstGreaterOrEqual(nums, target);
        int firstGreater = findFirstGreater(nums, target);

        if (first == nums.length || nums[first] != target) {
            return new int[]{-1, -1};
        }

        return new int[]{first, firstGreater - 1};
    }

    /**
     * 查找第一个大于等于 target 的位置。
     *
     * @param nums 升序数组
     * @param target 目标值
     * @return 第一个大于等于 target 的下标
     */
    private int findFirstGreaterOrEqual(int[] nums, int target) {
        int left = 0;
        int right = nums.length;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] >= target) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    /**
     * 查找第一个大于 target 的位置。
     *
     * @param nums 升序数组
     * @param target 目标值
     * @return 第一个大于 target 的下标
     */
    private int findFirstGreater(int[] nums, int target) {
        int left = 0;
        int right = nums.length;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > target) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    public static void main(String[] args) {
        Hot1000034SearchRange solution = new Hot1000034SearchRange();
    }
}