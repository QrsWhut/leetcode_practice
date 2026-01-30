package com.rsqu.leetcode.lcof2.剑指_offer_ii_019_最多删除一个字符得到回文;

import com.rsqu.leetcode.util.TestUtil;

public class Lcof2_019 {
    // 题目描述：本目录 README.md。

    public boolean solution(String s) {
        // TODO：请实现解法
        return false;
    }

    public static void main(String[] args) {
        Lcof2_019 solution = new Lcof2_019();

        // 示例1
        String s1 = "aba";
        Object result1 = solution.solution(s1);
        Object expected1 = true;
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        String s2 = "abca";
        Object result2 = solution.solution(s2);
        // 期望输出可能包含多个结果：true 解释: 可以删除 "c" 字符 或者 "b" 字符
        System.out.println("示例2输出：" + TestUtil.format(result2));

        // 示例3
        String s3 = "abc";
        Object result3 = solution.solution(s3);
        Object expected3 = false;
        boolean pass3 = TestUtil.isEqual(result3, expected3);
        System.out.println("示例3：" + (pass3 ? "通过" : "失败") + "，输出=" + TestUtil.format(result3) + "，期望=" + TestUtil.format(expected3));

    }
}
