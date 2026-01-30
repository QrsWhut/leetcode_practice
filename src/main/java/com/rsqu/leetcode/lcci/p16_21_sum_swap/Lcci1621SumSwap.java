package com.rsqu.leetcode.lcci.p16_21_sum_swap;

import com.rsqu.leetcode.util.TestUtil;

public class Lcci1621SumSwap {
    // 题目描述：本目录 README.md。

    public int[] solution(int[] array1, int[] array2) {
        // TODO：请实现解法
        return new int[]{};
    }

    public static void main(String[] args) {
        Lcci1621SumSwap solution = new Lcci1621SumSwap();

        // 示例1
        int[] array11 = new int[]{4, 1, 2, 1, 1, 2};
        int[] array21 = new int[]{3, 6, 3, 3};
        Object result1 = solution.solution(array11, array21);
        Object expected1 = new int[]{1, 3};
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        int[] array12 = new int[]{1, 2, 3};
        int[] array22 = new int[]{4, 5, 6};
        Object result2 = solution.solution(array12, array22);
        Object expected2 = new int[]{};
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

    }
}
