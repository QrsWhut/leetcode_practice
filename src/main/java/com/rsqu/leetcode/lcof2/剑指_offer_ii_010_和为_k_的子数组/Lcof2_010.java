package com.rsqu.leetcode.lcof2.剑指_offer_ii_010_和为_k_的子数组;

import com.rsqu.leetcode.util.TestUtil;

public class Lcof2_010 {
    // 题目描述：本目录 README.md。

    public int solution(int[] nums, int k) {
        // TODO：请实现解法
        return 0;
    }

    public static void main(String[] args) {
        Lcof2_010 solution = new Lcof2_010();

        // 示例1
        int[] nums1 = new int[]{1, 1, 1};
        int k1 = 2;
        Object result1 = solution.solution(nums1, k1);
        Object expected1 = 2; // 解释: 此题 [1,1] 与 [1,1] 为两种不同的情况
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        int[] nums2 = new int[]{1, 2, 3};
        int k2 = 3;
        Object result2 = solution.solution(nums2, k2);
        Object expected2 = 2;
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

    }
}
