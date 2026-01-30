package com.rsqu.leetcode.lcof.面试题50_第一个只出现一次的字符;

import com.rsqu.leetcode.util.TestUtil;

public class Lcof50 {
    // 题目描述：本目录 README.md。

    public char solution(String s) {
        // TODO：请实现解法
        return '\0';
    }

    public static void main(String[] args) {
        Lcof50 solution = new Lcof50();

        // 示例1
        String s1 = "abaccdeff";
        Object result1 = solution.solution(s1);
        Object expected1 = 'b';
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        String s2 = "";
        Object result2 = solution.solution(s2);
        Object expected2 = ' ';
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

    }
}
