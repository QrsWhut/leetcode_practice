package com.rsqu.leetcode.lcof2.剑指_offer_ii_063_替换单词;

import java.util.*;
import com.rsqu.leetcode.util.TestUtil;

public class Lcof2_063 {
    // 题目描述：本目录 README.md。

    public String solution(List<String> dictionary, String sentence) {
        // TODO：请实现解法
        return null;
    }

    public static void main(String[] args) {
        Lcof2_063 solution = new Lcof2_063();

        // 示例1
        List<String> dictionary1 = java.util.Arrays.asList("cat", "bat", "rat");
        String sentence1 = "the cattle was rattled by the battery";
        Object result1 = solution.solution(dictionary1, sentence1);
        Object expected1 = "the cat was rat by the bat";
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        List<String> dictionary2 = java.util.Arrays.asList("a", "b", "c");
        String sentence2 = "aadsfasf absbs bbab cadsfafs";
        Object result2 = solution.solution(dictionary2, sentence2);
        Object expected2 = "a a b c";
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

        // 示例3
        List<String> dictionary3 = java.util.Arrays.asList("a", "aa", "aaa", "aaaa");
        String sentence3 = "a aa a aaaa aaa aaa aaa aaaaaa bbb baba ababa";
        Object result3 = solution.solution(dictionary3, sentence3);
        Object expected3 = "a a a a a a a a bbb baba a";
        boolean pass3 = TestUtil.isEqual(result3, expected3);
        System.out.println("示例3：" + (pass3 ? "通过" : "失败") + "，输出=" + TestUtil.format(result3) + "，期望=" + TestUtil.format(expected3));

        // 示例4
        List<String> dictionary4 = java.util.Arrays.asList("catt", "cat", "bat", "rat");
        String sentence4 = "the cattle was rattled by the battery";
        Object result4 = solution.solution(dictionary4, sentence4);
        Object expected4 = "the cat was rat by the bat";
        boolean pass4 = TestUtil.isEqual(result4, expected4);
        System.out.println("示例4：" + (pass4 ? "通过" : "失败") + "，输出=" + TestUtil.format(result4) + "，期望=" + TestUtil.format(expected4));

        // 示例5
        List<String> dictionary5 = java.util.Arrays.asList("ac", "ab");
        String sentence5 = "it is abnormal that this solution is accepted";
        Object result5 = solution.solution(dictionary5, sentence5);
        Object expected5 = "it is ab that this solution is ac";
        boolean pass5 = TestUtil.isEqual(result5, expected5);
        System.out.println("示例5：" + (pass5 ? "通过" : "失败") + "，输出=" + TestUtil.format(result5) + "，期望=" + TestUtil.format(expected5));

    }
}
