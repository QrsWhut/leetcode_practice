package com.rsqu.leetcode.lcof2.剑指_offer_ii_014_字符串中的变位词;

import com.rsqu.leetcode.util.TestUtil;

public class Lcof2_014 {
    // 题目描述：本目录 README.md。

    public boolean solution(String s1, String s2) {
        // TODO：请实现解法
        return false;
    }

    public static void main(String[] args) {
        Lcof2_014 solution = new Lcof2_014();

        // 示例1
        String s11 = "ab" s2 = "eidbaooo";
        // TODO：为 s21 设置输入
        Object result1 = solution.solution(s11, s21);
        Object expected1 = True 解释: s2 包含 s1 的排列之一 ("ba").;
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        String s12 = "ab" s2 = "eidboaoo";
        // TODO：为 s22 设置输入
        Object result2 = solution.solution(s12, s22);
        Object expected2 = False;
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

    }
}
