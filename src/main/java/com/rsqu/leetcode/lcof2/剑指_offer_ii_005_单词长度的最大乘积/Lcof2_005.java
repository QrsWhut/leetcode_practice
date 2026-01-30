package com.rsqu.leetcode.lcof2.剑指_offer_ii_005_单词长度的最大乘积;

import com.rsqu.leetcode.util.TestUtil;

public class Lcof2_005 {
    // 题目描述：本目录 README.md。

    public int solution(String[] words) {
        // TODO：请实现解法
        return 0;
    }

    public static void main(String[] args) {
        Lcof2_005 solution = new Lcof2_005();

        // 示例1
        String[] words1 = new String[]{"abcw", "baz", "foo", "bar", "fxyz", "abcdef"};
        Object result1 = solution.solution(words1);
        Object expected1 = 16 解释: 这两个单词为 "abcw", "fxyz"。它们不包含相同字符，且长度的乘积最大。;
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        String[] words2 = new String[]{"a", "ab", "abc", "d", "cd", "bcd", "abcd"};
        Object result2 = solution.solution(words2);
        Object expected2 = 4 解释: 这两个单词为 "ab", "cd"。;
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

        // 示例3
        String[] words3 = new String[]{"a", "aa", "aaa", "aaaa"};
        Object result3 = solution.solution(words3);
        Object expected3 = 0 解释: 不存在这样的两个单词。;
        boolean pass3 = TestUtil.isEqual(result3, expected3);
        System.out.println("示例3：" + (pass3 ? "通过" : "失败") + "，输出=" + TestUtil.format(result3) + "，期望=" + TestUtil.format(expected3));

    }
}
