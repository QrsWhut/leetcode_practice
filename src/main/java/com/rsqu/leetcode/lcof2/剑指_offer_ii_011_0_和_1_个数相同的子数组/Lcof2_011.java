package com.rsqu.leetcode.lcof2.剑指_offer_ii_011_0_和_1_个数相同的子数组;

import com.rsqu.leetcode.util.TestUtil;

public class Lcof2_011 {
    // 题目描述：本目录 README.md。

    public int solution(int[] nums) {
        // TODO：请实现解法
        return 0;
    }

    public static void main(String[] args) {
        Lcof2_011 solution = new Lcof2_011();

        // 示例1
        int[] nums1 = new int[]{0, 1};
        Object result1 = solution.solution(nums1);
        Object expected1 = 2; // 说明: [0, 1] 是具有相同数量 0 和 1 的最长连续子数组。
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        int[] nums2 = new int[]{0, 1, 0};
        Object result2 = solution.solution(nums2);
        // 期望输出可能包含多个结果：2 说明: [0, 1] (或 [1, 0]) 是具有相同数量 0 和 1 的最长连续子数组。
        System.out.println("示例2输出：" + TestUtil.format(result2));

    }
}
