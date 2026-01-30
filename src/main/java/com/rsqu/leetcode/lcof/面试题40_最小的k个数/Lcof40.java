package com.rsqu.leetcode.lcof.面试题40_最小的k个数;

import com.rsqu.leetcode.util.TestUtil;

public class Lcof40 {
    // 题目描述：本目录 README.md。

    public int[] solution(int[] arr, int k) {
        // TODO：请实现解法
        return new int[]{};
    }

    public static void main(String[] args) {
        Lcof40 solution = new Lcof40();

        // 示例1
        int[] arr1 = new int[]{3, 2, 1};
        int k1 = 2;
        Object result1 = solution.solution(arr1, k1);
        // 期望输出可能包含多个结果：[1,2] 或者 [2,1]
        System.out.println("示例1输出：" + TestUtil.format(result1));

        // 示例2
        int[] arr2 = new int[]{0, 1, 2, 1};
        int k2 = 1;
        Object result2 = solution.solution(arr2, k2);
        Object expected2 = new int[]{0};
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

    }
}
