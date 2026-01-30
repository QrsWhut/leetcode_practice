package com.rsqu.leetcode.lcof.面试题12_矩阵中的路径;

import com.rsqu.leetcode.util.TestUtil;

public class Lcof12 {
    // 题目描述：本目录 README.md。

    public boolean solution(char[][] board, String word) {
        // TODO：请实现解法
        return false;
    }

    public static void main(String[] args) {
        Lcof12 solution = new Lcof12();

        // 示例1
        char[][] board1 = new char[][]{{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        String word1 = "ABCCED";
        Object result1 = solution.solution(board1, word1);
        Object expected1 = true;
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        char[][] board2 = new char[][]{{'a', 'b'}, {'c', 'd'}};
        String word2 = "abcd";
        Object result2 = solution.solution(board2, word2);
        Object expected2 = false;
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

    }
}
