package com.rsqu.leetcode.lcof2.剑指_offer_ii_018_有效的回文;

import com.rsqu.leetcode.util.TestUtil;

public class Lcof2_018 {
    // 题目描述：本目录 README.md。

    public boolean solution(String s) {
        // TODO：请实现解法
        return false;
    }

    public static void main(String[] args) {
        Lcof2_018 solution = new Lcof2_018();

        // 示例1
        String s1 = "A man, a plan, a canal: Panama";
        Object result1 = solution.solution(s1);
        Object expected1 = true 解释:"amanaplanacanalpanama" 是回文串;
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        String s2 = "race a car";
        Object result2 = solution.solution(s2);
        Object expected2 = false 解释:"raceacar" 不是回文串;
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

    }
}
