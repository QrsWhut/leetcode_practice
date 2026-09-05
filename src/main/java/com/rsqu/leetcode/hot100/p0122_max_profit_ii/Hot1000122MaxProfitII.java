package com.rsqu.leetcode.hot100.p0122_max_profit_ii;

/**
 * 122. 买卖股票的最佳时机 II。
 */
public class Hot1000122MaxProfitII {

    /**
     * 计算可以完成多次交易时的最大利润。
     *
     * @param prices 每天的股票价格
     * @return 最大利润
     */
    public int maxProfit(int[] prices) {
        int dp[][] = new int[prices.length][2];
        dp[0][1] = -prices[0];
        dp[0][0] = 0;
        for (int i = 1; i < prices.length; i++) {
            dp[i][1] = Math.max(dp[i - 1][1], dp[i - 1][0] - prices[i]);
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] + prices[i]);
        }
        return dp[prices.length-1][0];
    }
}
