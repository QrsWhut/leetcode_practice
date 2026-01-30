package com.rsqu.leetcode.lcof2.剑指_offer_ii_118_多余的边;

import com.rsqu.leetcode.util.TestUtil;

public class Lcof2_118 {
    // 题目描述：本目录 README.md。

    public int[] solution(int[][] edges) {
        // TODO：请实现解法
        return new int[]{};
    }

    public static void main(String[] args) {
        Lcof2_118 solution = new Lcof2_118();

        // 示例1
        int[][] edges1 = new int[][]{{1, 2}, {1, 3}, {2, 3}};
        Object result1 = solution.solution(edges1);
        Object expected1 = new int[]{2, 3};
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        int[][] edges2 = new int[][]{{1, 2}, {2, 3}, {3, 4}, {1, 4}, {1, 5}};
        Object result2 = solution.solution(edges2);
        Object expected2 = new int[]{1, 4};
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

    }
}
