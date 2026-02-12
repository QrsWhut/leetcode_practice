package com.rsqu.leetcode.lcci.p01_09_string_rotation;

import com.rsqu.leetcode.util.TestUtil;

public class Lcci0109StringRotation {
    // 题目描述：本目录 README.md。

    public boolean solution(String s1, String s2) {
        int l1 = s1.length();
        int l2 = s2.length();
        if (l1 != l2) {
            return false;
        }
        int count = 0;
        int start;
        for (int i = 0; i < l2; i++) {
            if (s1.charAt(0) == s2.charAt(i)) {
                start = i;
                for (int j = start,z = 0; z < s1.length(); z++,j=(j+1)%l2) {
                    if (s1.charAt(z) == s2.charAt(j)) {
                        count++;
                    } else {
                        count = 0;
                    }
                }
                if (count == l1) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Lcci0109StringRotation solution = new Lcci0109StringRotation();

        // 示例1
        String s11 = "waterbottle";
        String s21 = "erbottlewat";
        Object result1 = solution.solution(s11, s21);
        Object expected1 = true;
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        String s12 = "aa";
        String s22 = "aba";
        Object result2 = solution.solution(s12, s22);
        Object expected2 = false;
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

    }
}
