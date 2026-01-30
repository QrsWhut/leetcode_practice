package com.rsqu.leetcode.lcof2.剑指_offer_ii_104_排列的数目;

import com.rsqu.leetcode.util.TestUtil;

public class Lcof2_104 {
    // 题目描述：本目录 README.md。

    public int solution(int[] nums, int target) {
        // TODO：请实现解法
        return 0;
    }

    public static void main(String[] args) {
        Lcof2_104 solution = new Lcof2_104();

        // 示例1
        int[] nums1 = new int[]{1, 2, 3};
        int target1 = 4;
        Object result1 = solution.solution(nums1, target1);
        Object expected1 = 7 解释: 所有可能的组合为: (1, 1, 1, 1) (1, 1, 2) (1, 2, 1) (1, 3) (2, 1, 1) (2, 2) (3, 1) 请注意，顺序不同的序列被视作不同的组合。;
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        int[] nums2 = new int[]{9};
        int target2 = 3;
        Object result2 = solution.solution(nums2, target2);
        Object expected2 = 0;
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

    }
}
