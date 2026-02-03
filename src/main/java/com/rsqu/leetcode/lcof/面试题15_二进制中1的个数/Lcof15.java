package com.rsqu.leetcode.lcof.面试题15_二进制中1的个数;

import com.rsqu.leetcode.util.TestUtil;

public class Lcof15 {
    // 题目描述：本目录 README.md。

    public int solution(int n) {
        // TODO：请实现解法
        return 0;
    }

    public static void main(String[] args) {
        Lcof15 solution = new Lcof15();

        // 示例1
        int n1 = 11; // 控制台输入 00000000000000000000000000001011
        Object result1 = solution.solution(n1);
        Object expected1 = 3; // 解释:输入的二进制串 00000000000000000000000000001011 中，共有三位为 '1'。
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        int n2 = 128; // 控制台输入 00000000000000000000000010000000
        Object result2 = solution.solution(n2);
        Object expected2 = 1; // 解释:输入的二进制串 00000000000000000000000010000000 中，共有一位为 '1'。
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

        // 示例3
        int n3 = -3; // 控制台输入 11111111111111111111111111111101，部分语言中 n = -3
        Object result3 = solution.solution(n3);
        Object expected3 = 31; // 解释:输入的二进制串 11111111111111111111111111111101 中，共有 31 位为 '1'。
        boolean pass3 = TestUtil.isEqual(result3, expected3);
        System.out.println("示例3：" + (pass3 ? "通过" : "失败") + "，输出=" + TestUtil.format(result3) + "，期望=" + TestUtil.format(expected3));

    }
}
