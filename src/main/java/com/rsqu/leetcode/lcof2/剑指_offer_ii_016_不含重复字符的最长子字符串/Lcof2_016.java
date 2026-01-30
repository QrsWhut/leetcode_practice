package com.rsqu.leetcode.lcof2.剑指_offer_ii_016_不含重复字符的最长子字符串;

import com.rsqu.leetcode.util.TestUtil;

public class Lcof2_016 {
    // 题目描述：本目录 README.md。

    public int solution(String s) {
        // TODO：请实现解法
        return 0;
    }

    public static void main(String[] args) {
        Lcof2_016 solution = new Lcof2_016();

        // 示例1
        String s1 = "abcabcbb";
        Object result1 = solution.solution(s1);
        Object expected1 = 3 解释: 因为无重复字符的最长子字符串是 "abc"，所以其长度为 3。;
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        String s2 = "bbbbb";
        Object result2 = solution.solution(s2);
        Object expected2 = 1 解释: 因为无重复字符的最长子字符串是 "b"，所以其长度为 1。;
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

        // 示例3
        String s3 = "pwwkew";
        Object result3 = solution.solution(s3);
        Object expected3 = 3 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。 请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。;
        boolean pass3 = TestUtil.isEqual(result3, expected3);
        System.out.println("示例3：" + (pass3 ? "通过" : "失败") + "，输出=" + TestUtil.format(result3) + "，期望=" + TestUtil.format(expected3));

        // 示例4
        String s4 = "";
        Object result4 = solution.solution(s4);
        Object expected4 = 0;
        boolean pass4 = TestUtil.isEqual(result4, expected4);
        System.out.println("示例4：" + (pass4 ? "通过" : "失败") + "，输出=" + TestUtil.format(result4) + "，期望=" + TestUtil.format(expected4));

    }
}
