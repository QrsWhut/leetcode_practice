package com.rsqu.leetcode.lcof2.剑指_offer_ii_085_生成匹配的括号;

import java.util.*;
import com.rsqu.leetcode.util.TestUtil;

public class Lcof2_085 {
    // 题目描述：本目录 README.md。

    public List<String> solution(int n) {
        // TODO：请实现解法
        return null;
    }

    public static void main(String[] args) {
        Lcof2_085 solution = new Lcof2_085();

        // 示例1
        int n1 = 3;
        Object result1 = solution.solution(n1);
        Object expected1 = java.util.Arrays.asList("((()))", "(()())", "(())()", "()(())", "()()()");
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        int n2 = 1;
        Object result2 = solution.solution(n2);
        Object expected2 = java.util.Arrays.asList("()");
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

    }
}
