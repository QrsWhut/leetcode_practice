package com.rsqu.leetcode.lcci.p01_04_palindrome_permutation;

import com.rsqu.leetcode.util.TestUtil;

public class Lcci0104PalindromePermutation {
    // 题目描述：本目录 README.md。

    public boolean solution(String s) {
        // TODO：请实现解法
        return false;
    }

    public static void main(String[] args) {
        Lcci0104PalindromePermutation solution = new Lcci0104PalindromePermutation();

        // 示例1
        String s1 = "tactcoa";
        Object result1 = solution.solution(s1);
        Object expected1 = true（排列有"tacocat"、"atcocta"，等等）;
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

    }
}
