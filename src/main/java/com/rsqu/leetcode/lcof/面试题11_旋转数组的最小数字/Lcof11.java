package com.rsqu.leetcode.lcof.面试题11_旋转数组的最小数字;

import com.rsqu.leetcode.util.TestUtil;

public class Lcof11 {
    // 题目描述：本目录 README.md。

    public int solution(int[] numbers) {
        // TODO：请实现解法
        return 0;
    }

    public static void main(String[] args) {
        Lcof11 solution = new Lcof11();

        // 示例1
        int[] numbers1 = new int[]{3, 4, 5, 1, 2};
        Object result1 = solution.solution(numbers1);
        Object expected1 = 1;
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        int[] numbers2 = new int[]{2, 2, 2, 0, 1};
        Object result2 = solution.solution(numbers2);
        Object expected2 = 0;
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

    }
}
