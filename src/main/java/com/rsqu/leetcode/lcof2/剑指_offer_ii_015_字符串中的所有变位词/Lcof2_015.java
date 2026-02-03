package com.rsqu.leetcode.lcof2.剑指_offer_ii_015_字符串中的所有变位词;

import com.rsqu.leetcode.util.TestUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lcof2_015 {
    // 题目描述：见本目录 README.md
    public List<Integer> solution(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if (s == null || p == null || s.length() < p.length()) {
            return result;
        }

        int m = s.length();
        int n = p.length();
        int[] count = new int[26];
        for (int i = 0; i < n; i++) {
            count[s.charAt(i) - 'a']++;
            count[p.charAt(i) - 'a']--;
        }

        int diff = 0;
        for (int value : count) {
            if (value != 0) {
                diff++;
            }
        }
        if (diff == 0) {
            result.add(0);
        }

        for (int i = n; i < m; i++) {
            int out = s.charAt(i - n) - 'a';
            int in = s.charAt(i) - 'a';
            if (count[out] == 0) {
                diff++;
            }
            count[out]--;
            if (count[out] == 0) {
                diff--;
            }
            if (count[in] == 0) {
                diff++;
            }
            count[in]++;
            if (count[in] == 0) {
                diff--;
            }
            if (diff == 0) {
                result.add(i - n + 1);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Lcof2_015 solution = new Lcof2_015();

        // 示例1
        String s1 = "cbaebabacd";
        String p1 = "abc";
        Object result1 = solution.solution(s1, p1);
        Object expected1 = Arrays.asList(0, 6);
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1)
                + "，期望=" + TestUtil.format(expected1));

        // 示例2
        String s2 = "abab";
        String p2 = "ab";
        Object result2 = solution.solution(s2, p2);
        Object expected2 = Arrays.asList(0, 1, 2);
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2)
                + "，期望=" + TestUtil.format(expected2));
    }
}
