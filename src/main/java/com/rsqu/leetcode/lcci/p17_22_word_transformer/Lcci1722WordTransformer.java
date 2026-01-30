package com.rsqu.leetcode.lcci.p17_22_word_transformer;

import java.util.*;
import com.rsqu.leetcode.util.TestUtil;

public class Lcci1722WordTransformer {
    // 题目描述：本目录 README.md。

    public List<String> solution(String beginWord, String endWord, List<String> wordList) {
        // TODO：请实现解法
        return null;
    }

    public static void main(String[] args) {
        Lcci1722WordTransformer solution = new Lcci1722WordTransformer();

        // 示例1
        String beginWord1 = "hit";
        String endWord1 = "cog";
        List<String> wordList1 = java.util.Arrays.asList("hot", "dot", "dog", "lot", "log", "cog");
        Object result1 = solution.solution(beginWord1, endWord1, wordList1);
        Object expected1 = java.util.Arrays.asList("hit", "hot", "dot", "lot", "log", "cog");
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        String beginWord2 = ""hit" endWord = "cog" wordList = ["hot","dot","dog","lot","log"]";
        // TODO：为 endWord2 设置输入
        // TODO：为 wordList2 设置输入
        Object result2 = solution.solution(beginWord2, endWord2, wordList2);
        Object expected2 = [] 解释: endWord "cog" 不在字典中，所以不存在符合要求的转换序列。;
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

    }
}
