package com.rsqu.leetcode.hot100.p0322_coin_change;

import java.util.Arrays;

/**
 * 322. 零钱兑换 (Coin Change)
 *
 * 求最少硬币数凑出 amount，每种硬币无限用。
 *
 * 关键误区：
 * - 回溯 DFS 从大到小 + 第一个解就 return → 错！DFS 第一个解 ≠ 最优解
 * - 贪心从大到小选 → 错！如 coins=[4,3,1], amount=6，贪心得 3 枚，最优 2 枚
 *
 * 正解：DP（完全背包）
 * - dp[i] = 凑出金额 i 所需的最少硬币数
 * - dp[i] = min(dp[i], dp[i - coin] + 1)  对每个 coin
 * - 时间 O(amount × n)，空间 O(amount)
 */
public class Hot1000322CoinChange {

    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;
        for (int i = 1; i < amount + 1; i++) {
            for (int coin : coins) {
                if(i >= coin) {
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }
        return dp[amount] > amount ? -1 : dp[amount];
    }

    public static void main(String[] args) {
        Hot1000322CoinChange solution = new Hot1000322CoinChange();

        // 示例 1
        System.out.println(solution.coinChange(new int[]{1, 2, 5}, 11));     // 3 → 5+5+1

        // 示例 2
        System.out.println(solution.coinChange(new int[]{2}, 3));            // -1

        // 示例 3
        System.out.println(solution.coinChange(new int[]{1}, 0));            // 0

        // 贪心翻车案例
        System.out.println(solution.coinChange(new int[]{4, 3, 1}, 6));      // 2 → 3+3

        // 回溯第一个解翻车案例
        System.out.println(solution.coinChange(new int[]{10, 6, 1}, 12));    // 2 → 6+6
    }
}