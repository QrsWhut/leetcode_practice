package com.rsqu.leetcode.lcof.面试题16_数值的整数次方;

import com.rsqu.leetcode.util.TestUtil;

public class Lcof16 {
    // 题目描述：本目录 README.md。

    public double solution(double x, int n) {
        // TODO：请实现解法
        return 0.0d;
    }

    public static void main(String[] args) {
        Lcof16 solution = new Lcof16();

        // 示例1
        double x1 = 2.00000;
        int n1 = 10;
        Object result1 = solution.solution(x1, n1);
        Object expected1 = 1024.00000;
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        double x2 = 2.10000;
        int n2 = 3;
        Object result2 = solution.solution(x2, n2);
        Object expected2 = 9.26100;
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

        // 示例3
        double x3 = 2.00000;
        int n3 = -2;
        Object result3 = solution.solution(x3, n3);
        Object expected3 = 0.25000; // 解释:2-2 = 1/22 = 1/4 = 0.25
        boolean pass3 = TestUtil.isEqual(result3, expected3);
        System.out.println("示例3：" + (pass3 ? "通过" : "失败") + "，输出=" + TestUtil.format(result3) + "，期望=" + TestUtil.format(expected3));

    }
}
