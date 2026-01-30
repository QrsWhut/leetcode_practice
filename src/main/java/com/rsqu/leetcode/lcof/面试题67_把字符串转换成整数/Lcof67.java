package com.rsqu.leetcode.lcof.面试题67_把字符串转换成整数;

public class Lcof67 {
    // Problem statement: README.md in this folder.

    public int solution(int[] nums) {
        // TODO: implement
        return 0;
    }

    public static void main(String[] args) {
        Lcof67 solution = new Lcof67();

        // Example 1:
        // Input: "42"
        // Output: 42
        // Example 2:
        // Input: "   -42"
        // Output: -42 解释: 第一个非空白字符为 '-', 它是一个负号。 我们尽可能将负号与后面所有连续出现的数字组合起来，最后得到 -42 。
        // Example 3:
        // Input: "4193 with words"
        // Output: 4193 解释: 转换截止于数字 '3' ，因为它的下一个字符不为数字。
        // Example 4:
        // Input: "words and 987"
        // Output: 0 解释: 第一个非空字符是 'w', 但它不是数字或正、负号。 因此无法执行有效的转换。
        // Example 5:
        // Input: "-91283472332"
        // Output: -2147483648 解释: 数字 "-91283472332" 超过 32 位有符号整数范围。 因此返回 INT_MIN (−231) 。

        // TODO: replace with the correct input/output types.
        // int[] input = {1, 2, 3};
        // System.out.println(solution.solution(input));
    }
}
