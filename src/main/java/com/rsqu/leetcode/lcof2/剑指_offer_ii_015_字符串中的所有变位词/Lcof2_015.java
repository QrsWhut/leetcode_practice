package com.rsqu.leetcode.lcof2.剑指_offer_ii_015_字符串中的所有变位词;

import java.util.*;
import com.rsqu.leetcode.util.TestUtil;

public class Lcof2_015 {
    // 题目描述：本目录 README.md。

    public List<Integer> solution(String s, String p) {
        // TODO：请实现解法
        return null;
    }

    public static void main(String[] args) {
        Lcof2_015 solution = new Lcof2_015();

        // 示例1
        String s1 = "cbaebabacd";
        String p1 = "abc";
        Object result1 = solution.solution(s1, p1);
        Object expected1 = [0,6] 解释: 起始索引等于 0 的子串是 "cba", 它是 "abc" 的变位词。 起始索引等于 6 的子串是 "bac", 它是 "abc" 的变位词。;
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        String s2 = "abab";
        String p2 = "ab";
        Object result2 = solution.solution(s2, p2);
        Object expected2 = [0,1,2] 解释: 起始索引等于 0 的子串是 "ab", 它是 "ab" 的变位词。 起始索引等于 1 的子串是 "ba", 它是 "ab" 的变位词。 起始索引等于 2 的子串是 "ab", 它是 "ab" 的变位词。;
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

    }
}
