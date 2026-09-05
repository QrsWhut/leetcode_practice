package com.rsqu.leetcode.lcci.p01_05_one_away;

import com.rsqu.leetcode.util.TestUtil;

import java.util.HashMap;
import java.util.Map;

public class Lcci0105OneAway {
    // 题目描述：本目录 README.md。

    public boolean solution(String first, String second) {
        int m = first.length(), n = second.length();
        if (m < n) {
            return solution(second, first);
        }
        if (m - n > 1) {
            return false;
        }
        int cnt = 0;
        if (m == n) {
            for (int i = 0; i < n; ++i) {
                if (first.charAt(i) != second.charAt(i)) {
                    if (++cnt > 1) {
                        return false;
                    }
                }
            }
            return true;
        }
        for (int i = 0, j = 0; i < m; ++i) {
            if (j == n || (j < n && first.charAt(i) != second.charAt(j))) {
                ++cnt;
            } else {
                ++j;
            }
        }
        return cnt < 2;
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
