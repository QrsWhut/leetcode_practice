package com.rsqu.leetcode.lcci.p16_04_tic_tac_toe;

import com.rsqu.leetcode.util.TestUtil;

public class Lcci1604TicTacToe {
    // 题目描述：本目录 README.md。

    public String solution(String[] board) {
        // TODO：请实现解法
        return null;
    }

    public static void main(String[] args) {
        Lcci1604TicTacToe solution = new Lcci1604TicTacToe();

        // 示例1
        String[] board1 = new String[]{"O X", " XO", "X O"};
        Object result1 = solution.solution(board1);
        Object expected1 = "X";
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        String[] board2 = new String[]{"OOX", "XXO", "OXO"};
        Object result2 = solution.solution(board2);
        Object expected2 = ""Draw" 解释: 没有玩家获胜且不存在空位";
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

        // 示例3
        String[] board3 = new String[]{"OOX", "XXO", "OX "};
        Object result3 = solution.solution(board3);
        Object expected3 = ""Pending" 解释: 没有玩家获胜且仍存在空位";
        boolean pass3 = TestUtil.isEqual(result3, expected3);
        System.out.println("示例3：" + (pass3 ? "通过" : "失败") + "，输出=" + TestUtil.format(result3) + "，期望=" + TestUtil.format(expected3));

    }
}
