package com.rsqu.leetcode.lcci.p16_16_sub_sort;

import com.rsqu.leetcode.util.TestUtil;

public class Lcci1616SubSort {
    // 题目描述：本目录 README.md。

    public int[] solution(int[] array) {
        // TODO：请实现解法
        return new int[]{};
    }

    public static void main(String[] args) {
        Lcci1616SubSort solution = new Lcci1616SubSort();

        // 示例1
        int[] array1 = new int[]{1, 2, 4, 7, 10, 11, 7, 12, 6, 7, 16, 18, 19};
        Object result1 = solution.solution(array1);
        Object expected1 = new int[]{3, 9};
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

    }
}
