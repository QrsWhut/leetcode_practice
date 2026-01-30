package com.rsqu.leetcode.lcci.p01_06_compress_string;

import com.rsqu.leetcode.util.TestUtil;

public class Lcci0106CompressString {
    // 题目描述：本目录 README.md。

    public String solution(String s) {
        // TODO：请实现解法
        return null;
    }

    public static void main(String[] args) {
        Lcci0106CompressString solution = new Lcci0106CompressString();

        // 示例1
        String s1 = "aabcccccaaa";
        Object result1 = solution.solution(s1);
        Object expected1 = "a2b1c5a3";
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        String s2 = "abbccd";
        Object result2 = solution.solution(s2);
        Object expected2 = ""abbccd" 解释:"abbccd"压缩后为"a1b2c2d1"，比原字符串长度更长。";
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

    }
}
