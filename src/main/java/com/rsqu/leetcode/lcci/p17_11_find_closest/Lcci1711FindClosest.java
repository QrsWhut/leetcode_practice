package com.rsqu.leetcode.lcci.p17_11_find_closest;

import com.rsqu.leetcode.util.TestUtil;

public class Lcci1711FindClosest {
    // 题目描述：本目录 README.md。

    public int solution(String[] words, String word1, String word2) {
        // TODO：请实现解法
        return 0;
    }

    public static void main(String[] args) {
        Lcci1711FindClosest solution = new Lcci1711FindClosest();

        // 示例1
        String[] words1 = new String[]{"I", "am", "a", "student", "from", "a", "university", "in", "a", "city"};
        String word11 = "a";
        String word21 = "student";
        Object result1 = solution.solution(words1, word11, word21);
        Object expected1 = 1;
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

    }
}
