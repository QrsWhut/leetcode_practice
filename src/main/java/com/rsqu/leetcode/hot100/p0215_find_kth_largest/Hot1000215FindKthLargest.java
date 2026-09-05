package com.rsqu.leetcode.hot100.p0215_find_kth_largest;

import java.util.concurrent.ThreadLocalRandom;

/**
 * 数组中的第 K 个最大元素。
 */
public class Hot1000215FindKthLargest {

    /**
     * 使用快速选择查找第 K 个最大元素。
     *
     * @param nums 整数数组
     * @param k 第 K 大
     * @return 第 K 个最大元素
     */
    public int findKthLargest(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k < 1 || k > nums.length) {
            throw new IllegalArgumentException("参数不合法");
        }

        int targetIndex = nums.length - k;
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int pivotIndex = partition(nums, left, right);
            if (pivotIndex == targetIndex) {
                return nums[pivotIndex];
            }
            if (pivotIndex < targetIndex) {
                left = pivotIndex + 1;
            } else {
                right = pivotIndex - 1;
            }
        }

        throw new IllegalStateException("无法定位第 K 大元素");
    }

    /**
     * 将基准值放到排序后的正确位置，并返回该位置下标。
     *
     * @param nums 整数数组
     * @param left 左边界
     * @param right 右边界
     * @return 基准值最终下标
     */
    private int partition(int[] nums, int left, int right) {
        int randomIndex = ThreadLocalRandom.current().nextInt(left, right + 1);
        swap(nums, randomIndex, right);

        int pivot = nums[right];
        int storeIndex = left;
        for (int index = left; index < right; index++) {
            if (nums[index] <= pivot) {
                swap(nums, storeIndex, index);
                storeIndex++;
            }
        }
        swap(nums, storeIndex, right);
        return storeIndex;
    }

    /**
     * 交换数组中两个位置的值。
     *
     * @param nums 整数数组
     * @param firstIndex 第一个下标
     * @param secondIndex 第二个下标
     */
    private void swap(int[] nums, int firstIndex, int secondIndex) {
        if (firstIndex == secondIndex) {
            return;
        }
        int temp = nums[firstIndex];
        nums[firstIndex] = nums[secondIndex];
        nums[secondIndex] = temp;
    }

    public static void main(String[] args) {
        Hot1000215FindKthLargest solution = new Hot1000215FindKthLargest();
        assert solution.findKthLargest(new int[]{3, 2, 1, 5, 6, 4}, 2) == 5;
        assert solution.findKthLargest(new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6}, 4) == 4;
    }
}
