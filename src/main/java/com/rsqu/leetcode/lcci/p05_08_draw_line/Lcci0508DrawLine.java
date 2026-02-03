package com.rsqu.leetcode.lcci.p05_08_draw_line;

import com.rsqu.leetcode.util.TestUtil;

public class Lcci0508DrawLine {
    // 题目描述：本目录 README.md。

    public int[] solution(int length, int w, int x1, int x2, int y) {
        // TODO：请实现解法
        return new int[]{};
    }

    public static void main(String[] args) {
        Lcci0508DrawLine solution = new Lcci0508DrawLine();

        // 示例1
        int length1 = 1;
        int w1 = 32;
        int x11 = 30;
        int x21 = 31;
        int y1 = 0;
        Object result1 = solution.solution(length1, w1, x11, x21, y1);
        Object expected1 = new int[]{3}; // 说明:在第0行的第30位到第31为画一条直线，屏幕表示为[0b000000000000000000000000000000011]
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        int length2 = 3;
        int w2 = 96;
        int x12 = 0;
        int x22 = 95;
        int y2 = 0;
        Object result2 = solution.solution(length2, w2, x12, x22, y2);
        Object expected2 = new int[]{-1, -1, -1};
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

    }
}
