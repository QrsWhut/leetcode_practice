package com.rsqu.leetcode.hot100.p0121_max_profit;

public class Hot1000121MaxProfit {

    public int maxProfit(int[] prices) {
        int min = prices[0];
        int max = 0;
        for (int i = 1; i < prices.length; i++) {
            max = Math.max(max, prices[i] - min);
            min = Math.min(min, prices[i]);
        }
        return max;
    }

    public static void main(String[] args) {
        Hot1000121MaxProfit solution = new Hot1000121MaxProfit();
    }
}