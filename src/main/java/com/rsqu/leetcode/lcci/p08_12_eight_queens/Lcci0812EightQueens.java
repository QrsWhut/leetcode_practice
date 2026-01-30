package com.rsqu.leetcode.lcci.p08_12_eight_queens;

import java.util.*;
import com.rsqu.leetcode.util.TestUtil;

public class Lcci0812EightQueens {
    // 题目描述：本目录 README.md。

    public List<List<String>> solution(int n) {
        // TODO：请实现解法
        return null;
    }

    public static void main(String[] args) {
        Lcci0812EightQueens solution = new Lcci0812EightQueens();

        // 示例1
        int n1 = 4;
        Object result1 = solution.solution(n1);
        Object expected1 = java.util.Arrays.asList(java.util.Arrays.asList(".Q..", "...Q", "Q...", "..Q."), java.util.Arrays.asList("..Q.", "Q...", "...Q", ".Q.."]] 解释: 4 皇后问题存在如下两个不同的解法。 [ [".Q..",  // 解法 1 "...Q", "Q...", "..Q."], ["..Q.",  // 解法 2 "Q...", "...Q", ".Q.."));
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

    }
}
