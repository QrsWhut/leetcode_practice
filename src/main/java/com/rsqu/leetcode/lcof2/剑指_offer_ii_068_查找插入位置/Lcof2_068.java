package com.rsqu.leetcode.lcof2.剑指_offer_ii_068_查找插入位置;

import com.rsqu.leetcode.util.TestUtil;

public class Lcof2_068 {
    // 题目描述：本目录 README.md。

    public int solution(int[] nums, int target) {
        // TODO：请实现解法
        return 0;
    }

    public static void main(String[] args) {
        Lcof2_068 solution = new Lcof2_068();

        // 示例1
        int[] nums1 = new int[]{1, 3, 5, 6};
        int target1 = 5;
        Object result1 = solution.solution(nums1, target1);
        Object expected1 = 2;
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        int[] nums2 = new int[]{1, 3, 5, 6};
        int target2 = 2;
        Object result2 = solution.solution(nums2, target2);
        Object expected2 = 1;
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

        // 示例3
        int[] nums3 = new int[]{1, 3, 5, 6};
        int target3 = 7;
        Object result3 = solution.solution(nums3, target3);
        Object expected3 = 4;
        boolean pass3 = TestUtil.isEqual(result3, expected3);
        System.out.println("示例3：" + (pass3 ? "通过" : "失败") + "，输出=" + TestUtil.format(result3) + "，期望=" + TestUtil.format(expected3));

        // 示例4
        int[] nums4 = new int[]{1, 3, 5, 6};
        int target4 = 0;
        Object result4 = solution.solution(nums4, target4);
        Object expected4 = 0;
        boolean pass4 = TestUtil.isEqual(result4, expected4);
        System.out.println("示例4：" + (pass4 ? "通过" : "失败") + "，输出=" + TestUtil.format(result4) + "，期望=" + TestUtil.format(expected4));

        // 示例5
        int[] nums5 = new int[]{1};
        int target5 = 0;
        Object result5 = solution.solution(nums5, target5);
        Object expected5 = 0;
        boolean pass5 = TestUtil.isEqual(result5, expected5);
        System.out.println("示例5：" + (pass5 ? "通过" : "失败") + "，输出=" + TestUtil.format(result5) + "，期望=" + TestUtil.format(expected5));

    }
}
