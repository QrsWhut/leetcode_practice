package com.rsqu.leetcode.hot100.p0309_max_profit_with_cooldown;

/**
 * 309. 买卖股票的最佳时机含冷冻期。
 */
public class Hot1000309MaxProfitWithCooldown {

    /**
     * 计算含一天冷冻期时的最大利润。
     *
     * @param prices 每天的股票价格
     * @return 最大利润
     */
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int[][][] dp = new int[n][2][2];
        dp[0][0][0] = 0;
        dp[0][1][0] = -prices[0];
        dp[0][0][1] = 0;
        for (int i = 1; i < n; i++) {
            // 不持股 + 非冷冻：继续休息，或冷冻期结束恢复自由
            dp[i][0][0] = Math.max(dp[i - 1][0][0], dp[i - 1][0][1]);
            // 持股：继续持有，或从自由态买入（冷冻期不能买）
            dp[i][1][0] = Math.max(dp[i - 1][1][0], dp[i - 1][0][0] - prices[i]);
            // 不持股 + 冷冻：只能由卖出产生（冷冻期仅一天，不能从 dp[i-1][0][1] 来）
            dp[i][0][1] = dp[i - 1][1][0] + prices[i];
        }
        return Math.max(dp[n - 1][0][0], dp[n - 1][0][1]);
    }
}
