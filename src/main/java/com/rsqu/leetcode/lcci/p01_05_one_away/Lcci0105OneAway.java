package com.rsqu.leetcode.lcci.p01_05_one_away;

import com.rsqu.leetcode.util.TestUtil;

import java.util.HashMap;
import java.util.Map;

public class Lcci0105OneAway {
    // 题目描述：本目录 README.md。

    public boolean solution(String first, String second) {
        int len1 = first.length();
        int len2 = second.length();
        int subLen = Math.abs(len1-len2);
        char[] charArray = first.toCharArray();
        char[] charArray2 = second.toCharArray();
        if (subLen > 1) {
            return false;
        }
        int[] str1 = new int[26];
        int[] str2 = new int[26];
        for (char c : charArray) {
            str1[c - 'a']++;
        }
        for (char c : charArray2) {
            str2[c - 'a']++;
        }
        int count = 0;
        for (int i = 0; i < 26; i++) {
            if (str1[i] != str2[i]) {
                count++;
            }
        }
        if (subLen == 1 && count > 1) return false;
        if (subLen == 0 && count > 2) return false;
        return true;
    }

    public static void main(String[] args) {
        Lcci0105OneAway solution = new Lcci0105OneAway();

        // 示例1
        String first1 = "pale";
        String second1 = "ple";
        Object result1 = solution.solution(first1, second1);
        Object expected1 = true;
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        String first2 = "pales";
        String second2 = "pal";
        Object result2 = solution.solution(first2, second2);
        Object expected2 = false;
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

    }
}
