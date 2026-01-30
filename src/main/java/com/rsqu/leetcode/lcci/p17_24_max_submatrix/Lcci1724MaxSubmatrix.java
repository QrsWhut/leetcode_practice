package com.rsqu.leetcode.lcci.p17_24_max_submatrix;

import com.rsqu.leetcode.util.TestUtil;

public class Lcci1724MaxSubmatrix {
    // 题目描述：本目录 README.md。

    public int[] solution(int[][] matrix) {
        // TODO：请实现解法
        return new int[]{};
    }

    public static void main(String[] args) {
        Lcci1724MaxSubmatrix solution = new Lcci1724MaxSubmatrix();

        // 示例1
        int[][] matrix1 = new int[][]{{-1, 0}, {0, -1}};
        Object result1 = solution.solution(matrix1);
        Object expected1 = [0,1,0,1] 解释: 输入中标粗的元素即为输出所表示的矩阵;
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

    }
}
