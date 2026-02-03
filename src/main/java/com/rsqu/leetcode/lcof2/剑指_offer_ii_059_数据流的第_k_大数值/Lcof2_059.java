package com.rsqu.leetcode.lcof2.剑指_offer_ii_059_数据流的第_k_大数值;

import com.rsqu.leetcode.util.TestUtil;

public class Lcof2_059 {
    // 题目描述：本目录 README.md。

    public int solution(int val) {
        // TODO：请实现解法
        return 0;
    }

    public static void main(String[] args) {
        Lcof2_059 solution = new Lcof2_059();

        // 示例1
        int val1 = 3;
        Object result1 = solution.solution(val1);
        Object expected1 = 4; // 解释: 示例中第一次 add(3) 的返回值为 4
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

    }
}
