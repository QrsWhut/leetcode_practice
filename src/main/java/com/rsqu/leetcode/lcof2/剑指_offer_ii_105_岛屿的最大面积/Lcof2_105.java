package com.rsqu.leetcode.lcof2.剑指_offer_ii_105_岛屿的最大面积;

import com.rsqu.leetcode.util.TestUtil;

public class Lcof2_105 {
    // 题目描述：本目录 README.md。

    public int solution(int[][] grid) {
        // TODO：请实现解法
        return 0;
    }

    public static void main(String[] args) {
        Lcof2_105 solution = new Lcof2_105();

        // 示例1
        int[][] grid1 = new int[][]{{0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0}, {0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0}, {0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0}};
        Object result1 = solution.solution(grid1);
        // 期望输出可能包含多个结果：6 解释: 对于上面这个给定矩阵应返回 6。注意答案不应该是 11 ，因为岛屿只能包含水平或垂直的四个方向的 1 。
        System.out.println("示例1输出：" + TestUtil.format(result1));

        // 示例2
        int[][] grid2 = new int[][]{{0, 0, 0, 0, 0, 0, 0, 0}};
        Object result2 = solution.solution(grid2);
        Object expected2 = 0;
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

    }
}
