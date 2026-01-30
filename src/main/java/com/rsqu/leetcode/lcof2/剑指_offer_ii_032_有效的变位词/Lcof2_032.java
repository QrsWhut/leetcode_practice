package com.rsqu.leetcode.lcof2.剑指_offer_ii_032_有效的变位词;

import com.rsqu.leetcode.util.TestUtil;

public class Lcof2_032 {
    // 题目描述：本目录 README.md。

    public boolean solution(String s, String t) {
        // TODO：请实现解法
        return false;
    }

    public static void main(String[] args) {
        Lcof2_032 solution = new Lcof2_032();

        // 示例1
        String s1 = "anagram";
        String t1 = "nagaram";
        Object result1 = solution.solution(s1, t1);
        Object expected1 = true;
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        String s2 = "rat";
        String t2 = "car";
        Object result2 = solution.solution(s2, t2);
        Object expected2 = false;
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

        // 示例3
        String s3 = "a";
        String t3 = "a";
        Object result3 = solution.solution(s3, t3);
        Object expected3 = false;
        boolean pass3 = TestUtil.isEqual(result3, expected3);
        System.out.println("示例3：" + (pass3 ? "通过" : "失败") + "，输出=" + TestUtil.format(result3) + "，期望=" + TestUtil.format(expected3));

    }
}
