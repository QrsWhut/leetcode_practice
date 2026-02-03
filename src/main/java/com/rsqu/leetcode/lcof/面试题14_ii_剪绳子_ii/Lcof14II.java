package com.rsqu.leetcode.lcof.面试题14_ii_剪绳子_ii;

import com.rsqu.leetcode.util.TestUtil;

public class Lcof14II {
    // 题目描述：本目录 README.md。

    public int solution(int n) {
        // TODO：请实现解法
        return 0;
    }

    public static void main(String[] args) {
        Lcof14II solution = new Lcof14II();

        // 示例1
        int n1 = 2;
        Object result1 = solution.solution(n1);
        Object expected1 = 1; // 解释: 2 = 1 + 1, 1 × 1 = 1
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        int n2 = 10;
        Object result2 = solution.solution(n2);
        Object expected2 = 36; // 解释: 10 = 3 + 3 + 4, 3 × 3 × 4 = 36
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

    }
}
