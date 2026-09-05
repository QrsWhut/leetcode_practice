package com.rsqu.leetcode.lcci.p01_07_rotate_matrix;

public class Lcci0107RotateMatrix {
    // 题目描述：本目录 README.md。

    public void solution(int[][] matrix) {
        // TODO：请实现解法
        int n = matrix.length;
        for (int i = 0; i < n >> 1; ++i) {
            for (int j = 0; j < n; ++j) {
                int t = matrix[i][j];
                matrix[i][j] = matrix[n - i - 1][j];
                matrix[n - i - 1][j] = t;
            }
        }
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < i; ++j) {
                int t = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = t;
            }
        }
    }

    public static void main(String[] args) {
        Lcci0107RotateMatrix solution = new Lcci0107RotateMatrix();

        // TODO：请根据 README.md 补充示例
    }
}
