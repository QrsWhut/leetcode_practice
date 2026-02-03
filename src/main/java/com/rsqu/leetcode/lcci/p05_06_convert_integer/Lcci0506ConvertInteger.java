package com.rsqu.leetcode.lcci.p05_06_convert_integer;

import com.rsqu.leetcode.util.TestUtil;

public class Lcci0506ConvertInteger {
    // 题目描述：本目录 README.md。

    public int solution(int a, int b) {
        // TODO：请实现解法
        return 0;
    }

    public static void main(String[] args) {
        Lcci0506ConvertInteger solution = new Lcci0506ConvertInteger();

        // 示例1
        int a1 = 29; // 或者 0b11101
        int b1 = 15; // 或者 0b01111
        Object result1 = solution.solution(a1, b1);
        Object expected1 = 2;
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        int a2 = 1;
        int b2 = 2;
        Object result2 = solution.solution(a2, b2);
        Object expected2 = 2;
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

    }
}
