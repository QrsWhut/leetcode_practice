package com.rsqu.leetcode.lcci.p01_03_string_to_url;

import com.rsqu.leetcode.util.TestUtil;

public class Lcci0103StringtoURL {
    // 题目描述：本目录 README.md。

    public String solution(String s, int length) {
        // TODO：请实现解法
        return null;
    }

    public static void main(String[] args) {
        Lcci0103StringtoURL solution = new Lcci0103StringtoURL();

        // 示例1
        String s1 = "Mr John Smith    ";
        int length1 = 13;
        Object result1 = solution.solution(s1, length1);
        Object expected1 = "Mr%20John%20Smith";
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        String s2 = "               ";
        int length2 = 5;
        Object result2 = solution.solution(s2, length2);
        Object expected2 = "%20%20%20%20%20";
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

    }
}
