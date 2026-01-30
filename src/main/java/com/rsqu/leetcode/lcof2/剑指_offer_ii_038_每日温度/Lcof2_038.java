package com.rsqu.leetcode.lcof2.剑指_offer_ii_038_每日温度;

import com.rsqu.leetcode.util.TestUtil;

public class Lcof2_038 {
    // 题目描述：本目录 README.md。

    public int[] solution(int[] temperatures) {
        // TODO：请实现解法
        return new int[]{};
    }

    public static void main(String[] args) {
        Lcof2_038 solution = new Lcof2_038();

        // 示例1
        int[] temperatures1 = new int[]{73, 74, 75, 71, 69, 72, 76, 73};
        Object result1 = solution.solution(temperatures1);
        Object expected1 = new int[]{1, 1, 4, 2, 1, 1, 0, 0};
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        int[] temperatures2 = new int[]{30, 40, 50, 60};
        Object result2 = solution.solution(temperatures2);
        Object expected2 = new int[]{1, 1, 1, 0};
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

        // 示例3
        int[] temperatures3 = new int[]{30, 60, 90};
        Object result3 = solution.solution(temperatures3);
        Object expected3 = new int[]{1, 1, 0};
        boolean pass3 = TestUtil.isEqual(result3, expected3);
        System.out.println("示例3：" + (pass3 ? "通过" : "失败") + "，输出=" + TestUtil.format(result3) + "，期望=" + TestUtil.format(expected3));

    }
}
