package com.rsqu.leetcode.lcci.p08_04_power_set;

import java.util.*;
import com.rsqu.leetcode.util.TestUtil;

public class Lcci0804PowerSet {
    // 题目描述：本目录 README.md。

    public List<List<Integer>> solution(int[] nums) {
        // TODO：请实现解法
        return null;
    }

    public static void main(String[] args) {
        Lcci0804PowerSet solution = new Lcci0804PowerSet();

        // 示例1
        int[] nums1 = new int[]{1, 2, 3};
        Object result1 = solution.solution(nums1);
        Object expected1 = java.util.Arrays.asList(java.util.Arrays.asList(3), java.util.Arrays.asList(1), java.util.Arrays.asList(2), java.util.Arrays.asList(1, 2, 3), java.util.Arrays.asList(1, 3), java.util.Arrays.asList(2, 3), java.util.Arrays.asList(1, 2), java.util.Arrays.asList());
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

    }
}
