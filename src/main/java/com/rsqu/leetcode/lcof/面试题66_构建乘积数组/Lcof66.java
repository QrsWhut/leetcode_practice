package com.rsqu.leetcode.lcof.面试题66_构建乘积数组;

import com.rsqu.leetcode.util.TestUtil;

public class Lcof66 {
    // 题目描述：本目录 README.md。

    public int[] solution(int[] a) {
        // TODO：请实现解法
        return new int[]{};
    }

    public static void main(String[] args) {
        Lcof66 solution = new Lcof66();

        // 示例1
        int[] a1 = new int[]{1, 2, 3, 4, 5};
        Object result1 = solution.solution(a1);
        Object expected1 = new int[]{120, 60, 40, 30, 24};
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

    }
}
