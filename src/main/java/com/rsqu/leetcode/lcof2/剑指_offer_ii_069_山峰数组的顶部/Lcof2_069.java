package com.rsqu.leetcode.lcof2.剑指_offer_ii_069_山峰数组的顶部;

import com.rsqu.leetcode.util.TestUtil;

public class Lcof2_069 {
    // 题目描述：本目录 README.md。

    public int solution(int[] arr) {
        // TODO：请实现解法
        return 0;
    }

    public static void main(String[] args) {
        Lcof2_069 solution = new Lcof2_069();

        // 示例1
        int[] arr1 = new int[]{0, 1, 0};
        Object result1 = solution.solution(arr1);
        Object expected1 = 1;
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        int[] arr2 = new int[]{1, 3, 5, 4, 2};
        Object result2 = solution.solution(arr2);
        Object expected2 = 2;
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

        // 示例3
        int[] arr3 = new int[]{0, 10, 5, 2};
        Object result3 = solution.solution(arr3);
        Object expected3 = 1;
        boolean pass3 = TestUtil.isEqual(result3, expected3);
        System.out.println("示例3：" + (pass3 ? "通过" : "失败") + "，输出=" + TestUtil.format(result3) + "，期望=" + TestUtil.format(expected3));

        // 示例4
        int[] arr4 = new int[]{3, 4, 5, 1};
        Object result4 = solution.solution(arr4);
        Object expected4 = 2;
        boolean pass4 = TestUtil.isEqual(result4, expected4);
        System.out.println("示例4：" + (pass4 ? "通过" : "失败") + "，输出=" + TestUtil.format(result4) + "，期望=" + TestUtil.format(expected4));

        // 示例5
        int[] arr5 = new int[]{24, 69, 100, 99, 79, 78, 67, 36, 26, 19};
        Object result5 = solution.solution(arr5);
        Object expected5 = 2;
        boolean pass5 = TestUtil.isEqual(result5, expected5);
        System.out.println("示例5：" + (pass5 ? "通过" : "失败") + "，输出=" + TestUtil.format(result5) + "，期望=" + TestUtil.format(expected5));

    }
}
