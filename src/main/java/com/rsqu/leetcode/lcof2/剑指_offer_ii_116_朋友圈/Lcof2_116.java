package com.rsqu.leetcode.lcof2.剑指_offer_ii_116_朋友圈;

import com.rsqu.leetcode.util.TestUtil;

public class Lcof2_116 {
    // 题目描述：本目录 README.md。

    public int solution(int[][] isConnected) {
        // TODO：请实现解法
        return 0;
    }

    public static void main(String[] args) {
        Lcof2_116 solution = new Lcof2_116();

        // 示例1
        int[][] isConnected1 = new int[][]{{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};
        Object result1 = solution.solution(isConnected1);
        Object expected1 = 2;
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        int[][] isConnected2 = new int[][]{{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};
        Object result2 = solution.solution(isConnected2);
        Object expected2 = 3;
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

    }
}
