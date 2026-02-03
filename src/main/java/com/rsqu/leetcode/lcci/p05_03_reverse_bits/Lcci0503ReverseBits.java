package com.rsqu.leetcode.lcci.p05_03_reverse_bits;

import com.rsqu.leetcode.util.TestUtil;

public class Lcci0503ReverseBits {
    // 题目描述：本目录 README.md。

    public int solution(int num) {
        // TODO：请实现解法
        return 0;
    }

    public static void main(String[] args) {
        Lcci0503ReverseBits solution = new Lcci0503ReverseBits();

        // 示例1
        int num1 = 1775; // 11011101111
        Object result1 = solution.solution(num1);
        Object expected1 = 8;
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        int num2 = 7; // 0111
        Object result2 = solution.solution(num2);
        Object expected2 = 4;
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

    }
}
