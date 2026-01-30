package com.rsqu.leetcode.lcci.p16_14_best_line;

import com.rsqu.leetcode.util.TestUtil;

public class Lcci1614BestLine {
    // 题目描述：本目录 README.md。

    public int[] solution(int[][] points) {
        // TODO：请实现解法
        return new int[]{};
    }

    public static void main(String[] args) {
        Lcci1614BestLine solution = new Lcci1614BestLine();

        // 示例1
        int[][] points1 = new int[][]{{0, 0}, {1, 1}, {1, 0}, {2, 0}};
        Object result1 = solution.solution(points1);
        Object expected1 = new int[]{0, 2] 解释: 所求直线穿过的3个点的编号为[0,2,3};
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

    }
}
