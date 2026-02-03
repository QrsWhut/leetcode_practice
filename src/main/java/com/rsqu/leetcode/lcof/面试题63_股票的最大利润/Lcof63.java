package com.rsqu.leetcode.lcof.面试题63_股票的最大利润;

import com.rsqu.leetcode.util.TestUtil;

public class Lcof63 {
    // 题目描述：本目录 README.md。

    public int solution(int[] prices) {
        // TODO：请实现解法
        return 0;
    }

    public static void main(String[] args) {
        Lcof63 solution = new Lcof63();

        // 示例1
        int[] prices1 = new int[]{7, 1, 5, 3, 6, 4};
        Object result1 = solution.solution(prices1);
        Object expected1 = 5; // 解释: 在第 2 天（股票价格 = 1）的时候买入，在第 5 天（股票价格 = 6）的时候卖出，最大利润 = 6-1 = 5 。 注意利润不能是 7-1 = 6, 因为卖出价格需要大于买入价格。
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        int[] prices2 = new int[]{7, 6, 4, 3, 1};
        Object result2 = solution.solution(prices2);
        Object expected2 = 0; // 解释: 在这种情况下, 没有交易完成, 所以最大利润为 0。
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

    }
}
