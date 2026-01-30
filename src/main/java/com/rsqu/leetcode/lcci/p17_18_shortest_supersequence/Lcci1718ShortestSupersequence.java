package com.rsqu.leetcode.lcci.p17_18_shortest_supersequence;

import com.rsqu.leetcode.util.TestUtil;

public class Lcci1718ShortestSupersequence {
    // 题目描述：本目录 README.md。

    public int[] solution(int[] big, int[] small) {
        // TODO：请实现解法
        return new int[]{};
    }

    public static void main(String[] args) {
        Lcci1718ShortestSupersequence solution = new Lcci1718ShortestSupersequence();

        // 示例1
        int[] big1 = new int[]{7, 5, 9, 0, 2, 1, 3, 5, 7, 9, 1, 1, 5, 8, 8, 9, 7] small = [1,5,9};
        // TODO：为 small1 设置输入
        Object result1 = solution.solution(big1, small1);
        Object expected1 = new int[]{7, 10};
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        int[] big2 = new int[]{1, 2, 3] small = [4};
        // TODO：为 small2 设置输入
        Object result2 = solution.solution(big2, small2);
        Object expected2 = new int[]{};
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

    }
}
