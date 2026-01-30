package com.rsqu.leetcode.lcci.p16_01_swap_numbers;

import com.rsqu.leetcode.util.TestUtil;

public class Lcci1601SwapNumbers {
    // 题目描述：本目录 README.md。

    public int[] solution(int[] numbers) {
        // TODO：请实现解法
        return new int[]{};
    }

    public static void main(String[] args) {
        Lcci1601SwapNumbers solution = new Lcci1601SwapNumbers();

        // 示例1
        int[] numbers1 = new int[]{1, 2};
        Object result1 = solution.solution(numbers1);
        Object expected1 = new int[]{2, 1};
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

    }
}
