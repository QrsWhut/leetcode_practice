package com.rsqu.leetcode.lcci.p17_23_max_black_square;

import com.rsqu.leetcode.util.TestUtil;

public class Lcci1723MaxBlackSquare {
    // 题目描述：本目录 README.md。

    public int[] solution(int[][] matrix) {
        // TODO：请实现解法
        return new int[]{};
    }

    public static void main(String[] args) {
        Lcci1723MaxBlackSquare solution = new Lcci1723MaxBlackSquare();

        // 示例1
        int[][] matrix1 = new int[][]{{1, 0, 1}, {0, 0, 1}, {0, 0, 1}};
        Object result1 = solution.solution(matrix1);
        Object expected1 = java.util.Arrays.asList(1,0,2); // 解释: 输入中 0 代表黑色，1 代表白色，标粗的元素即为满足条件的最大子方阵
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        int[][] matrix2 = new int[][]{{0, 1, 1}, {1, 0, 1}, {1, 1, 0}};
        Object result2 = solution.solution(matrix2);
        Object expected2 = new int[]{0, 0, 1};
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

    }
}
