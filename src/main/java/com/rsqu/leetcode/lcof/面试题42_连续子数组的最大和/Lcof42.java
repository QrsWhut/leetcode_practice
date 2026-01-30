package com.rsqu.leetcode.lcof.面试题42_连续子数组的最大和;

import com.rsqu.leetcode.util.TestUtil;

public class Lcof42 {
    // 题目描述：本目录 README.md。

    public int solution(int[] nums) {
        // TODO：请实现解法
        return 0;
    }

    public static void main(String[] args) {
        Lcof42 solution = new Lcof42();

        // 示例1
        int[] nums1 = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        Object result1 = solution.solution(nums1);
        Object expected1 = 6 解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。;
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

    }
}
