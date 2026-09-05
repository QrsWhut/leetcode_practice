package com.rsqu.leetcode.hot100.p0051_solve_n_queens;

import java.util.ArrayList;
import java.util.List;

public class Hot1000051SolveNQueens {

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
        List<String> path = new ArrayList<>();
        int[] queens = new int[n];
        trace(res, path, n, 0, queens);
        return res;
    }

    private void trace(List<List<String>> res, List<String> path, int n, int row, int[] queens) {
        if (row == n) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < n; i++) {
            if (canPlace(queens,row,i)){
                queens[row] = i;
                String s = buildString(i, n);
                path.add(s);
                trace(res, path, n, row + 1, queens);
                path.remove(path.size() - 1);
                queens[row] = -1;
            }
        }

    }

    private boolean canPlace(int[] queens, int row, int col) {
        for (int previousRow = 0; previousRow < row; previousRow++) {
            int previousCol = queens[previousRow];

            if (previousCol == col) {
                return false;
            }

            if (Math.abs(row - previousRow) == Math.abs(col - previousCol)) {
                return false;
            }
        }

        return true;
    }

    private String buildString(int col,int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < col; i++) {
            sb.append(".");
        }
        sb.append("Q");
        for (int i = col + 1; i < n; i++) {
            sb.append(".");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Hot1000051SolveNQueens solution = new Hot1000051SolveNQueens();
    }
}