package com.rsqu.leetcode.lcof2.剑指_offer_ii_093_最长斐波那契数列;

import com.rsqu.leetcode.util.TestUtil;

public class Lcof2_093 {
    // 题目描述：本目录 README.md。

    public int solution(int[] arr) {
        // TODO：请实现解法
        return 0;
    }

    public static void main(String[] args) {
        Lcof2_093 solution = new Lcof2_093();

        // 示例1
        int[] arr1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        Object result1 = solution.solution(arr1);
        Object expected1 = 5; // 解释: 最长的斐波那契式子序列为 [1,2,3,5,8] 。
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        int[] arr2 = new int[]{1, 3, 7, 11, 12, 14, 18};
        Object result2 = solution.solution(arr2);
        Object expected2 = 3; // 解释: 最长的斐波那契式子序列有 [1,11,12]、[3,11,14] 以及 [7,11,18] 。
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

    }
}
