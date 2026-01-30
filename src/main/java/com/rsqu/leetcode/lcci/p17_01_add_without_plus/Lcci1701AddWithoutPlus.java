package com.rsqu.leetcode.lcci.p17_01_add_without_plus;

import com.rsqu.leetcode.util.TestUtil;

public class Lcci1701AddWithoutPlus {
    // 题目描述：本目录 README.md。

    public int solution(int a, int b) {
        // TODO：请实现解法
        return 0;
    }

    public static void main(String[] args) {
        Lcci1701AddWithoutPlus solution = new Lcci1701AddWithoutPlus();

        // 示例1
        int a1 = 1;
        int b1 = 1;
        Object result1 = solution.solution(a1, b1);
        Object expected1 = 2;
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

    }
}
