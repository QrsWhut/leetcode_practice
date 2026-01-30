package com.rsqu.leetcode.lcof2.剑指_offer_ii_067_最大的异或;

import com.rsqu.leetcode.util.TestUtil;

public class Lcof2_067 {
    // 题目描述：本目录 README.md。

    public int solution(int[] numbers) {
        // TODO：请实现解法
        return 0;
    }

    public static void main(String[] args) {
        Lcof2_067 solution = new Lcof2_067();

        // 示例1
        int[] numbers1 = new int[]{3, 10, 5, 25, 2, 8};
        Object result1 = solution.solution(numbers1);
        Object expected1 = 28 解释:最大运算结果是 5 XOR 25 = 28.;
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        int[] numbers2 = new int[]{0};
        Object result2 = solution.solution(numbers2);
        Object expected2 = 0;
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

        // 示例3
        int[] numbers3 = new int[]{2, 4};
        Object result3 = solution.solution(numbers3);
        Object expected3 = 6;
        boolean pass3 = TestUtil.isEqual(result3, expected3);
        System.out.println("示例3：" + (pass3 ? "通过" : "失败") + "，输出=" + TestUtil.format(result3) + "，期望=" + TestUtil.format(expected3));

        // 示例4
        int[] numbers4 = new int[]{8, 10, 2};
        Object result4 = solution.solution(numbers4);
        Object expected4 = 10;
        boolean pass4 = TestUtil.isEqual(result4, expected4);
        System.out.println("示例4：" + (pass4 ? "通过" : "失败") + "，输出=" + TestUtil.format(result4) + "，期望=" + TestUtil.format(expected4));

        // 示例5
        int[] numbers5 = new int[]{14, 70, 53, 83, 49, 91, 36, 80, 92, 51, 66, 70};
        Object result5 = solution.solution(numbers5);
        Object expected5 = 127;
        boolean pass5 = TestUtil.isEqual(result5, expected5);
        System.out.println("示例5：" + (pass5 ? "通过" : "失败") + "，输出=" + TestUtil.format(result5) + "，期望=" + TestUtil.format(expected5));

    }
}
