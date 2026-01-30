package com.rsqu.leetcode.lcof2.剑指_offer_ii_035_最小时间差;

import java.util.*;
import com.rsqu.leetcode.util.TestUtil;

public class Lcof2_035 {
    // 题目描述：本目录 README.md。

    public int solution(List<String> timePoints) {
        // TODO：请实现解法
        return 0;
    }

    public static void main(String[] args) {
        Lcof2_035 solution = new Lcof2_035();

        // 示例1
        List<String> timePoints1 = java.util.Arrays.asList("23:59", "00:00");
        Object result1 = solution.solution(timePoints1);
        Object expected1 = 1;
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        List<String> timePoints2 = java.util.Arrays.asList("00:00", "23:59", "00:00");
        Object result2 = solution.solution(timePoints2);
        Object expected2 = 0;
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

    }
}
