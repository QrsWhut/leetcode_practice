package com.rsqu.leetcode.lcof2.剑指_offer_ii_060_出现频率最高的_k_个数字;

import com.rsqu.leetcode.util.TestUtil;

public class Lcof2_060 {
    // 题目描述：本目录 README.md。

    public int[] solution(int[] nums, int k) {
        // TODO：请实现解法
        return new int[]{};
    }

    public static void main(String[] args) {
        Lcof2_060 solution = new Lcof2_060();

        // 示例1
        int[] nums1 = new int[]{1, 1, 1, 2, 2, 3};
        int k1 = 2;
        Object result1 = solution.solution(nums1, k1);
        Object expected1 = new int[]{1, 2};
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        int[] nums2 = new int[]{1};
        int k2 = 1;
        Object result2 = solution.solution(nums2, k2);
        Object expected2 = new int[]{1};
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

    }
}
