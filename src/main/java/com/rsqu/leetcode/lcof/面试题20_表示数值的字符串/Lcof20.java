package com.rsqu.leetcode.lcof.面试题20_表示数值的字符串;

import com.rsqu.leetcode.util.TestUtil;

public class Lcof20 {
    // 题目描述：本目录 README.md。

    public boolean solution(String s) {
        // TODO：请实现解法
        return false;
    }

    public static void main(String[] args) {
        Lcof20 solution = new Lcof20();

        // 示例1
        String s1 = "0";
        Object result1 = solution.solution(s1);
        Object expected1 = true;
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        String s2 = "e";
        Object result2 = solution.solution(s2);
        Object expected2 = false;
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

        // 示例3
        String s3 = ".";
        Object result3 = solution.solution(s3);
        Object expected3 = false;
        boolean pass3 = TestUtil.isEqual(result3, expected3);
        System.out.println("示例3：" + (pass3 ? "通过" : "失败") + "，输出=" + TestUtil.format(result3) + "，期望=" + TestUtil.format(expected3));

        // 示例4
        String s4 = "    .1  ";
        Object result4 = solution.solution(s4);
        Object expected4 = true;
        boolean pass4 = TestUtil.isEqual(result4, expected4);
        System.out.println("示例4：" + (pass4 ? "通过" : "失败") + "，输出=" + TestUtil.format(result4) + "，期望=" + TestUtil.format(expected4));

    }
}
