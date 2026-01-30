package com.rsqu.leetcode.lcof.面试题13_机器人的运动范围;

import com.rsqu.leetcode.util.TestUtil;

public class Lcof13 {
    // 题目描述：本目录 README.md。

    public int solution(int m, int n, int k) {
        // TODO：请实现解法
        return 0;
    }

    public static void main(String[] args) {
        Lcof13 solution = new Lcof13();

        // 示例1
        int m1 = 2;
        int n1 = 3;
        int k1 = 1;
        Object result1 = solution.solution(m1, n1, k1);
        Object expected1 = 3;
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        int m2 = 3;
        int n2 = 1;
        int k2 = 0;
        Object result2 = solution.solution(m2, n2, k2);
        Object expected2 = 1;
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

    }
}
