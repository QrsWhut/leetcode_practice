package com.rsqu.leetcode.hot100.p0188_max_profit_iv;

/**
 * 188. 买卖股票的最佳时机 IV。
 */
public class Hot1000188MaxProfitIV {

    /**
     * 计算最多完成 k 笔交易时的最大利润。
     *
     * @param k 最多交易次数
     * @param prices 每天的股票价格
     * @return 最大利润
     */
    public int maxProfit(int k, int[] prices) {
        int[][][] dp = new int[prices.length][k + 1][2];
        for (int i = 1; i <= k; i++) {
            dp[0][i][0] = 0;
            dp[0][i][1] = -prices[0];
        }
        for (int i = 1; i < prices.length; i++) {
            dp[i][0][0] = 0;
            for (int j = 1; j <= k; j++) {
                dp[i][j][0] = Math.max(dp[i-1][j][0], dp[i-1][j][1] + prices[i]);
                dp[i][j][1] = Math.max(dp[i-1][j][1],dp[i-1][j-1][0] - prices[i]);
            }
        }
        return dp[prices.length-1][k][0];
    }
}
