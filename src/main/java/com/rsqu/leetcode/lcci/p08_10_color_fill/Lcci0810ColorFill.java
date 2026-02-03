package com.rsqu.leetcode.lcci.p08_10_color_fill;

import com.rsqu.leetcode.util.TestUtil;

public class Lcci0810ColorFill {
    // 题目描述：本目录 README.md。

    public int[][] solution(int[][] image, int sr, int sc, int newColor) {
        // TODO：请实现解法
        return new int[][]{};
    }

    public static void main(String[] args) {
        Lcci0810ColorFill solution = new Lcci0810ColorFill();

        // 示例1
        int[][] image1 = new int[][]{{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};
        int sr1 = 1;
        int sc1 = 1;
        int newColor1 = 2;
        Object result1 = solution.solution(image1, sr1, sc1, newColor1);
        Object expected1 = java.util.Arrays.asList(java.util.Arrays.asList(2,2,2),java.util.Arrays.asList(2,2,0),java.util.Arrays.asList(2,0,1)); // 解释: 在图像的正中间，(坐标(sr,sc)=(1,1)), 在路径上所有符合条件的像素点的颜色都被更改成2。 注意，右下角的像素没有更改为2， 因为它不是在上下左右四个方向上与初始点相连的像素点。
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

    }
}
