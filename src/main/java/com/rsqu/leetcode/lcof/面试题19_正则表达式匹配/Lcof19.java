package com.rsqu.leetcode.lcof.面试题19_正则表达式匹配;

public class Lcof19 {
    // Problem statement: README.md in this folder.

    public int solution(int[] nums) {
        // TODO: implement
        return 0;
    }

    public static void main(String[] args) {
        Lcof19 solution = new Lcof19();

        // Example 1:
        // Input: s = "aa" p = "a"
        // Output: false 解释: "a" 无法匹配 "aa" 整个字符串。
        // Example 2:
        // Input: s = "aa" p = "a*"
        // Output: true 解释: 因为 '*' 代表可以匹配零个或多个前面的那一个元素, 在这里前面的元素就是 'a'。因此，字符串 "aa" 可被视为 'a' 重复了一次。
        // Example 3:
        // Input: s = "ab" p = ".*"
        // Output: true 解释: ".*" 表示可匹配零个或多个（'*'）任意字符（'.'）。
        // Example 4:
        // Input: s = "aab" p = "c*a*b"
        // Output: true 解释: 因为 '*' 表示零个或多个，这里 'c' 为 0 个, 'a' 被重复一次。因此可以匹配字符串 "aab"。
        // Example 5:
        // Input: s = "mississippi" p = "mis*is*p*."
        // Output: false

        // TODO: replace with the correct input/output types.
        // int[] input = {1, 2, 3};
        // System.out.println(solution.solution(input));
    }
}
