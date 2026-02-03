package com.rsqu.leetcode.lcof2.剑指_offer_ii_101_分割等和子串;

import com.rsqu.leetcode.util.TestUtil;

public class Lcof2_101 {
    // 题目描述：本目录 README.md。

    public boolean solution(int[] nums) {
        // TODO：请实现解法
        return false;
    }

    public static void main(String[] args) {
        Lcof2_101 solution = new Lcof2_101();

        // 示例1
        int[] nums1 = new int[]{1, 5, 11, 5};
        Object result1 = solution.solution(nums1);
        Object expected1 = true; // 解释:nums 可以分割成 [1, 5, 5] 和 [11] 。
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        int[] nums2 = new int[]{1, 2, 3, 5};
        Object result2 = solution.solution(nums2);
        Object expected2 = false; // 解释:nums 不可以分为和相等的两部分
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

    }
}
