package com.rsqu.leetcode.lcof.面试题46_把数字翻译成字符串;

import com.rsqu.leetcode.util.TestUtil;

public class Lcof46 {
    // 题目描述：本目录 README.md。

    public int solution(int num) {
        // TODO：请实现解法
        return 0;
    }

    public static void main(String[] args) {
        Lcof46 solution = new Lcof46();

        // 示例1
        int num1 = 12258;
        Object result1 = solution.solution(num1);
        Object expected1 = 5 解释: 12258有5种不同的翻译，分别是"bccfi", "bwfi", "bczi", "mcfi"和"mzi";
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

    }
}
