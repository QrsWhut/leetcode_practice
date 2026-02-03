package com.rsqu.leetcode.lcof2.剑指_offer_ii_097_子序列的数目;

import com.rsqu.leetcode.util.TestUtil;

public class Lcof2_097 {
    // 题目描述：本目录 README.md。

    public int solution(String s, String t) {
        // TODO：请实现解法
        return 0;
    }

    public static void main(String[] args) {
        Lcof2_097 solution = new Lcof2_097();

        // 示例1
        String s1 = "rabbbit";
        String t1 = "rabbit";
        Object result1 = solution.solution(s1, t1);
        Object expected1 = 3; // 解释: 如下图所示, 有 3 种可以从 s 中得到 "rabbit" 的方案。 rabbbit rabbbit rabbbit
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        String s2 = "babgbag";
        String t2 = "bag";
        Object result2 = solution.solution(s2, t2);
        Object expected2 = 5; // 解释: 如下图所示, 有 5 种可以从 s 中得到 "bag" 的方案。 babgbag babgbag babgbag babgbag babgbag
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

    }
}
