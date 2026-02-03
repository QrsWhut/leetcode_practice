package com.rsqu.leetcode.lcof.面试题49_丑数;

import com.rsqu.leetcode.util.TestUtil;

public class Lcof49 {
    // 题目描述：本目录 README.md。

    public int solution(int n) {
        // TODO：请实现解法
        return 0;
    }

    public static void main(String[] args) {
        Lcof49 solution = new Lcof49();

        // 示例1
        int n1 = 10;
        Object result1 = solution.solution(n1);
        Object expected1 = 12; // 解释: 1, 2, 3, 4, 5, 6, 8, 9, 10, 12 是前 10 个丑数。
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

    }
}
