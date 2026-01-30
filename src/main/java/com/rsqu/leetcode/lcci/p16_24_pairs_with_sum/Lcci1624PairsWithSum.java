package com.rsqu.leetcode.lcci.p16_24_pairs_with_sum;

import java.util.*;
import com.rsqu.leetcode.util.TestUtil;

public class Lcci1624PairsWithSum {
    // 题目描述：本目录 README.md。

    public List<List<Integer>> solution(int[] nums, int target) {
        // TODO：请实现解法
        return null;
    }

    public static void main(String[] args) {
        Lcci1624PairsWithSum solution = new Lcci1624PairsWithSum();

        // 示例1
        int[] nums1 = new int[]{5, 6, 5};
        int target1 = 11;
        Object result1 = solution.solution(nums1, target1);
        Object expected1 = java.util.Arrays.asList(java.util.Arrays.asList(5, 6));
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        int[] nums2 = new int[]{5, 6, 5, 6};
        int target2 = 11;
        Object result2 = solution.solution(nums2, target2);
        Object expected2 = java.util.Arrays.asList(java.util.Arrays.asList(5, 6), java.util.Arrays.asList(5, 6));
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

    }
}
