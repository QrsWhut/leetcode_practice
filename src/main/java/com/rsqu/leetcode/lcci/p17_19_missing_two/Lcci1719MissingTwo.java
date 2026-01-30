package com.rsqu.leetcode.lcci.p17_19_missing_two;

import com.rsqu.leetcode.util.TestUtil;

public class Lcci1719MissingTwo {
    // 题目描述：本目录 README.md。

    public int[] solution(int[] nums) {
        // TODO：请实现解法
        return new int[]{};
    }

    public static void main(String[] args) {
        Lcci1719MissingTwo solution = new Lcci1719MissingTwo();

        // 示例1
        int[] nums1 = new int[]{1};
        Object result1 = solution.solution(nums1);
        Object expected1 = new int[]{2, 3};
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        int[] nums2 = new int[]{2, 3};
        Object result2 = solution.solution(nums2);
        Object expected2 = new int[]{1, 4};
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

    }
}
