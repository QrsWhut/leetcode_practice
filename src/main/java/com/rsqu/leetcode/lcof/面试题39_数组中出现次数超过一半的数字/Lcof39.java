package com.rsqu.leetcode.lcof.面试题39_数组中出现次数超过一半的数字;

import com.rsqu.leetcode.util.TestUtil;

public class Lcof39 {
    // 题目描述：本目录 README.md。

    public int solution(int[] nums) {
        // TODO：请实现解法
        return 0;
    }

    public static void main(String[] args) {
        Lcof39 solution = new Lcof39();

        // 示例1
        int[] nums1 = new int[]{1, 2, 3, 2, 2, 2, 5, 4, 2};
        Object result1 = solution.solution(nums1);
        Object expected1 = 2;
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

    }
}
