package com.rsqu.leetcode.lcof2.剑指_offer_ii_087_复原_ip;

import java.util.*;
import com.rsqu.leetcode.util.TestUtil;

public class Lcof2_087 {
    // 题目描述：本目录 README.md。

    public List<String> solution(String s) {
        // TODO：请实现解法
        return null;
    }

    public static void main(String[] args) {
        Lcof2_087 solution = new Lcof2_087();

        // 示例1
        String s1 = "25525511135";
        Object result1 = solution.solution(s1);
        Object expected1 = java.util.Arrays.asList("255.255.11.135", "255.255.111.35");
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        String s2 = "0000";
        Object result2 = solution.solution(s2);
        Object expected2 = java.util.Arrays.asList("0.0.0.0");
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

        // 示例3
        String s3 = "1111";
        Object result3 = solution.solution(s3);
        Object expected3 = java.util.Arrays.asList("1.1.1.1");
        boolean pass3 = TestUtil.isEqual(result3, expected3);
        System.out.println("示例3：" + (pass3 ? "通过" : "失败") + "，输出=" + TestUtil.format(result3) + "，期望=" + TestUtil.format(expected3));

        // 示例4
        String s4 = "010010";
        Object result4 = solution.solution(s4);
        Object expected4 = java.util.Arrays.asList("0.10.0.10", "0.100.1.0");
        boolean pass4 = TestUtil.isEqual(result4, expected4);
        System.out.println("示例4：" + (pass4 ? "通过" : "失败") + "，输出=" + TestUtil.format(result4) + "，期望=" + TestUtil.format(expected4));

        // 示例5
        String s5 = "10203040";
        Object result5 = solution.solution(s5);
        Object expected5 = java.util.Arrays.asList("10.20.30.40", "102.0.30.40", "10.203.0.40");
        boolean pass5 = TestUtil.isEqual(result5, expected5);
        System.out.println("示例5：" + (pass5 ? "通过" : "失败") + "，输出=" + TestUtil.format(result5) + "，期望=" + TestUtil.format(expected5));

    }
}
