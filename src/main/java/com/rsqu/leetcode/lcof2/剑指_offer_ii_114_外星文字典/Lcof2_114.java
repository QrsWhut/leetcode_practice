package com.rsqu.leetcode.lcof2.剑指_offer_ii_114_外星文字典;

import com.rsqu.leetcode.util.TestUtil;

public class Lcof2_114 {
    // 题目描述：本目录 README.md。

    public String solution(String[] words) {
        // TODO：请实现解法
        return null;
    }

    public static void main(String[] args) {
        Lcof2_114 solution = new Lcof2_114();

        // 示例1
        String[] words1 = new String[]{"wrt", "wrf", "er", "ett", "rftt"};
        Object result1 = solution.solution(words1);
        Object expected1 = "wertf";
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        String[] words2 = new String[]{"z", "x"};
        Object result2 = solution.solution(words2);
        Object expected2 = "zx";
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

        // 示例3
        String[] words3 = new String[]{"z", "x", "z"};
        Object result3 = solution.solution(words3);
        Object expected3 = ""; // 解释:不存在合法字母顺序，因此返回 "" 。"
        boolean pass3 = TestUtil.isEqual(result3, expected3);
        System.out.println("示例3：" + (pass3 ? "通过" : "失败") + "，输出=" + TestUtil.format(result3) + "，期望=" + TestUtil.format(expected3));

    }
}
