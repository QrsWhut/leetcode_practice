package com.rsqu.leetcode.lcof2.剑指_offer_ii_058_日程表;

import com.rsqu.leetcode.util.TestUtil;

public class Lcof2_058 {
    // 题目描述：本目录 README.md。

    public boolean solution(int start, int end) {
        // TODO：请实现解法
        return false;
    }

    public static void main(String[] args) {
        Lcof2_058 solution = new Lcof2_058();

        // 示例1
        int start1 = 10;
        int end1 = 20;
        Object result1 = solution.solution(start1, end1);
        Object expected1 = true; // 解释: 示例中第一次预定区间 [10,20] 返回 true
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

    }
}
