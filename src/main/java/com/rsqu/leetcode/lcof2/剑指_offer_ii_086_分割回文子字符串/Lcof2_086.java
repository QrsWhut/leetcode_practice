package com.rsqu.leetcode.lcof2.剑指_offer_ii_086_分割回文子字符串;

import java.util.*;
import com.rsqu.leetcode.util.TestUtil;

public class Lcof2_086 {
    // 题目描述：本目录 README.md。

    public List<List<String>> solution(String s) {
        // TODO：请实现解法
        return null;
    }

    public static void main(String[] args) {
        Lcof2_086 solution = new Lcof2_086();

        // 示例1
        String s1 = "google";
        Object result1 = solution.solution(s1);
        Object expected1 = java.util.Arrays.asList(java.util.Arrays.asList("g", "o", "o", "g", "l", "e"), java.util.Arrays.asList("g", "oo", "g", "l", "e"), java.util.Arrays.asList("goog", "l", "e"));
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        String s2 = "aab";
        Object result2 = solution.solution(s2);
        Object expected2 = java.util.Arrays.asList(java.util.Arrays.asList("a", "a", "b"), java.util.Arrays.asList("aa", "b"));
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

        // 示例3
        String s3 = "a";
        Object result3 = solution.solution(s3);
        // // TODO：请补充期望输出：[["a"]
        System.out.println("示例3输出：" + TestUtil.format(result3));

    }
}
