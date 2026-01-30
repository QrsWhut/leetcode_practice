package com.rsqu.leetcode.lcof2.剑指_offer_ii_033_变位词组;

import java.util.*;
import com.rsqu.leetcode.util.TestUtil;

public class Lcof2_033 {
    // 题目描述：本目录 README.md。

    public List<List<String>> solution(String[] strs) {
        // TODO：请实现解法
        return null;
    }

    public static void main(String[] args) {
        Lcof2_033 solution = new Lcof2_033();

        // 示例1
        String[] strs1 = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
        Object result1 = solution.solution(strs1);
        Object expected1 = java.util.Arrays.asList(java.util.Arrays.asList("bat"), java.util.Arrays.asList("nat", "tan"), java.util.Arrays.asList("ate", "eat", "tea"));
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        String[] strs2 = new String[]{""};
        Object result2 = solution.solution(strs2);
        Object expected2 = java.util.Arrays.asList(java.util.Arrays.asList(""));
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

        // 示例3
        String[] strs3 = new String[]{"a"};
        Object result3 = solution.solution(strs3);
        Object expected3 = java.util.Arrays.asList(java.util.Arrays.asList("a"));
        boolean pass3 = TestUtil.isEqual(result3, expected3);
        System.out.println("示例3：" + (pass3 ? "通过" : "失败") + "，输出=" + TestUtil.format(result3) + "，期望=" + TestUtil.format(expected3));

    }
}
