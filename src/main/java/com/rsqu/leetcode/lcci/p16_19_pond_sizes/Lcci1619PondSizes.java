package com.rsqu.leetcode.lcci.p16_19_pond_sizes;

import com.rsqu.leetcode.util.TestUtil;

public class Lcci1619PondSizes {
    // 题目描述：本目录 README.md。

    public int[] solution(int[][] land) {
        // TODO：请实现解法
        return new int[]{};
    }

    public static void main(String[] args) {
        Lcci1619PondSizes solution = new Lcci1619PondSizes();

        // 示例1
        int[][] land1 = new int[][]{{0, 2, 1, 0}, {0, 1, 0, 1}, {1, 1, 0, 1}, {0, 1, 0, 1}};
        Object result1 = solution.solution(land1);
        Object expected1 = new int[]{1, 2, 4};
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

    }
}
