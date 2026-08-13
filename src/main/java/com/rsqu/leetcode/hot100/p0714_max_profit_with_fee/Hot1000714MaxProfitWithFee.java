package com.rsqu.leetcode.hot100.p0714_max_profit_with_fee;

/**
 * 714. 买卖股票的最佳时机含手续费。
 */
public class Hot1000714MaxProfitWithFee {

    /**
     * 计算含交易手续费时的最大利润。
     *
     * @param prices 每天的股票价格
     * @param fee 每笔交易的手续费
     * @return 最大利润
     */
    public int maxProfit(int[] prices, int fee) {
        int[][] dp = new int[prices.length][2];
        dp[0][0] = 0;
        dp[0][1] = -prices[0];
        for (int i = 1; i < prices.length; i++) {
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] + prices[i] - fee);
            dp[i][1] = Math.max(dp[i - 1][1], dp[i - 1][0] - prices[i]);
        }
        return dp[prices.length - 1][0];
    }
}
