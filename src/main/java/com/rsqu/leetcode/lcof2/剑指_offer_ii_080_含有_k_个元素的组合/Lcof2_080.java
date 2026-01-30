package com.rsqu.leetcode.lcof2.剑指_offer_ii_080_含有_k_个元素的组合;

import java.util.*;
import com.rsqu.leetcode.util.TestUtil;

public class Lcof2_080 {
    // 题目描述：本目录 README.md。

    public List<List<Integer>> solution(int n, int k) {
        // TODO：请实现解法
        return null;
    }

    public static void main(String[] args) {
        Lcof2_080 solution = new Lcof2_080();

        // 示例1
        int n1 = 4;
        int k1 = 2;
        Object result1 = solution.solution(n1, k1);
        Object expected1 = java.util.Arrays.asList(java.util.Arrays.asList(2, 4), java.util.Arrays.asList(3, 4), java.util.Arrays.asList(2, 3), java.util.Arrays.asList(1, 2), java.util.Arrays.asList(1, 3), java.util.Arrays.asList(1, 4));
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        int n2 = 1;
        int k2 = 1;
        Object result2 = solution.solution(n2, k2);
        Object expected2 = java.util.Arrays.asList(java.util.Arrays.asList(1));
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

    }
}
