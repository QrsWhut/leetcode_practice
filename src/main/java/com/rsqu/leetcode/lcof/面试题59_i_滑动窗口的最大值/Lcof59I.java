package com.rsqu.leetcode.lcof.面试题59_i_滑动窗口的最大值;

import com.rsqu.leetcode.util.TestUtil;

public class Lcof59I {
    // 题目描述：本目录 README.md。

    public int[] solution(int[] nums, int k) {
        // TODO：请实现解法
        return new int[]{};
    }

    public static void main(String[] args) {
        Lcof59I solution = new Lcof59I();

        // 示例1
        int[] nums1 = new int[]{1, 3, -1, -3, 5, 3, 6, 7};
        int k1 = 3;
        Object result1 = solution.solution(nums1, k1);
        Object expected1 = java.util.Arrays.asList(3,3,5,5,6,7); // 解释: 滑动窗口的位置                最大值 ---------------               ----- [1  3  -1] -3  5  3  6  7       3 1 [3  -1  -3] 5  3  6  7       3 1  3 [-1  -3  5] 3  6  7       5 1  3  -1 [-3  5  3] 6  7       5 1  3  -1  -3 [5  3  6] 7       6 1  3  -1  -3  5 [3  6  7]      7
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

    }
}
