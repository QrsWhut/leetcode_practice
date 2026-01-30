package com.rsqu.leetcode.lcci.p17_10_find_majority_element;

import com.rsqu.leetcode.util.TestUtil;

public class Lcci1710FindMajorityElement {
    // 题目描述：本目录 README.md。

    public int solution(int[] nums) {
        // TODO：请实现解法
        return 0;
    }

    public static void main(String[] args) {
        Lcci1710FindMajorityElement solution = new Lcci1710FindMajorityElement();

        // 示例1
        int[] nums1 = new int[]{1, 2, 5, 9, 5, 9, 5, 5, 5};
        Object result1 = solution.solution(nums1);
        Object expected1 = 5;
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        int[] nums2 = new int[]{3, 2};
        Object result2 = solution.solution(nums2);
        Object expected2 = -1;
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

        // 示例3
        int[] nums3 = new int[]{2, 2, 1, 1, 1, 2, 2};
        Object result3 = solution.solution(nums3);
        Object expected3 = 2;
        boolean pass3 = TestUtil.isEqual(result3, expected3);
        System.out.println("示例3：" + (pass3 ? "通过" : "失败") + "，输出=" + TestUtil.format(result3) + "，期望=" + TestUtil.format(expected3));

    }
}
