package com.rsqu.leetcode.lcci.p08_02_robot_in_a_grid;

import java.util.*;
import com.rsqu.leetcode.util.TestUtil;

public class Lcci0802RobotinaGrid {
    // 题目描述：本目录 README.md。

    public List<List<Integer>> solution(int[][] obstacleGrid) {
        // TODO：请实现解法
        return null;
    }

    public static void main(String[] args) {
        Lcci0802RobotinaGrid solution = new Lcci0802RobotinaGrid();

        // 示例1
        int[][] obstacleGrid1 = new int[][]{{0, 0, 0}, {0, 1, 0}, {0, 0, 0}};
        Object result1 = solution.solution(obstacleGrid1);
        Object expected1 = java.util.Arrays.asList(java.util.Arrays.asList(0,0),java.util.Arrays.asList(0,1),java.util.Arrays.asList(0,2),java.util.Arrays.asList(1,2),java.util.Arrays.asList(2,2)); // 解释: 输入中标粗的位置即为输出表示的路径，即 0行0列（左上角） -> 0行1列 -> 0行2列 -> 1行2列 -> 2行2列（右下角）
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

    }
}
