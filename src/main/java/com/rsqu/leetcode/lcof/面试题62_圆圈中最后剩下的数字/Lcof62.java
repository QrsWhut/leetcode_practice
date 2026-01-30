package com.rsqu.leetcode.lcof.面试题62_圆圈中最后剩下的数字;

import com.rsqu.leetcode.util.TestUtil;

public class Lcof62 {
    // 题目描述：本目录 README.md。

    public int solution(int n, int m) {
        // TODO：请实现解法
        return 0;
    }

    public static void main(String[] args) {
        Lcof62 solution = new Lcof62();

        // 示例1
        int n1 = 5;
        int m1 = 3;
        Object result1 = solution.solution(n1, m1);
        Object expected1 = 3;
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        int n2 = 10;
        int m2 = 17;
        Object result2 = solution.solution(n2, m2);
        Object expected2 = 2;
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

    }
}
