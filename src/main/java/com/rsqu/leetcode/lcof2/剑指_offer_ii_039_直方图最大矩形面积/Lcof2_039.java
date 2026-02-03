package com.rsqu.leetcode.lcof2.剑指_offer_ii_039_直方图最大矩形面积;

import com.rsqu.leetcode.util.TestUtil;

public class Lcof2_039 {
    // 题目描述：本目录 README.md。

    public int solution(int[] heights) {
        // TODO：请实现解法
        return 0;
    }

    public static void main(String[] args) {
        Lcof2_039 solution = new Lcof2_039();

        // 示例1
        int[] heights1 = new int[]{2, 1, 5, 6, 2, 3};
        Object result1 = solution.solution(heights1);
        Object expected1 = 10; // 解释:最大的矩形为图中红色区域，面积为 10
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        int[] heights2 = new int[]{2, 4};
        Object result2 = solution.solution(heights2);
        Object expected2 = 4;
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

    }
}
