package com.rsqu.leetcode.lcof.面试题57_ii_和为s的连续正数序列;

import com.rsqu.leetcode.util.TestUtil;

public class Lcof57II {
    // 题目描述：本目录 README.md。

    public int[][] solution(int target) {
        // TODO：请实现解法
        return new int[][]{};
    }

    public static void main(String[] args) {
        Lcof57II solution = new Lcof57II();

        // 示例1
        int target1 = 9;
        Object result1 = solution.solution(target1);
        Object expected1 = new int[][]{{2, 3, 4}, {4, 5}};
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        int target2 = 15;
        Object result2 = solution.solution(target2);
        Object expected2 = new int[][]{{1, 2, 3, 4, 5}, {4, 5, 6}, {7, 8}};
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

    }
}
