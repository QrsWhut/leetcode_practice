package com.rsqu.leetcode.lcof.面试题67_把字符串转换成整数;

import com.rsqu.leetcode.util.TestUtil;

public class Lcof67 {
    // 题目描述：本目录 README.md。

    public int solution(String str) {
        // TODO：请实现解法
        return 0;
    }

    public static void main(String[] args) {
        Lcof67 solution = new Lcof67();

        // 示例1
        String str1 = "42";
        Object result1 = solution.solution(str1);
        Object expected1 = 42;
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        String str2 = "   -42";
        Object result2 = solution.solution(str2);
        Object expected2 = -42 解释: 第一个非空白字符为 '-', 它是一个负号。 我们尽可能将负号与后面所有连续出现的数字组合起来，最后得到 -42 。;
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

        // 示例3
        String str3 = "4193 with words";
        Object result3 = solution.solution(str3);
        Object expected3 = 4193 解释: 转换截止于数字 '3' ，因为它的下一个字符不为数字。;
        boolean pass3 = TestUtil.isEqual(result3, expected3);
        System.out.println("示例3：" + (pass3 ? "通过" : "失败") + "，输出=" + TestUtil.format(result3) + "，期望=" + TestUtil.format(expected3));

        // 示例4
        String str4 = "words and 987";
        Object result4 = solution.solution(str4);
        // 期望输出可能包含多个结果：0 解释: 第一个非空字符是 'w', 但它不是数字或正、负号。 因此无法执行有效的转换。
        System.out.println("示例4输出：" + TestUtil.format(result4));

        // 示例5
        String str5 = "-91283472332";
        Object result5 = solution.solution(str5);
        Object expected5 = -2147483648 解释: 数字 "-91283472332" 超过 32 位有符号整数范围。 因此返回 INT_MIN (−231) 。;
        boolean pass5 = TestUtil.isEqual(result5, expected5);
        System.out.println("示例5：" + (pass5 ? "通过" : "失败") + "，输出=" + TestUtil.format(result5) + "，期望=" + TestUtil.format(expected5));

    }
}
