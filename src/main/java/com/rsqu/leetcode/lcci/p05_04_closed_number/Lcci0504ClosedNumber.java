package com.rsqu.leetcode.lcci.p05_04_closed_number;

import com.rsqu.leetcode.util.TestUtil;

public class Lcci0504ClosedNumber {
    // 题目描述：本目录 README.md。

    public int[] solution(int num) {
        // TODO：请实现解法
        return new int[]{};
    }

    public static void main(String[] args) {
        Lcci0504ClosedNumber solution = new Lcci0504ClosedNumber();

        // 示例1
        int num1 = 2; // 或者 0b10
        Object result1 = solution.solution(num1);
        // 期望输出可能包含多个结果：[4, 1] 或者（[0b100, 0b1]）
        System.out.println("示例1输出：" + TestUtil.format(result1));

        // 示例2
        int num2 = 1;
        Object result2 = solution.solution(num2);
        Object expected2 = new int[]{2, -1};
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

    }
}
