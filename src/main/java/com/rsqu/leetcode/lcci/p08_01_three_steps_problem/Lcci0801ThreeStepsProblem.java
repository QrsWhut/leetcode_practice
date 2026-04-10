package com.rsqu.leetcode.lcci.p08_01_three_steps_problem;

import com.rsqu.leetcode.util.TestUtil;

public class Lcci0801ThreeStepsProblem {
    // 题目描述：本目录 README.md。

    public int solution(int n) {
        int dp[] = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;
        for (int i = 4; i <= n; i++) {
            dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
        }
        return dp[n];
    }

    public static void main(String[] args) {
        Lcci0801ThreeStepsProblem solution = new Lcci0801ThreeStepsProblem();

        // 示例1
        int n1 = 3;
        Object result1 = solution.solution(n1);
        Object expected1 = 4; // 说明: 有四种走法
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        int n2 = 5;
        Object result2 = solution.solution(n2);
        Object expected2 = 13;
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

    }
}
