package com.rsqu.leetcode.lcof2.剑指_offer_ii_002_二进制加法;

import com.rsqu.leetcode.util.TestUtil;

public class Lcof2_002 {
    // 题目描述：本目录 README.md。

    public String solution(String a, String b) {
        // TODO：请实现解法
        return null;
    }

    public static void main(String[] args) {
        Lcof2_002 solution = new Lcof2_002();

        // 示例1
        String a1 = "11";
        String b1 = "10";
        Object result1 = solution.solution(a1, b1);
        Object expected1 = "101";
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        String a2 = "1010";
        String b2 = "1011";
        Object result2 = solution.solution(a2, b2);
        Object expected2 = "10101";
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

    }
}
