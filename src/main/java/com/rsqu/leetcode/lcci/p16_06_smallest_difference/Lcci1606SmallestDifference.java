package com.rsqu.leetcode.lcci.p16_06_smallest_difference;

import com.rsqu.leetcode.util.TestUtil;

public class Lcci1606SmallestDifference {
    // 题目描述：本目录 README.md。

    public int solution(int[] a, int[] b) {
        // TODO：请实现解法
        return 0;
    }

    public static void main(String[] args) {
        Lcci1606SmallestDifference solution = new Lcci1606SmallestDifference();

        // 示例1
        int[] a1 = {1, 3, 15, 11, 2};
        int[] b1 = {23, 127, 235, 19, 8};
        Object result1 = solution.solution(a1, b1);
        Object expected1 = 3，即数值对(11, 8);
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

    }
}
