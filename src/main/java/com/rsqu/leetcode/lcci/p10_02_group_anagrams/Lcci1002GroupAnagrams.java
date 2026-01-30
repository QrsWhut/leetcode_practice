package com.rsqu.leetcode.lcci.p10_02_group_anagrams;

import java.util.*;
import com.rsqu.leetcode.util.TestUtil;

public class Lcci1002GroupAnagrams {
    // 题目描述：本目录 README.md。

    public List<List<String>> solution(String[] strs) {
        // TODO：请实现解法
        return null;
    }

    public static void main(String[] args) {
        Lcci1002GroupAnagrams solution = new Lcci1002GroupAnagrams();

        // 示例1
        String[] strs1 = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
        Object result1 = solution.solution(strs1);
        Object expected1 = java.util.Arrays.asList(java.util.Arrays.asList("ate", "eat", "tea"), java.util.Arrays.asList("nat", "tan"), java.util.Arrays.asList("bat"));
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

    }
}
