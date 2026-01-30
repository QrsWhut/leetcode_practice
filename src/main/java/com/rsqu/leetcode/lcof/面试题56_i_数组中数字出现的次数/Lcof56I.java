package com.rsqu.leetcode.lcof.面试题56_i_数组中数字出现的次数;

import com.rsqu.leetcode.util.TestUtil;

public class Lcof56I {
    // 题目描述：本目录 README.md。

    public int[] solution(int[] nums) {
        // TODO：请实现解法
        return new int[]{};
    }

    public static void main(String[] args) {
        Lcof56I solution = new Lcof56I();

        // 示例1
        int[] nums1 = new int[]{4, 1, 4, 6};
        Object result1 = solution.solution(nums1);
        // 期望输出可能包含多个结果：[1,6] 或 [6,1]
        System.out.println("示例1输出：" + TestUtil.format(result1));

        // 示例2
        int[] nums2 = new int[]{1, 2, 10, 4, 1, 4, 3, 3};
        Object result2 = solution.solution(nums2);
        // 期望输出可能包含多个结果：[2,10] 或 [10,2]
        System.out.println("示例2输出：" + TestUtil.format(result2));

    }
}
