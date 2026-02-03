package com.rsqu.leetcode.lcof2.剑指_offer_ii_017_含有所有字符的最短字符串;

import com.rsqu.leetcode.util.TestUtil;

public class Lcof2_017 {
    // 题目描述：本目录 README.md。

    public String solution(String s, String t) {
        // TODO：请实现解法
        return null;
    }

    public static void main(String[] args) {
        Lcof2_017 solution = new Lcof2_017();

        // 示例1
        String s1 = "ADOBECODEBANC";
        String t1 = "ABC";
        Object result1 = solution.solution(s1, t1);
        Object expected1 = "BANC"; // 解释:最短子字符串 "BANC" 包含了字符串 t 的所有字符 'A'、'B'、'C'"
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        String s2 = "a";
        String t2 = "a";
        Object result2 = solution.solution(s2, t2);
        Object expected2 = "a";
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

        // 示例3
        String s3 = "a";
        String t3 = "aa";
        Object result3 = solution.solution(s3, t3);
        Object expected3 = ""; // 解释:t 中两个字符 'a' 均应包含在 s 的子串中，因此没有符合条件的子字符串，返回空字符串。"
        boolean pass3 = TestUtil.isEqual(result3, expected3);
        System.out.println("示例3：" + (pass3 ? "通过" : "失败") + "，输出=" + TestUtil.format(result3) + "，期望=" + TestUtil.format(expected3));

    }
}
