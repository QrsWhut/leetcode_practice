package com.rsqu.leetcode.lcof.面试题45_把数组排成最小的数;

import com.rsqu.leetcode.util.TestUtil;

public class Lcof45 {
    // 题目描述：本目录 README.md。

    public String solution(int[] nums) {
        // TODO：请实现解法
        return null;
    }

    public static void main(String[] args) {
        Lcof45 solution = new Lcof45();

        // 示例1
        int[] nums1 = new int[]{10, 2};
        Object result1 = solution.solution(nums1);
        Object expected1 = "102";
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        int[] nums2 = new int[]{3, 30, 34, 5, 9};
        Object result2 = solution.solution(nums2);
        Object expected2 = "3033459";
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

    }
}
