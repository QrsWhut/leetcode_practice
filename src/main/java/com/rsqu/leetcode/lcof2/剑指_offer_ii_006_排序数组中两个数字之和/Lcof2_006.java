package com.rsqu.leetcode.lcof2.剑指_offer_ii_006_排序数组中两个数字之和;

import com.rsqu.leetcode.util.TestUtil;

public class Lcof2_006 {
    // 题目描述：本目录 README.md。

    public int[] solution(int[] numbers, int target) {
        // TODO：请实现解法
        return new int[]{};
    }

    public static void main(String[] args) {
        Lcof2_006 solution = new Lcof2_006();

        // 示例1
        int[] numbers1 = new int[]{1, 2, 4, 6, 10};
        int target1 = 8;
        Object result1 = solution.solution(numbers1, target1);
        Object expected1 = java.util.Arrays.asList(1,3); // 解释:2 与 6 之和等于目标数 8 。因此 index1 = 1, index2 = 3 。
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        int[] numbers2 = new int[]{2, 3, 4};
        int target2 = 6;
        Object result2 = solution.solution(numbers2, target2);
        Object expected2 = new int[]{0, 2};
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

        // 示例3
        int[] numbers3 = new int[]{-1, 0};
        int target3 = -1;
        Object result3 = solution.solution(numbers3, target3);
        Object expected3 = new int[]{0, 1};
        boolean pass3 = TestUtil.isEqual(result3, expected3);
        System.out.println("示例3：" + (pass3 ? "通过" : "失败") + "，输出=" + TestUtil.format(result3) + "，期望=" + TestUtil.format(expected3));

    }
}
