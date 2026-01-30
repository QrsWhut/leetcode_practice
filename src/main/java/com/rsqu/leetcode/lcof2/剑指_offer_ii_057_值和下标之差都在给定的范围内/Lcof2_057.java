package com.rsqu.leetcode.lcof2.剑指_offer_ii_057_值和下标之差都在给定的范围内;

import com.rsqu.leetcode.util.TestUtil;

public class Lcof2_057 {
    // 题目描述：本目录 README.md。

    public boolean solution(int[] nums, int k, int t) {
        // TODO：请实现解法
        return false;
    }

    public static void main(String[] args) {
        Lcof2_057 solution = new Lcof2_057();

        // 示例1
        int[] nums1 = new int[]{1, 2, 3, 1};
        int k1 = 3;
        int t1 = 0;
        Object result1 = solution.solution(nums1, k1, t1);
        Object expected1 = true;
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        int[] nums2 = new int[]{1, 0, 1, 1};
        int k2 = 1;
        int t2 = 2;
        Object result2 = solution.solution(nums2, k2, t2);
        Object expected2 = true;
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

        // 示例3
        int[] nums3 = new int[]{1, 5, 9, 1, 5, 9};
        int k3 = 2;
        int t3 = 3;
        Object result3 = solution.solution(nums3, k3, t3);
        Object expected3 = false;
        boolean pass3 = TestUtil.isEqual(result3, expected3);
        System.out.println("示例3：" + (pass3 ? "通过" : "失败") + "，输出=" + TestUtil.format(result3) + "，期望=" + TestUtil.format(expected3));

    }
}
