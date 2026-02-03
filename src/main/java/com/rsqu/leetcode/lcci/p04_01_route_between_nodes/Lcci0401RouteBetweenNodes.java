package com.rsqu.leetcode.lcci.p04_01_route_between_nodes;

import com.rsqu.leetcode.util.TestUtil;

public class Lcci0401RouteBetweenNodes {
    // 题目描述：本目录 README.md。

    public boolean solution(int n, int[][] graph, int start, int target) {
        // TODO：请实现解法
        return false;
    }

    public static void main(String[] args) {
        Lcci0401RouteBetweenNodes solution = new Lcci0401RouteBetweenNodes();

        // 示例1
        int n1 = 3;
        int[][] graph1 = new int[][]{{0, 1}, {0, 2}, {1, 2}, {1, 2}};
        int start1 = 0;
        int target1 = 2;
        Object result1 = solution.solution(n1, graph1, start1, target1);
        Object expected1 = true;
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        int n2 = 5;
        int[][] graph2 = new int[][]{{0, 1}, {0, 2}, {0, 4}, {0, 4}, {0, 1}, {1, 3}, {1, 4}, {1, 3}, {2, 3}, {3, 4}};
        int start2 = 0;
        int target2 = 4; // 输出 true
        Object result2 = solution.solution(n2, graph2, start2, target2);
        System.out.println("示例2输出：" + TestUtil.format(result2));

    }
}
