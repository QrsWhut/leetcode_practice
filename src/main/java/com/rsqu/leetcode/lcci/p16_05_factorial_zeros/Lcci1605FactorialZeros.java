package com.rsqu.leetcode.lcci.p16_05_factorial_zeros;

import com.rsqu.leetcode.util.TestUtil;

public class Lcci1605FactorialZeros {
    // 题目描述：本目录 README.md。

    public int solution(int n) {
        // TODO：请实现解法
        return 0;
    }

    public static void main(String[] args) {
        Lcci1605FactorialZeros solution = new Lcci1605FactorialZeros();

        // 示例1
        int n1 = 3;
        Object result1 = solution.solution(n1);
        Object expected1 = 0 解释: 3! = 6, 尾数中没有零。;
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        int n2 = 5;
        Object result2 = solution.solution(n2);
        Object expected2 = 1 解释: 5! = 120, 尾数中有 1 个零.;
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

    }
}
