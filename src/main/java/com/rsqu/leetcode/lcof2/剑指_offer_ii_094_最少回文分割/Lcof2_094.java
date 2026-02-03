package com.rsqu.leetcode.lcof2.剑指_offer_ii_094_最少回文分割;

import com.rsqu.leetcode.util.TestUtil;

public class Lcof2_094 {
    // 题目描述：本目录 README.md。

    public int solution(String s) {
        // TODO：请实现解法
        return 0;
    }

    public static void main(String[] args) {
        Lcof2_094 solution = new Lcof2_094();

        // 示例1
        String s1 = "aab";
        Object result1 = solution.solution(s1);
        Object expected1 = 1; // 解释:只需一次分割就可将 s 分割成 ["aa","b"] 这样两个回文子串。
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        String s2 = "a";
        Object result2 = solution.solution(s2);
        Object expected2 = 0;
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

        // 示例3
        String s3 = "ab";
        Object result3 = solution.solution(s3);
        Object expected3 = 1;
        boolean pass3 = TestUtil.isEqual(result3, expected3);
        System.out.println("示例3：" + (pass3 ? "通过" : "失败") + "，输出=" + TestUtil.format(result3) + "，期望=" + TestUtil.format(expected3));

    }
}
