package com.rsqu.leetcode.lcof2.剑指_offer_ii_008_和大于等于_target_的最短子数组;

import com.rsqu.leetcode.util.TestUtil;

public class Lcof2_008 {
    // 题目描述：本目录 README.md。

    public int solution(int target, int[] nums) {
        // TODO：请实现解法
        return 0;
    }

    public static void main(String[] args) {
        Lcof2_008 solution = new Lcof2_008();

        // 示例1
        int target1 = 7;
        int[] nums1 = new int[]{2, 3, 1, 2, 4, 3};
        Object result1 = solution.solution(target1, nums1);
        Object expected1 = 2 解释:子数组 [4,3] 是该条件下的长度最小的子数组。;
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        int target2 = 4;
        int[] nums2 = new int[]{1, 4, 4};
        Object result2 = solution.solution(target2, nums2);
        Object expected2 = 1;
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

        // 示例3
        int target3 = 11;
        int[] nums3 = new int[]{1, 1, 1, 1, 1, 1, 1, 1};
        Object result3 = solution.solution(target3, nums3);
        Object expected3 = 0;
        boolean pass3 = TestUtil.isEqual(result3, expected3);
        System.out.println("示例3：" + (pass3 ? "通过" : "失败") + "，输出=" + TestUtil.format(result3) + "，期望=" + TestUtil.format(expected3));

    }
}
