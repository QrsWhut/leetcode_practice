package com.rsqu.leetcode.lcci.p16_26_calculator;

import com.rsqu.leetcode.util.TestUtil;

public class Lcci1626Calculator {
    // 题目描述：本目录 README.md。

    public int solution(String s) {
        // TODO：请实现解法
        return 0;
    }

    public static void main(String[] args) {
        Lcci1626Calculator solution = new Lcci1626Calculator();

        // 示例1
        String s1 = "3+2*2";
        Object result1 = solution.solution(s1);
        Object expected1 = 7;
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        String s2 = " 3/2 ";
        Object result2 = solution.solution(s2);
        Object expected2 = 1;
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

        // 示例3
        String s3 = " 3+5 / 2 ";
        Object result3 = solution.solution(s3);
        Object expected3 = 5;
        boolean pass3 = TestUtil.isEqual(result3, expected3);
        System.out.println("示例3：" + (pass3 ? "通过" : "失败") + "，输出=" + TestUtil.format(result3) + "，期望=" + TestUtil.format(expected3));

    }
}
