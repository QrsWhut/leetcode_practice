package com.rsqu.leetcode.lcof2.剑指_offer_ii_119_最长连续序列;

import com.rsqu.leetcode.util.TestUtil;

public class Lcof2_119 {
    // 题目描述：本目录 README.md。

    public int solution(int[] nums) {
        // TODO：请实现解法
        return 0;
    }

    public static void main(String[] args) {
        Lcof2_119 solution = new Lcof2_119();

        // 示例1
        int[] nums1 = new int[]{100, 4, 200, 1, 3, 2};
        Object result1 = solution.solution(nums1);
        Object expected1 = 4; // 解释:最长数字连续序列是 [1, 2, 3, 4]。它的长度为 4。
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        int[] nums2 = new int[]{0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
        Object result2 = solution.solution(nums2);
        Object expected2 = 9;
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

    }
}
