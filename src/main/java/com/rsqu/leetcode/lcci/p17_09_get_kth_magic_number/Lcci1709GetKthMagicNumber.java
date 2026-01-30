package com.rsqu.leetcode.lcci.p17_09_get_kth_magic_number;

import com.rsqu.leetcode.util.TestUtil;

public class Lcci1709GetKthMagicNumber {
    // 题目描述：本目录 README.md。

    public int solution(int k) {
        // TODO：请实现解法
        return 0;
    }

    public static void main(String[] args) {
        Lcci1709GetKthMagicNumber solution = new Lcci1709GetKthMagicNumber();

        // 示例1
        int k1 = 5;
        Object result1 = solution.solution(k1);
        Object expected1 = 9;
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

    }
}
