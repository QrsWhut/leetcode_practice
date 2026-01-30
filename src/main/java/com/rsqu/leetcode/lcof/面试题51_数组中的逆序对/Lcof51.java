package com.rsqu.leetcode.lcof.面试题51_数组中的逆序对;

import com.rsqu.leetcode.util.TestUtil;

public class Lcof51 {
    // 题目描述：本目录 README.md。

    public int solution(int[] nums) {
        // TODO：请实现解法
        return 0;
    }

    public static void main(String[] args) {
        Lcof51 solution = new Lcof51();

        // 示例1
        int[] nums1 = new int[]{7, 5, 6, 4};
        Object result1 = solution.solution(nums1);
        Object expected1 = 5;
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

    }
}
