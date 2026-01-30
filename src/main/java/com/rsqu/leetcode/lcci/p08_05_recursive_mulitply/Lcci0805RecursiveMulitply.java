package com.rsqu.leetcode.lcci.p08_05_recursive_mulitply;

import com.rsqu.leetcode.util.TestUtil;

public class Lcci0805RecursiveMulitply {
    // 题目描述：本目录 README.md。

    public int solution(int a, int b) {
        // TODO：请实现解法
        return 0;
    }

    public static void main(String[] args) {
        Lcci0805RecursiveMulitply solution = new Lcci0805RecursiveMulitply();

        // 示例1
        int a1 = 1;
        int b1 = 10;
        Object result1 = solution.solution(a1, b1);
        Object expected1 = 10;
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        int a2 = 3;
        int b2 = 4;
        Object result2 = solution.solution(a2, b2);
        Object expected2 = 12;
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

    }
}
