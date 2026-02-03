package com.rsqu.leetcode.lcof2.剑指_offer_ii_091_粉刷房子;

import com.rsqu.leetcode.util.TestUtil;

public class Lcof2_091 {
    // 题目描述：本目录 README.md。

    public int solution(int[][] costs) {
        // TODO：请实现解法
        return 0;
    }

    public static void main(String[] args) {
        Lcof2_091 solution = new Lcof2_091();

        // 示例1
        int[][] costs1 = new int[][]{{17, 2, 17}, {16, 16, 5}, {14, 3, 19}};
        Object result1 = solution.solution(costs1);
        Object expected1 = 10; // 解释: 将 0 号房子粉刷成蓝色，1 号房子粉刷成绿色，2 号房子粉刷成蓝色。 最少花费: 2 + 5 + 3 = 10。
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        int[][] costs2 = new int[][]{{7, 6, 2}};
        Object result2 = solution.solution(costs2);
        Object expected2 = 2;
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

    }
}
