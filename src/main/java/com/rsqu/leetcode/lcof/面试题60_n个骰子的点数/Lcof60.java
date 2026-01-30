package com.rsqu.leetcode.lcof.面试题60_n个骰子的点数;

import com.rsqu.leetcode.util.TestUtil;

public class Lcof60 {
    // 题目描述：本目录 README.md。

    public double[] solution(int n) {
        // TODO：请实现解法
        return new double[]{};
    }

    public static void main(String[] args) {
        Lcof60 solution = new Lcof60();

        // 示例1
        int n1 = 1;
        Object result1 = solution.solution(n1);
        Object expected1 = new double[]{0.16667, 0.16667, 0.16667, 0.16667, 0.16667, 0.16667};
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        int n2 = 2;
        Object result2 = solution.solution(n2);
        Object expected2 = new double[]{0.02778, 0.05556, 0.08333, 0.11111, 0.13889, 0.16667, 0.13889, 0.11111, 0.08333, 0.05556, 0.02778};
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

    }
}
