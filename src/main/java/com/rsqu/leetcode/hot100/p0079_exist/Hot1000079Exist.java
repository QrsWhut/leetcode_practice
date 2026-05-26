package com.rsqu.leetcode.hot100.p0079_exist;

public class Hot1000079Exist {

    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        int[][] memo = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (dfs(board, word, i, j, 0,memo)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dfs(char[][] board, String word, int i, int j, int k, int[][] memo) {
        if (k == word.length()) {
            return true;
        }
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != word.charAt(k)) {
            return false;
        }
        if (memo[i][j] == 1) {
            return false;
        } else {
            memo[i][j] = 1;
        }
        boolean res = dfs(board, word, i - 1, j, k + 1,memo) || dfs(board, word, i + 1, j, k + 1,memo) || dfs(board, word, i, j - 1, k + 1,memo) || dfs(board, word, i, j + 1, k + 1,memo);
        memo[i][j] = 0;
        return res;
    }

    public static void main(String[] args) {
        Hot1000079Exist solution = new Hot1000079Exist();
    }
}