package com.rsqu.leetcode.lcof2.剑指_offer_ii_095_最长公共子序列;

import com.rsqu.leetcode.util.TestUtil;

public class Lcof2_095 {
    // 题目描述：本目录 README.md。

    public int solution(String text1, String text2) {
        // TODO：请实现解法
        return 0;
    }

    public static void main(String[] args) {
        Lcof2_095 solution = new Lcof2_095();

        // 示例1
        String text11 = "abcde";
        String text21 = "ace";
        Object result1 = solution.solution(text11, text21);
        Object expected1 = 3; // 解释:最长公共子序列是 "ace" ，它的长度为 3 。
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        String text12 = "abc";
        String text22 = "abc";
        Object result2 = solution.solution(text12, text22);
        Object expected2 = 3; // 解释:最长公共子序列是 "abc" ，它的长度为 3 。
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

        // 示例3
        String text13 = "abc";
        String text23 = "def";
        Object result3 = solution.solution(text13, text23);
        Object expected3 = 0; // 解释:两个字符串没有公共子序列，返回 0 。
        boolean pass3 = TestUtil.isEqual(result3, expected3);
        System.out.println("示例3：" + (pass3 ? "通过" : "失败") + "，输出=" + TestUtil.format(result3) + "，期望=" + TestUtil.format(expected3));

    }
}
