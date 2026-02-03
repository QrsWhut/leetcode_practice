package com.rsqu.leetcode.lcof.面试题21_调整数组顺序使奇数位于偶数前面;

import com.rsqu.leetcode.util.TestUtil;

public class Lcof21 {
    // 题目描述：本目录 README.md。

    public int[] solution(int[] nums) {
        // TODO：请实现解法
        return new int[]{};
    }

    public static void main(String[] args) {
        Lcof21 solution = new Lcof21();

        // 示例1
        int[] nums1 = new int[]{1, 2, 3, 4};
        Object result1 = solution.solution(nums1);
        Object expected1 = java.util.Arrays.asList(1,3,2,4); // 注:[3,1,2,4] 也是正确的答案之一。
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

    }
}
