package com.rsqu.leetcode.lcof2.剑指_offer_ii_110_所有路径;

import java.util.*;
import com.rsqu.leetcode.util.TestUtil;

public class Lcof2_110 {
    // 题目描述：本目录 README.md。

    public List<List<Integer>> solution(int[][] graph) {
        // TODO：请实现解法
        return null;
    }

    public static void main(String[] args) {
        Lcof2_110 solution = new Lcof2_110();

        // 示例1
        int[][] graph1 = new int[][]{{1, 2}, {3}, {3}, {}};
        Object result1 = solution.solution(graph1);
        Object expected1 = java.util.Arrays.asList(java.util.Arrays.asList(0,1,3),java.util.Arrays.asList(0,2,3)); // 解释:有两条路径 0 -> 1 -> 3 和 0 -> 2 -> 3
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        int[][] graph2 = new int[][]{{4, 3, 1}, {3, 2, 4}, {3}, {4}, {}};
        Object result2 = solution.solution(graph2);
        Object expected2 = java.util.Arrays.asList(java.util.Arrays.asList(0, 4), java.util.Arrays.asList(0, 3, 4), java.util.Arrays.asList(0, 1, 3, 4), java.util.Arrays.asList(0, 1, 2, 3, 4), java.util.Arrays.asList(0, 1, 4));
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

        // 示例3
        int[][] graph3 = new int[][]{{1}, {}};
        Object result3 = solution.solution(graph3);
        Object expected3 = java.util.Arrays.asList(java.util.Arrays.asList(0, 1));
        boolean pass3 = TestUtil.isEqual(result3, expected3);
        System.out.println("示例3：" + (pass3 ? "通过" : "失败") + "，输出=" + TestUtil.format(result3) + "，期望=" + TestUtil.format(expected3));

        // 示例4
        int[][] graph4 = new int[][]{{1, 2, 3}, {2}, {3}, {}};
        Object result4 = solution.solution(graph4);
        Object expected4 = java.util.Arrays.asList(java.util.Arrays.asList(0, 1, 2, 3), java.util.Arrays.asList(0, 2, 3), java.util.Arrays.asList(0, 3));
        boolean pass4 = TestUtil.isEqual(result4, expected4);
        System.out.println("示例4：" + (pass4 ? "通过" : "失败") + "，输出=" + TestUtil.format(result4) + "，期望=" + TestUtil.format(expected4));

        // 示例5
        int[][] graph5 = new int[][]{{1, 3}, {2}, {3}, {}};
        Object result5 = solution.solution(graph5);
        Object expected5 = java.util.Arrays.asList(java.util.Arrays.asList(0, 1, 2, 3), java.util.Arrays.asList(0, 3));
        boolean pass5 = TestUtil.isEqual(result5, expected5);
        System.out.println("示例5：" + (pass5 ? "通过" : "失败") + "，输出=" + TestUtil.format(result5) + "，期望=" + TestUtil.format(expected5));

    }
}
