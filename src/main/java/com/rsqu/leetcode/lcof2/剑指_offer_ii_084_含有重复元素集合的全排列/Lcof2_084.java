package com.rsqu.leetcode.lcof2.剑指_offer_ii_084_含有重复元素集合的全排列;

import java.util.*;
import com.rsqu.leetcode.util.TestUtil;

public class Lcof2_084 {
    // 题目描述：本目录 README.md。

    public List<List<Integer>> solution(int[] nums) {
        // TODO：请实现解法
        return null;
    }

    public static void main(String[] args) {
        Lcof2_084 solution = new Lcof2_084();

        // 示例1
        int[] nums1 = new int[]{1, 1, 2};
        Object result1 = solution.solution(nums1);
        Object expected1 = java.util.Arrays.asList(java.util.Arrays.asList(1, 1, 2), java.util.Arrays.asList(1, 2, 1), java.util.Arrays.asList(2, 1, 1));
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        int[] nums2 = new int[]{1, 2, 3};
        Object result2 = solution.solution(nums2);
        Object expected2 = java.util.Arrays.asList(java.util.Arrays.asList(1, 2, 3), java.util.Arrays.asList(1, 3, 2), java.util.Arrays.asList(2, 1, 3), java.util.Arrays.asList(2, 3, 1), java.util.Arrays.asList(3, 1, 2), java.util.Arrays.asList(3, 2, 1));
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

    }
}
