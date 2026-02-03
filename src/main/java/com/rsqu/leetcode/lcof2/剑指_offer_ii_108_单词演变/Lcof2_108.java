package com.rsqu.leetcode.lcof2.剑指_offer_ii_108_单词演变;

import java.util.*;
import com.rsqu.leetcode.util.TestUtil;

public class Lcof2_108 {
    // 题目描述：本目录 README.md。

    public int solution(String beginWord, String endWord, List<String> wordList) {
        // TODO：请实现解法
        return 0;
    }

    public static void main(String[] args) {
        Lcof2_108 solution = new Lcof2_108();

        // 示例1
        String beginWord1 = "hit";
        String endWord1 = "cog";
        List<String> wordList1 = java.util.Arrays.asList("hot", "dot", "dog", "lot", "log", "cog");
        Object result1 = solution.solution(beginWord1, endWord1, wordList1);
        Object expected1 = 5; // 解释:一个最短转换序列是 "hit" -> "hot" -> "dot" -> "dog" -> "cog", 返回它的长度 5。
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        String beginWord2 = "hit";
        String endWord2 = "cog";
        List<String> wordList2 = java.util.Arrays.asList("hot", "dot", "dog", "lot", "log");
        Object result2 = solution.solution(beginWord2, endWord2, wordList2);
        Object expected2 = 0; // 解释:endWord "cog" 不在字典中，所以无法进行转换。
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

    }
}
