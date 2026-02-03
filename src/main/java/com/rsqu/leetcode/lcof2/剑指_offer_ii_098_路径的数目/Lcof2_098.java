package com.rsqu.leetcode.lcof2.剑指_offer_ii_098_路径的数目;

import com.rsqu.leetcode.util.TestUtil;

public class Lcof2_098 {
    // 题目描述：本目录 README.md。

    public int solution(int m, int n) {
        // TODO：请实现解法
        return 0;
    }

    public static void main(String[] args) {
        Lcof2_098 solution = new Lcof2_098();

        // 示例1
        int m1 = 3;
        int n1 = 7;
        Object result1 = solution.solution(m1, n1);
        Object expected1 = 28;
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        int m2 = 3;
        int n2 = 2;
        Object result2 = solution.solution(m2, n2);
        Object expected2 = 3; // 解释: 从左上角开始，总共有 3 条路径可以到达右下角。 1. 向右 -> 向下 -> 向下 2. 向下 -> 向下 -> 向右 3. 向下 -> 向右 -> 向下
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

        // 示例3
        int m3 = 7;
        int n3 = 3;
        Object result3 = solution.solution(m3, n3);
        Object expected3 = 28;
        boolean pass3 = TestUtil.isEqual(result3, expected3);
        System.out.println("示例3：" + (pass3 ? "通过" : "失败") + "，输出=" + TestUtil.format(result3) + "，期望=" + TestUtil.format(expected3));

        // 示例4
        int m4 = 3;
        int n4 = 3;
        Object result4 = solution.solution(m4, n4);
        Object expected4 = 6;
        boolean pass4 = TestUtil.isEqual(result4, expected4);
        System.out.println("示例4：" + (pass4 ? "通过" : "失败") + "，输出=" + TestUtil.format(result4) + "，期望=" + TestUtil.format(expected4));

    }
}
