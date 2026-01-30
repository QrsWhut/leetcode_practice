package com.rsqu.leetcode.lcof2.剑指_offer_ii_096_字符串交织;

import com.rsqu.leetcode.util.TestUtil;

public class Lcof2_096 {
    // 题目描述：本目录 README.md。

    public boolean solution(String s1, String s2, String s3) {
        // TODO：请实现解法
        return false;
    }

    public static void main(String[] args) {
        Lcof2_096 solution = new Lcof2_096();

        // 示例1
        String s11 = "aabcc";
        String s21 = "dbbca";
        String s31 = "aadbbcbcac";
        Object result1 = solution.solution(s11, s21, s31);
        Object expected1 = true;
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        String s12 = "aabcc";
        String s22 = "dbbca";
        String s32 = "aadbbbaccc";
        Object result2 = solution.solution(s12, s22, s32);
        Object expected2 = false;
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

        // 示例3
        String s13 = "";
        String s23 = "";
        String s33 = "";
        Object result3 = solution.solution(s13, s23, s33);
        Object expected3 = true;
        boolean pass3 = TestUtil.isEqual(result3, expected3);
        System.out.println("示例3：" + (pass3 ? "通过" : "失败") + "，输出=" + TestUtil.format(result3) + "，期望=" + TestUtil.format(expected3));

    }
}
