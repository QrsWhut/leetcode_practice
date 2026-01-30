package com.rsqu.leetcode.lcof.面试题38_字符串的排列;

import com.rsqu.leetcode.util.TestUtil;

public class Lcof38 {
    // 题目描述：本目录 README.md。

    public String[] solution(String s) {
        // TODO：请实现解法
        return new String[]{};
    }

    public static void main(String[] args) {
        Lcof38 solution = new Lcof38();

        // 示例1
        String s1 = "abc";
        Object result1 = solution.solution(s1);
        Object expected1 = new String[]{"abc", "acb", "bac", "bca", "cab", "cba"};
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

    }
}
