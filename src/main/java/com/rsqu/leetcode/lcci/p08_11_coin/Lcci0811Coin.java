package com.rsqu.leetcode.lcci.p08_11_coin;

import com.rsqu.leetcode.util.TestUtil;

public class Lcci0811Coin {
    // 题目描述：本目录 README.md。

    public int solution(int n) {
        // TODO：请实现解法
        return 0;
    }

    public static void main(String[] args) {
        Lcci0811Coin solution = new Lcci0811Coin();

        // 示例1
        int n1 = 5;
        Object result1 = solution.solution(n1);
        Object expected1 = 2; // 解释: 有两种方式可以凑成总金额: 5=5 5=1+1+1+1+1
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        int n2 = 10;
        Object result2 = solution.solution(n2);
        Object expected2 = 4; // 解释: 有四种方式可以凑成总金额: 10=10 10=5+5 10=5+1+1+1+1+1 10=1+1+1+1+1+1+1+1+1+1
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

    }
}
