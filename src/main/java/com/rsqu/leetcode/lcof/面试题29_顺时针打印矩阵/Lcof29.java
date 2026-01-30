package com.rsqu.leetcode.lcof.面试题29_顺时针打印矩阵;

import com.rsqu.leetcode.util.TestUtil;

public class Lcof29 {
    // 题目描述：本目录 README.md。

    public int[] solution(int[][] matrix) {
        // TODO：请实现解法
        return new int[]{};
    }

    public static void main(String[] args) {
        Lcof29 solution = new Lcof29();

        // 示例1
        int[][] matrix1 = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        Object result1 = solution.solution(matrix1);
        Object expected1 = new int[]{1, 2, 3, 6, 9, 8, 7, 4, 5};
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        int[][] matrix2 = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        Object result2 = solution.solution(matrix2);
        Object expected2 = new int[]{1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7};
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

    }
}
