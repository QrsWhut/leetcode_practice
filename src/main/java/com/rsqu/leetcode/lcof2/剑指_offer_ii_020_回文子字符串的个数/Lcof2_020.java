package com.rsqu.leetcode.lcof2.剑指_offer_ii_020_回文子字符串的个数;

import com.rsqu.leetcode.util.TestUtil;

public class Lcof2_020 {
    // 题目描述：本目录 README.md。

    public int solution(String s) {
        // TODO：请实现解法
        return 0;
    }

    public static void main(String[] args) {
        Lcof2_020 solution = new Lcof2_020();

        // 示例1
        String s1 = "abc";
        Object result1 = solution.solution(s1);
        Object expected1 = 3; // 解释:三个回文子串: "a", "b", "c"
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        String s2 = "aaa";
        Object result2 = solution.solution(s2);
        Object expected2 = 6; // 解释:6个回文子串: "a", "a", "a", "aa", "aa", "aaa"
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

    }
}
