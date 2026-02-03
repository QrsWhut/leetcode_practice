package com.rsqu.leetcode.lcof.面试题61_扑克牌中的顺子;

import com.rsqu.leetcode.util.TestUtil;

public class Lcof61 {
    // 题目描述：本目录 README.md。

    public boolean solution(int[] nums) {
        // TODO：请实现解法
        return false;
    }

    public static void main(String[] args) {
        Lcof61 solution = new Lcof61();

        // 示例1
        int[] nums1 = new int[]{1, 2, 3, 4, 5};
        Object result1 = solution.solution(nums1);
        Object expected1 = true;
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        int[] nums2 = new int[]{0, 0, 1, 2, 5};
        Object result2 = solution.solution(nums2);
        Object expected2 = true;
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

    }
}
