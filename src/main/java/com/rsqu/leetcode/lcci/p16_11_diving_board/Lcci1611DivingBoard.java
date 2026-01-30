package com.rsqu.leetcode.lcci.p16_11_diving_board;

import com.rsqu.leetcode.util.TestUtil;

public class Lcci1611DivingBoard {
    // 题目描述：本目录 README.md。

    public int[] solution(int shorter, int longer, int k) {
        // TODO：请实现解法
        return new int[]{};
    }

    public static void main(String[] args) {
        Lcci1611DivingBoard solution = new Lcci1611DivingBoard();

        // 示例1
        int shorter1 = 1 longer = 2 k = 3;
        // TODO：为 longer1 设置输入
        // TODO：为 k1 设置输入
        Object result1 = solution.solution(shorter1, longer1, k1);
        Object expected1 = {3,4,5,6};
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

    }
}
