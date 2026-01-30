package com.rsqu.leetcode.lcci.p01_01_is_unique;

import com.rsqu.leetcode.util.TestUtil;

public class Lcci0101IsUnique {
    // 题目描述：本目录 README.md。

    public boolean solution(String astr) {
        // TODO：请实现解法
        return false;
    }

    public static void main(String[] args) {
        Lcci0101IsUnique solution = new Lcci0101IsUnique();

        // 示例1
        String astr1 = "leetcode";
        Object result1 = solution.solution(astr1);
        Object expected1 = false;
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        String astr2 = "abc";
        Object result2 = solution.solution(astr2);
        Object expected2 = true;
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

    }
}
