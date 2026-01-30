package com.rsqu.leetcode.lcof2.剑指_offer_ii_012_左右两边子数组的和相等;

import com.rsqu.leetcode.util.TestUtil;

public class Lcof2_012 {
    // 题目描述：本目录 README.md。

    public int solution(int[] nums) {
        // TODO：请实现解法
        return 0;
    }

    public static void main(String[] args) {
        Lcof2_012 solution = new Lcof2_012();

        // 示例1
        int[] nums1 = new int[]{1, 7, 3, 6, 5, 6};
        Object result1 = solution.solution(nums1);
        Object expected1 = 3 解释: 中心下标是 3 。 左侧数之和 sum = nums[0] + nums[1] + nums[2] = 1 + 7 + 3 = 11 ， 右侧数之和 sum = nums[4] + nums[5] = 5 + 6 = 11 ，二者相等。;
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        int[] nums2 = new int[]{1, 2, 3};
        Object result2 = solution.solution(nums2);
        Object expected2 = -1 解释: 数组中不存在满足此条件的中心下标。;
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

        // 示例3
        int[] nums3 = new int[]{2, 1, -1};
        Object result3 = solution.solution(nums3);
        Object expected3 = 0 解释: 中心下标是 0 。 左侧数之和 sum = 0 ，（下标 0 左侧不存在元素）， 右侧数之和 sum = nums[1] + nums[2] = 1 + -1 = 0 。;
        boolean pass3 = TestUtil.isEqual(result3, expected3);
        System.out.println("示例3：" + (pass3 ? "通过" : "失败") + "，输出=" + TestUtil.format(result3) + "，期望=" + TestUtil.format(expected3));

    }
}
