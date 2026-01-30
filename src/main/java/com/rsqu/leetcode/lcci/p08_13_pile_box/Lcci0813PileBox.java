package com.rsqu.leetcode.lcci.p08_13_pile_box;

import com.rsqu.leetcode.util.TestUtil;

public class Lcci0813PileBox {
    // 题目描述：本目录 README.md。

    public int solution(int[][] box) {
        // TODO：请实现解法
        return 0;
    }

    public static void main(String[] args) {
        Lcci0813PileBox solution = new Lcci0813PileBox();

        // 示例1
        int[][] box1 = new int[][]{{1, 1, 1}, {2, 2, 2}, {3, 3, 3}};
        Object result1 = solution.solution(box1);
        Object expected1 = 6;
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        int[][] box2 = new int[][]{{1, 1, 1}, {2, 3, 4}, {2, 6, 7}, {3, 4, 5}};
        Object result2 = solution.solution(box2);
        Object expected2 = 10;
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

    }
}
