package com.rsqu.leetcode.hot100.p0240_search_matrix;

/**
 * 240. 搜索二维矩阵 II
 * 每行从左到右升序，每列从上到下升序。
 *
 * <p>思路：从右上角出发，利用行列的有序性进行"z字形"搜索。
 * - matrix[row][col] > target → 整列都比 target 大，向左移一列
 * - matrix[row][col] < target → 整行都比 target 小，向下移一行
 * 时间复杂度 O(m+n)，空间复杂度 O(1)
 * </p>
 */
public class Hot1000240SearchMatrix {

    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int m = matrix.length;
        int n = matrix[0].length;
        // 从右上角出发
        int row = 0;
        int col = n - 1;

        while (row < m && col >= 0) {
            int val = matrix[row][col];
            if (val == target) {
                return true;
            } else if (val > target) {
                // 当前值 > target，当前列所有值都 > target，向左移动
                col--;
            } else {
                // 当前值 < target，当前行所有值都 < target，向下移动
                row++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Hot1000240SearchMatrix solution = new Hot1000240SearchMatrix();

        int[][] matrix = {
            {1,  4,  7,  11, 15},
            {2,  5,  8,  12, 19},
            {3,  6,  9,  16, 22},
            {10, 13, 14, 17, 24},
            {18, 21, 23, 26, 30}
        };

        System.out.println(solution.searchMatrix(matrix, 5));   // true
        System.out.println(solution.searchMatrix(matrix, 20));  // false
    }
}