package com.rsqu.leetcode.lcof2.剑指_offer_ii_036_后缀表达式;

import com.rsqu.leetcode.util.TestUtil;

public class Lcof2_036 {
    // 题目描述：本目录 README.md。

    public int solution(String[] tokens) {
        // TODO：请实现解法
        return 0;
    }

    public static void main(String[] args) {
        Lcof2_036 solution = new Lcof2_036();

        // 示例1
        String[] tokens1 = new String[]{"2", "1", "+", "3", "*"};
        Object result1 = solution.solution(tokens1);
        Object expected1 = 9; // 解释:该算式转化为常见的中缀算术表达式为:((2 + 1) * 3) = 9
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        String[] tokens2 = new String[]{"4", "13", "5", "/", "+"};
        Object result2 = solution.solution(tokens2);
        Object expected2 = 6; // 解释:该算式转化为常见的中缀算术表达式为:(4 + (13 / 5)) = 6
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

        // 示例3
        String[] tokens3 = new String[]{"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};
        Object result3 = solution.solution(tokens3);
        Object expected3 = 22; // 解释: 该算式转化为常见的中缀算术表达式为: ((10 * (6 / ((9 + 3) * -11))) + 17) + 5 = ((10 * (6 / (12 * -11))) + 17) + 5 = ((10 * (6 / -132)) + 17) + 5 = ((10 * 0) + 17) + 5 = (0 + 17) + 5 = 17 + 5 = 22
        boolean pass3 = TestUtil.isEqual(result3, expected3);
        System.out.println("示例3：" + (pass3 ? "通过" : "失败") + "，输出=" + TestUtil.format(result3) + "，期望=" + TestUtil.format(expected3));

    }
}
