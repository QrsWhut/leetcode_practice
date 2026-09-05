package com.rsqu.leetcode.hot100.p0123_max_profit_iii;

import java.util.Arrays;

/**
 * 123. 买卖股票的最佳时机 III。
 */
public class Hot1000123MaxProfitIII {
    private static final int MAX_TRANSACTION_COUNT = 2;
    private static final int STATE_COUNT = 2;
    private static final int NOT_HOLDING = 0;
    private static final int HOLDING = 1;
    private static final int NEGATIVE_INFINITY = Integer.MIN_VALUE / 2;

    /**
     * 计算最多完成两笔交易时的最大利润。
     *
     * @param prices 每天的股票价格
     * @return 最大利润
     */
    public int maxProfit(int[] prices) {
        int[][][] dp = new int[prices.length][MAX_TRANSACTION_COUNT + 1][STATE_COUNT];
        for (int transactionCount = 0; transactionCount <= MAX_TRANSACTION_COUNT; transactionCount++) {
            Arrays.fill(dp[0][transactionCount], NEGATIVE_INFINITY);
            dp[0][transactionCount][NOT_HOLDING] = 0;
            if (transactionCount > 0) {
                dp[0][transactionCount][HOLDING] = -prices[0];
            }
        }

        for (int i = 1; i < prices.length; i++) {
            dp[i][0][NOT_HOLDING] = 0;
            dp[i][0][HOLDING] = NEGATIVE_INFINITY;
            for (int transactionCount = 1; transactionCount <= MAX_TRANSACTION_COUNT; transactionCount++) {
                dp[i][transactionCount][NOT_HOLDING] = Math.max(
                        dp[i - 1][transactionCount][NOT_HOLDING],
                        dp[i - 1][transactionCount][HOLDING] + prices[i]
                );
                dp[i][transactionCount][HOLDING] = Math.max(
                        dp[i - 1][transactionCount][HOLDING],
                        dp[i - 1][transactionCount - 1][NOT_HOLDING] - prices[i]
                );
            }
        }

        return dp[prices.length - 1][MAX_TRANSACTION_COUNT][NOT_HOLDING];
    }
}
