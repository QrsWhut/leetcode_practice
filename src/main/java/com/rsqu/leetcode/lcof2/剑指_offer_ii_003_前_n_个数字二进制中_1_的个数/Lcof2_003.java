package com.rsqu.leetcode.lcof2.剑指_offer_ii_003_前_n_个数字二进制中_1_的个数;

import com.rsqu.leetcode.util.TestUtil;

public class Lcof2_003 {
    // 题目描述：本目录 README.md。

    public int[] solution(int n) {
        // TODO：请实现解法
        return new int[]{};
    }

    public static void main(String[] args) {
        Lcof2_003 solution = new Lcof2_003();

        // 示例1
        int n1 = 2;
        Object result1 = solution.solution(n1);
        Object expected1 = java.util.Arrays.asList(0,1,1); // 解释: 0 --> 0 1 --> 1 2 --> 10
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        int n2 = 5;
        Object result2 = solution.solution(n2);
        Object expected2 = java.util.Arrays.asList(0,1,1,2,1,2); // 解释: 0 --> 0 1 --> 1 2 --> 10 3 --> 11 4 --> 100 5 --> 101
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

    }
}
