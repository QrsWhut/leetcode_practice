package com.rsqu.leetcode.lcof2.剑指_offer_ii_070_排序数组中只出现一次的数字;

import com.rsqu.leetcode.util.TestUtil;

public class Lcof2_070 {
    // 题目描述：本目录 README.md。

    public int solution(int[] nums) {
        // TODO：请实现解法
        return 0;
    }

    public static void main(String[] args) {
        Lcof2_070 solution = new Lcof2_070();

        // 示例1
        int[] nums1 = new int[]{1, 1, 2, 3, 3, 4, 4, 8, 8};
        Object result1 = solution.solution(nums1);
        Object expected1 = 2;
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        int[] nums2 = new int[]{3, 3, 7, 7, 10, 11, 11};
        Object result2 = solution.solution(nums2);
        Object expected2 = 10;
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

    }
}
