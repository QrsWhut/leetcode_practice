package com.rsqu.leetcode.lcci.p17_15_longest_word;

import com.rsqu.leetcode.util.TestUtil;

public class Lcci1715LongestWord {
    // 题目描述：本目录 README.md。

    public String solution(String[] words) {
        // TODO：请实现解法
        return null;
    }

    public static void main(String[] args) {
        Lcci1715LongestWord solution = new Lcci1715LongestWord();

        // 示例1
        String[] words1 = new String[]{"cat", "banana", "dog", "nana", "walk", "walker", "dogwalker"};
        Object result1 = solution.solution(words1);
        Object expected1 = "dogwalker"; // 解释: "dogwalker"可由"dog"和"walker"组成。"
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

    }
}
