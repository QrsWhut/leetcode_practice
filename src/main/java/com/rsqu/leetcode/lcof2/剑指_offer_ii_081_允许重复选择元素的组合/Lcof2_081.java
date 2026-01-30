package com.rsqu.leetcode.lcof2.剑指_offer_ii_081_允许重复选择元素的组合;

import java.util.*;
import com.rsqu.leetcode.util.TestUtil;

public class Lcof2_081 {
    // 题目描述：本目录 README.md。

    public List<List<Integer>> solution(int[] candidates, int target) {
        // TODO：请实现解法
        return null;
    }

    public static void main(String[] args) {
        Lcof2_081 solution = new Lcof2_081();

        // 示例1
        int[] candidates1 = new int[]{2, 3, 6, 7};
        int target1 = 7;
        Object result1 = solution.solution(candidates1, target1);
        Object expected1 = java.util.Arrays.asList(java.util.Arrays.asList(7), java.util.Arrays.asList(2, 2, 3));
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        int[] candidates2 = new int[]{2, 3, 5};
        int target2 = 8;
        Object result2 = solution.solution(candidates2, target2);
        Object expected2 = java.util.Arrays.asList(java.util.Arrays.asList(2, 2, 2, 2), java.util.Arrays.asList(2, 3, 3), java.util.Arrays.asList(3, 5));
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

        // 示例3
        int[] candidates3 = new int[]{2};
        int target3 = 1;
        Object result3 = solution.solution(candidates3, target3);
        Object expected3 = java.util.Arrays.asList();
        boolean pass3 = TestUtil.isEqual(result3, expected3);
        System.out.println("示例3：" + (pass3 ? "通过" : "失败") + "，输出=" + TestUtil.format(result3) + "，期望=" + TestUtil.format(expected3));

        // 示例4
        int[] candidates4 = new int[]{1};
        int target4 = 1;
        Object result4 = solution.solution(candidates4, target4);
        Object expected4 = java.util.Arrays.asList(java.util.Arrays.asList(1));
        boolean pass4 = TestUtil.isEqual(result4, expected4);
        System.out.println("示例4：" + (pass4 ? "通过" : "失败") + "，输出=" + TestUtil.format(result4) + "，期望=" + TestUtil.format(expected4));

        // 示例5
        int[] candidates5 = new int[]{1};
        int target5 = 2;
        Object result5 = solution.solution(candidates5, target5);
        Object expected5 = java.util.Arrays.asList(java.util.Arrays.asList(1, 1));
        boolean pass5 = TestUtil.isEqual(result5, expected5);
        System.out.println("示例5：" + (pass5 ? "通过" : "失败") + "，输出=" + TestUtil.format(result5) + "，期望=" + TestUtil.format(expected5));

    }
}
