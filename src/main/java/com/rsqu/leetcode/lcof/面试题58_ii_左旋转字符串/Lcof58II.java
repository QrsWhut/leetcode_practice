package com.rsqu.leetcode.lcof.面试题58_ii_左旋转字符串;

import com.rsqu.leetcode.util.TestUtil;

public class Lcof58II {
    // 题目描述：本目录 README.md。

    public String solution(String s, int n) {
        // TODO：请实现解法
        return null;
    }

    public static void main(String[] args) {
        Lcof58II solution = new Lcof58II();

        // 示例1
        String s1 = "abcdefg";
        // TODO：为 n1 设置输入
        Object result1 = solution.solution(s1, n1);
        Object expected1 = "cdefgab";
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        String s2 = "lrloseumgh";
        // TODO：为 n2 设置输入
        Object result2 = solution.solution(s2, n2);
        Object expected2 = "umghlrlose";
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

    }
}
