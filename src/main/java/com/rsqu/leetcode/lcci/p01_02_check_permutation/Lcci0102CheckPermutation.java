package com.rsqu.leetcode.lcci.p01_02_check_permutation;

import com.rsqu.leetcode.util.TestUtil;

import java.util.HashMap;
import java.util.Map;

public class Lcci0102CheckPermutation {
    // 题目描述：本目录 README.md。

    public boolean solution(String s1, String s2) {
        Map<Character, Integer> map = new HashMap<>();
        char[] charArray1 = s1.toCharArray();
        char[] charArray2 = s2.toCharArray();
        for (char c : charArray1) {
            map.put(c,map.getOrDefault(c,0) + 1);
        }
        for (char c : charArray2) {
            map.put(c,map.getOrDefault(c,0) - 1);
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Lcci0102CheckPermutation solution = new Lcci0102CheckPermutation();

        // 示例1
        String s11 = "abc";
        String s21 = "bca";
        Object result1 = solution.solution(s11, s21);
        Object expected1 = true;
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        String s12 = "abc";
        String s22 = "bad";
        Object result2 = solution.solution(s12, s22);
        Object expected2 = false;
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

    }
}
