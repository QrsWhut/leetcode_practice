package com.rsqu.leetcode.lcof.面试题47_礼物的最大价值;

import com.rsqu.leetcode.util.TestUtil;

public class Lcof47 {
    // 题目描述：本目录 README.md。

    public int solution(int[][] grid) {
        // TODO：请实现解法
        return 0;
    }

    public static void main(String[] args) {
        Lcof47 solution = new Lcof47();

        // 示例1
        int[][] grid1 = new int[][]{{1, 3, 1}, {1, 5, 1}, {4, 2, 1}};
        Object result1 = solution.solution(grid1);
        Object expected1 = 12 解释: 路径 1→3→5→2→1 可以拿到最多价值的礼物;
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

    }
}
