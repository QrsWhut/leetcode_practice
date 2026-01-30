package com.rsqu.leetcode.lcof.面试题57_和为s的两个数字;

import com.rsqu.leetcode.util.TestUtil;

public class Lcof57 {
    // 题目描述：本目录 README.md。

    public int[] solution(int[] nums, int target) {
        // TODO：请实现解法
        return new int[]{};
    }

    public static void main(String[] args) {
        Lcof57 solution = new Lcof57();

        // 示例1
        int[] nums1 = new int[]{2, 7, 11, 15};
        int target1 = 9;
        Object result1 = solution.solution(nums1, target1);
        // 期望输出可能包含多个结果：[2,7] 或者 [7,2]
        System.out.println("示例1输出：" + TestUtil.format(result1));

        // 示例2
        int[] nums2 = new int[]{10, 26, 30, 31, 47, 60};
        int target2 = 40;
        Object result2 = solution.solution(nums2, target2);
        // 期望输出可能包含多个结果：[10,30] 或者 [30,10]
        System.out.println("示例2输出：" + TestUtil.format(result2));

    }
}
