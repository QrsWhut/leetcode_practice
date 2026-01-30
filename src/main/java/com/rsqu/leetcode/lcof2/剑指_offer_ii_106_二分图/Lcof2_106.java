package com.rsqu.leetcode.lcof2.剑指_offer_ii_106_二分图;

import com.rsqu.leetcode.util.TestUtil;

public class Lcof2_106 {
    // 题目描述：本目录 README.md。

    public boolean solution(int[][] graph) {
        // TODO：请实现解法
        return false;
    }

    public static void main(String[] args) {
        Lcof2_106 solution = new Lcof2_106();

        // 示例1
        int[][] graph1 = new int[][]{{1, 2, 3}, {0, 2}, {0, 1, 3}, {0, 2}};
        Object result1 = solution.solution(graph1);
        Object expected1 = false 解释:不能将节点分割成两个独立的子集，以使每条边都连通一个子集中的一个节点与另一个子集中的一个节点。;
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        int[][] graph2 = new int[][]{{1, 3}, {0, 2}, {1, 3}, {0, 2}};
        Object result2 = solution.solution(graph2);
        Object expected2 = true 解释:可以将节点分成两组: {0, 2} 和 {1, 3} 。;
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

    }
}
