package com.rsqu.leetcode.hot100.p0064_min_path_sum;

import java.util.Arrays;

public class Hot1000064MinPathSum {

    private static final int UNVISITED = -1;

    private int[][] memo;

    public int minPathSum(int[][] grid) {
        memo = new int[grid.length][grid[0].length];
        for (int[] row : memo) {
            Arrays.fill(row, UNVISITED);
        }

        return dp(grid.length - 1, grid[0].length - 1, grid);
    }

    private int dp(int row, int column, int[][] grid) {
        if (row == 0 && column == 0) {
            return grid[0][0];
        }
        if (row < 0 || column < 0) {
            return Integer.MAX_VALUE;
        }
        if (memo[row][column] != UNVISITED) {
            return memo[row][column];
        }

        int up = dp(row - 1, column, grid);
        int left = dp(row, column - 1, grid);
        memo[row][column] = Math.min(up, left) + grid[row][column];
        return memo[row][column];
    }

    public static void main(String[] args) {
        Hot1000064MinPathSum solution = new Hot1000064MinPathSum();
    }
}
