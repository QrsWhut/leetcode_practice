package com.rsqu.leetcode.lcof2.剑指_offer_ii_117_相似的字符串;

import com.rsqu.leetcode.util.TestUtil;

public class Lcof2_117 {
    // 题目描述：本目录 README.md。

    public int solution(String[] strs) {
        // TODO：请实现解法
        return 0;
    }

    public static void main(String[] args) {
        Lcof2_117 solution = new Lcof2_117();

        // 示例1
        String[] strs1 = new String[]{"tars", "rats", "arts", "star"};
        Object result1 = solution.solution(strs1);
        Object expected1 = 2;
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        String[] strs2 = new String[]{"omv", "ovm"};
        Object result2 = solution.solution(strs2);
        Object expected2 = 1;
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

    }
}
