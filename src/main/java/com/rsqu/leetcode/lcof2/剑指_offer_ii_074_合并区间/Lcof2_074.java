package com.rsqu.leetcode.lcof2.剑指_offer_ii_074_合并区间;

import com.rsqu.leetcode.util.TestUtil;

public class Lcof2_074 {
    // 题目描述：本目录 README.md。

    public int[][] solution(int[][] intervals) {
        // TODO：请实现解法
        return new int[][]{};
    }

    public static void main(String[] args) {
        Lcof2_074 solution = new Lcof2_074();

        // 示例1
        int[][] intervals1 = new int[][]{{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        Object result1 = solution.solution(intervals1);
        Object expected1 = [[1,6],[8,10],[15,18]] 解释:区间 [1,3] 和 [2,6] 重叠, 将它们合并为 [1,6].;
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        int[][] intervals2 = new int[][]{{1, 4}, {4, 5}};
        Object result2 = solution.solution(intervals2);
        Object expected2 = [[1,5]] 解释:区间 [1,4] 和 [4,5] 可被视为重叠区间。;
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

    }
}
