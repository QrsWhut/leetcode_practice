package com.rsqu.leetcode.hot100.p0279_num_squares;

public class Hot1000279NumSquares {

    public int numSquares(int n) {
        int[] memo = new int[n+1];
        return dp(n,memo);
    }

    private int dp(int n,int[] memo) {
        if (n == 0){
            return 0;
        }
        if (memo[n] != 0){
            return memo[n];
        }
        int min = Integer.MIN_VALUE;
        for (int i = (int)Math.sqrt(n); i >= 1; i--) {
            min = Math.min(min, 1 + dp(n - i * i, memo));
        }
        memo[n] = min;
        return min;
    }

    public static void main(String[] args) {
        Hot1000279NumSquares solution = new Hot1000279NumSquares();
    }
}