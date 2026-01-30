package com.rsqu.leetcode.lcci.p17_14_smallest_k;

import com.rsqu.leetcode.util.TestUtil;

public class Lcci1714SmallestK {
    // 题目描述：本目录 README.md。

    public int[] solution(int[] arr, int k) {
        // TODO：请实现解法
        return new int[]{};
    }

    public static void main(String[] args) {
        Lcci1714SmallestK solution = new Lcci1714SmallestK();

        // 示例1
        int[] arr1 = new int[]{1, 3, 5, 7, 2, 4, 6, 8};
        int k1 = 4;
        Object result1 = solution.solution(arr1, k1);
        Object expected1 = new int[]{1, 2, 3, 4};
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

    }
}
