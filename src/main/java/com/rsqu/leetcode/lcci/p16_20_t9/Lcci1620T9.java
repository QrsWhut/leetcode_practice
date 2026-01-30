package com.rsqu.leetcode.lcci.p16_20_t9;

import java.util.*;
import com.rsqu.leetcode.util.TestUtil;

public class Lcci1620T9 {
    // 题目描述：本目录 README.md。

    public List<String> solution(String num, String[] words) {
        // TODO：请实现解法
        return null;
    }

    public static void main(String[] args) {
        Lcci1620T9 solution = new Lcci1620T9();

        // 示例1
        String num1 = "8733";
        String[] words1 = new String[]{"tree", "used"};
        Object result1 = solution.solution(num1, words1);
        Object expected1 = java.util.Arrays.asList("tree", "used");
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        String num2 = "2";
        String[] words2 = new String[]{"a", "b", "c", "d"};
        Object result2 = solution.solution(num2, words2);
        Object expected2 = java.util.Arrays.asList("a", "b", "c");
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

    }
}
