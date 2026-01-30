package com.rsqu.leetcode.lcof2.剑指_offer_ii_009_乘积小于_k_的子数组;

import com.rsqu.leetcode.util.TestUtil;

public class Lcof2_009 {
    // 题目描述：本目录 README.md。

    public int solution(int[] nums, int k) {
        // TODO：请实现解法
        return 0;
    }

    public static void main(String[] args) {
        Lcof2_009 solution = new Lcof2_009();

        // 示例1
        int[] nums1 = new int[]{10, 5, 2, 6};
        int k1 = 100;
        Object result1 = solution.solution(nums1, k1);
        Object expected1 = 8 解释: 8 个乘积小于 100 的子数组分别为: [10], [5], [2], [6], [10,5], [5,2], [2,6], [5,2,6]。 需要注意的是 [10,5,2] 并不是乘积小于100的子数组。;
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        int[] nums2 = new int[]{1, 2, 3};
        int k2 = 0;
        Object result2 = solution.solution(nums2, k2);
        Object expected2 = 0;
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

    }
}
