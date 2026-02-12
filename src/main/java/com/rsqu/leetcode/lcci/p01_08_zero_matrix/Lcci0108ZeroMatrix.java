package com.rsqu.leetcode.lcci.p01_08_zero_matrix;

import com.rsqu.leetcode.util.TestUtil;

public class Lcci0108ZeroMatrix {
    // 题目描述：本目录 README.md。

    public void solution(int[][] matrix) {
        int[] rows = new int[matrix.length];
        int[] cols = new int[matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    rows[i] = 1;
                    cols[j] = 1;
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (cols[j] == 1 || rows[i] == 1) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Lcci0108ZeroMatrix solution = new Lcci0108ZeroMatrix();

        // 示例1
        int[][] matrix1 = new int[][]{{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        solution.solution(matrix1);

        // 示例2
        int[][] matrix2 = new int[][]{{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
        solution.solution(matrix2);

    }
}
