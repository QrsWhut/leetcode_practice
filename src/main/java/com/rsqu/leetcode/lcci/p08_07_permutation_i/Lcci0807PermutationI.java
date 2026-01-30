package com.rsqu.leetcode.lcci.p08_07_permutation_i;

import com.rsqu.leetcode.util.TestUtil;

public class Lcci0807PermutationI {
    // 题目描述：本目录 README.md。

    public String[] solution(String s) {
        // TODO：请实现解法
        return new String[]{};
    }

    public static void main(String[] args) {
        Lcci0807PermutationI solution = new Lcci0807PermutationI();

        // 示例1
        String s1 = "qwe";
        Object result1 = solution.solution(s1);
        Object expected1 = new String[]{"qwe", "qew", "wqe", "weq", "ewq", "eqw"};
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        String s2 = "ab";
        Object result2 = solution.solution(s2);
        Object expected2 = new String[]{"ab", "ba"};
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

    }
}
