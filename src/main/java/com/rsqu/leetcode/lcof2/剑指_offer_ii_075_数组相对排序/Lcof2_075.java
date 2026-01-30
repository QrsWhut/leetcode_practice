package com.rsqu.leetcode.lcof2.剑指_offer_ii_075_数组相对排序;

import com.rsqu.leetcode.util.TestUtil;

public class Lcof2_075 {
    // 题目描述：本目录 README.md。

    public int[] solution(int[] arr1, int[] arr2) {
        // TODO：请实现解法
        return new int[]{};
    }

    public static void main(String[] args) {
        Lcof2_075 solution = new Lcof2_075();

        // 示例1
        int[] arr11 = new int[]{2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19};
        int[] arr21 = new int[]{2, 1, 4, 3, 9, 6};
        Object result1 = solution.solution(arr11, arr21);
        Object expected1 = new int[]{2, 2, 2, 1, 4, 3, 3, 9, 6, 7, 19};
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

    }
}
