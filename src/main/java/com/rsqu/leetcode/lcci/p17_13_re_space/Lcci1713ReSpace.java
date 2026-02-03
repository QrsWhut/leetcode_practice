package com.rsqu.leetcode.lcci.p17_13_re_space;

import com.rsqu.leetcode.util.TestUtil;

public class Lcci1713ReSpace {
    // 题目描述：本目录 README.md。

    public int solution(String[] dictionary, String sentence) {
        // TODO：请实现解法
        return 0;
    }

    public static void main(String[] args) {
        Lcci1713ReSpace solution = new Lcci1713ReSpace();

        // 示例1
        String[] dictionary1 = new String[]{"looked", "just", "like", "her", "brother"};
        String sentence1 = "jesslookedjustliketimherbrother";
        Object result1 = solution.solution(dictionary1, sentence1);
        Object expected1 = 7; // 解释: 断句后为"jess looked just like tim her brother"，共7个未识别字符。
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

    }
}
