package com.rsqu.leetcode.lcci.p16_18_pattern_matching;

import com.rsqu.leetcode.util.TestUtil;

public class Lcci1618PatternMatching {
    // 题目描述：本目录 README.md。

    public boolean solution(String pattern, String value) {
        // TODO：请实现解法
        return false;
    }

    public static void main(String[] args) {
        Lcci1618PatternMatching solution = new Lcci1618PatternMatching();

        // 示例1
        String pattern1 = "abba";
        String value1 = "dogcatcatdog";
        Object result1 = solution.solution(pattern1, value1);
        Object expected1 = true;
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        String pattern2 = "abba";
        String value2 = "dogcatcatfish";
        Object result2 = solution.solution(pattern2, value2);
        Object expected2 = false;
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

        // 示例3
        String pattern3 = "aaaa";
        String value3 = "dogcatcatdog";
        Object result3 = solution.solution(pattern3, value3);
        Object expected3 = false;
        boolean pass3 = TestUtil.isEqual(result3, expected3);
        System.out.println("示例3：" + (pass3 ? "通过" : "失败") + "，输出=" + TestUtil.format(result3) + "，期望=" + TestUtil.format(expected3));

        // 示例4
        String pattern4 = "abba";
        String value4 = "dogdogdogdog";
        Object result4 = solution.solution(pattern4, value4);
        Object expected4 = true 解释: "a"="dogdog",b=""，反之也符合规则;
        boolean pass4 = TestUtil.isEqual(result4, expected4);
        System.out.println("示例4：" + (pass4 ? "通过" : "失败") + "，输出=" + TestUtil.format(result4) + "，期望=" + TestUtil.format(expected4));

    }
}
