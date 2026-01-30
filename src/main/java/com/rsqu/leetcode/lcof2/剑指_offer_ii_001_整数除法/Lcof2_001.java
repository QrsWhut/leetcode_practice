package com.rsqu.leetcode.lcof2.剑指_offer_ii_001_整数除法;

import com.rsqu.leetcode.util.TestUtil;

public class Lcof2_001 {
    // 题目描述：本目录 README.md。

    public int solution(int a, int b) {
        // TODO：请实现解法
        return 0;
    }

    public static void main(String[] args) {
        Lcof2_001 solution = new Lcof2_001();

        // 示例1
        int a1 = 15;
        int b1 = 2;
        Object result1 = solution.solution(a1, b1);
        Object expected1 = 7 解释:15/2 = truncate(7.5) = 7;
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        int a2 = 7;
        int b2 = -3;
        Object result2 = solution.solution(a2, b2);
        Object expected2 = -2 解释:7/-3 = truncate(-2.33333..) = -2;
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

        // 示例3
        int a3 = 0;
        int b3 = 1;
        Object result3 = solution.solution(a3, b3);
        Object expected3 = 0;
        boolean pass3 = TestUtil.isEqual(result3, expected3);
        System.out.println("示例3：" + (pass3 ? "通过" : "失败") + "，输出=" + TestUtil.format(result3) + "，期望=" + TestUtil.format(expected3));

        // 示例4
        int a4 = 1;
        int b4 = 1;
        Object result4 = solution.solution(a4, b4);
        Object expected4 = 1;
        boolean pass4 = TestUtil.isEqual(result4, expected4);
        System.out.println("示例4：" + (pass4 ? "通过" : "失败") + "，输出=" + TestUtil.format(result4) + "，期望=" + TestUtil.format(expected4));

    }
}
