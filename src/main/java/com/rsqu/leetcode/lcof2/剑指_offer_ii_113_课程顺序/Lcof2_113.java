package com.rsqu.leetcode.lcof2.剑指_offer_ii_113_课程顺序;

import com.rsqu.leetcode.util.TestUtil;

public class Lcof2_113 {
    // 题目描述：本目录 README.md。

    public int[] solution(int numCourses, int[][] prerequisites) {
        // TODO：请实现解法
        return new int[]{};
    }

    public static void main(String[] args) {
        Lcof2_113 solution = new Lcof2_113();

        // 示例1
        int numCourses1 = 2;
        int[][] prerequisites1 = new int[][]{{1, 0}};
        Object result1 = solution.solution(numCourses1, prerequisites1);
        Object expected1 = java.util.Arrays.asList(0,1); // 解释: 总共有 2 门课程。要学习课程 1，你需要先完成课程 0。因此，正确的课程顺序为 [0,1] 。
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        int numCourses2 = 4;
        int[][] prerequisites2 = new int[][]{{1, 0}, {2, 0}, {3, 1}, {3, 2}};
        Object result2 = solution.solution(numCourses2, prerequisites2);
        // 期望输出可能包含多个结果：[0,1,2,3] or [0,2,1,3] 解释: 总共有 4 门课程。要学习课程 3，你应该先完成课程 1 和课程 2。并且课程 1 和课程 2 都应该排在课程 0 之后。 因此，一个正确的课程顺序是 [0,1,2,3] 。另一个正确的排序是 [0,2,1,3] 。
        System.out.println("示例2输出：" + TestUtil.format(result2));

        // 示例3
        int numCourses3 = 1;
        int[][] prerequisites3 = new int[][]{};
        Object result3 = solution.solution(numCourses3, prerequisites3);
        Object expected3 = java.util.Arrays.asList(0); // 解释: 总共 1 门课，直接修第一门课就可。
        boolean pass3 = TestUtil.isEqual(result3, expected3);
        System.out.println("示例3：" + (pass3 ? "通过" : "失败") + "，输出=" + TestUtil.format(result3) + "，期望=" + TestUtil.format(expected3));

    }
}
