package com.rsqu.leetcode.lcof2.剑指_offer_ii_041_滑动窗口的平均值;

import com.rsqu.leetcode.util.TestUtil;

public class Lcof2_041 {
    // 题目描述：本目录 README.md。

    public double solution(int val) {
        // TODO：请实现解法
        return 0.0d;
    }

    public static void main(String[] args) {
        Lcof2_041 solution = new Lcof2_041();

        // 示例1
        int val1 = ["MovingAverage", "next", "next", "next", "next"] inputs = [[3], [1], [10], [3], [5]];
        Object result1 = solution.solution(val1);
        Object expected1 = [null, 1.0, 5.5, 4.66667, 6.0] 解释: MovingAverage movingAverage = new MovingAverage(3); movingAverage.next(1); // 返回 1.0 = 1 / 1 movingAverage.next(10); // 返回 5.5 = (1 + 10) / 2 movingAverage.next(3); // 返回 4.66667 = (1 + 10 + 3) / 3 movingAverage.next(5); // 返回 6.0 = (10 + 3 + 5) / 3;
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

    }
}
