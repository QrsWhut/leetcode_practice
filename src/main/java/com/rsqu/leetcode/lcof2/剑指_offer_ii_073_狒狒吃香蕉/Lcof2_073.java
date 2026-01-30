package com.rsqu.leetcode.lcof2.剑指_offer_ii_073_狒狒吃香蕉;

import com.rsqu.leetcode.util.TestUtil;

public class Lcof2_073 {
    // 题目描述：本目录 README.md。

    public int solution(int[] piles, int h) {
        // TODO：请实现解法
        return 0;
    }

    public static void main(String[] args) {
        Lcof2_073 solution = new Lcof2_073();

        // 示例1
        int[] piles1 = new int[]{3, 6, 7, 11};
        int h1 = 8;
        Object result1 = solution.solution(piles1, h1);
        Object expected1 = 4;
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        int[] piles2 = new int[]{30, 11, 23, 4, 20};
        int h2 = 5;
        Object result2 = solution.solution(piles2, h2);
        Object expected2 = 30;
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

        // 示例3
        int[] piles3 = new int[]{30, 11, 23, 4, 20};
        int h3 = 6;
        Object result3 = solution.solution(piles3, h3);
        Object expected3 = 23;
        boolean pass3 = TestUtil.isEqual(result3, expected3);
        System.out.println("示例3：" + (pass3 ? "通过" : "失败") + "，输出=" + TestUtil.format(result3) + "，期望=" + TestUtil.format(expected3));

    }
}
