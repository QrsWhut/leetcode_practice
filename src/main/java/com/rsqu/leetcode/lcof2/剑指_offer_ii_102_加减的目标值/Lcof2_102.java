package com.rsqu.leetcode.lcof2.剑指_offer_ii_102_加减的目标值;

import com.rsqu.leetcode.util.TestUtil;

public class Lcof2_102 {
    // 题目描述：本目录 README.md。

    public int solution(int[] nums, int target) {
        // TODO：请实现解法
        return 0;
    }

    public static void main(String[] args) {
        Lcof2_102 solution = new Lcof2_102();

        // 示例1
        int[] nums1 = new int[]{1, 1, 1, 1, 1};
        int target1 = 3;
        Object result1 = solution.solution(nums1, target1);
        Object expected1 = 5 解释:一共有 5 种方法让最终目标和为 3 。 -1 + 1 + 1 + 1 + 1 = 3 +1 - 1 + 1 + 1 + 1 = 3 +1 + 1 - 1 + 1 + 1 = 3 +1 + 1 + 1 - 1 + 1 = 3 +1 + 1 + 1 + 1 - 1 = 3;
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        int[] nums2 = new int[]{1};
        int target2 = 1;
        Object result2 = solution.solution(nums2, target2);
        Object expected2 = 1;
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

    }
}
