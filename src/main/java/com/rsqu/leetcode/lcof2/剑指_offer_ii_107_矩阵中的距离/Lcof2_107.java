package com.rsqu.leetcode.lcof2.剑指_offer_ii_107_矩阵中的距离;

import com.rsqu.leetcode.util.TestUtil;

public class Lcof2_107 {
    // 题目描述：本目录 README.md。

    public int[][] solution(int[][] mat) {
        // TODO：请实现解法
        return new int[][]{};
    }

    public static void main(String[] args) {
        Lcof2_107 solution = new Lcof2_107();

        // 示例1
        int[][] mat1 = new int[][]{{0, 0, 0}, {0, 1, 0}, {0, 0, 0}};
        Object result1 = solution.solution(mat1);
        Object expected1 = new int[][]{{0, 0, 0}, {0, 1, 0}, {0, 0, 0}};
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        int[][] mat2 = new int[][]{{0, 0, 0}, {0, 1, 0}, {1, 1, 1}};
        Object result2 = solution.solution(mat2);
        Object expected2 = new int[][]{{0, 0, 0}, {0, 1, 0}, {1, 2, 1}};
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

    }
}
