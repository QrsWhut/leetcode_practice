package com.rsqu.leetcode.lcci.p01_05_one_away;

import com.rsqu.leetcode.util.TestUtil;

public class Lcci0105OneAway {
    // 题目描述：本目录 README.md。

    public boolean solution(String first, String second) {
        // TODO：请实现解法
        return false;
    }

    public static void main(String[] args) {
        Lcci0105OneAway solution = new Lcci0105OneAway();

        // 示例1
        String first1 = "pale" second = "ple";
        // TODO：为 second1 设置输入
        Object result1 = solution.solution(first1, second1);
        Object expected1 = True;
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        String first2 = "pales" second = "pal";
        // TODO：为 second2 设置输入
        Object result2 = solution.solution(first2, second2);
        Object expected2 = False;
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

    }
}
