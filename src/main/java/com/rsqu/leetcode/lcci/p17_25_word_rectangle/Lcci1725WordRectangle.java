package com.rsqu.leetcode.lcci.p17_25_word_rectangle;

import com.rsqu.leetcode.util.TestUtil;

public class Lcci1725WordRectangle {
    // 题目描述：本目录 README.md。

    public String[] solution(String[] words) {
        // TODO：请实现解法
        return new String[]{};
    }

    public static void main(String[] args) {
        Lcci1725WordRectangle solution = new Lcci1725WordRectangle();

        // 示例1
        String[] words1 = new String[]{"this", "real", "hard", "trh", "hea", "iar", "sld"};
        Object result1 = solution.solution(words1);
        Object expected1 = new String[]{"this", "real", "hard"};
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        String[] words2 = new String[]{"aa"};
        Object result2 = solution.solution(words2);
        Object expected2 = new String[]{"aa", "aa"};
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

    }
}
