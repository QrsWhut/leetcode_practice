package com.rsqu.leetcode.lcci.p16_13_bisect_squares;

import com.rsqu.leetcode.util.TestUtil;

public class Lcci1613BisectSquares {
    // 题目描述：本目录 README.md。

    public double[] solution(int[] square1, int[] square2) {
        // TODO：请实现解法
        return new double[]{};
    }

    public static void main(String[] args) {
        Lcci1613BisectSquares solution = new Lcci1613BisectSquares();

        // 示例1
        int[] square11 = {-1, -1, 2} square2 = {0, -1, 2};
        // TODO：为 square21 设置输入
        Object result1 = solution.solution(square11, square21);
        Object expected1 = {-1,0,2,0} 解释: 直线 y = 0 能将两个正方形同时分为等面积的两部分，返回的两线段端点为[-1,0]和[2,0];
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

    }
}
