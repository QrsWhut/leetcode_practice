package com.rsqu.leetcode.lcci.p05_01_insert_into_bits;

import com.rsqu.leetcode.util.TestUtil;

public class Lcci0501InsertIntoBits {
    // 题目描述：本目录 README.md。

    public int solution(int n, int m, int i, int j) {
        // TODO：请实现解法
        return 0;
    }

    public static void main(String[] args) {
        Lcci0501InsertIntoBits solution = new Lcci0501InsertIntoBits();

        // 示例1
        int n1 = 10000000000;
        int m1 = 10011;
        int i1 = 2;
        int j1 = 6;
        Object result1 = solution.solution(n1, m1, i1, j1);
        Object expected1 = N = 10001001100;
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        int n2 = 0;
        int m2 = 11111;
        int i2 = 0;
        int j2 = 4;
        Object result2 = solution.solution(n2, m2, i2, j2);
        Object expected2 = N = 11111;
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

    }
}
