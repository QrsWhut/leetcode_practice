package com.rsqu.leetcode.lcof.面试题19_正则表达式匹配;

import com.rsqu.leetcode.util.TestUtil;

public class Lcof19 {
    // 题目描述：本目录 README.md。

    public boolean solution(String s, String p) {
        // TODO：请实现解法
        return false;
    }

    public static void main(String[] args) {
        Lcof19 solution = new Lcof19();

        // 示例1
        String s1 = "aa" p = "a";
        // TODO：为 p1 设置输入
        Object result1 = solution.solution(s1, p1);
        Object expected1 = false 解释: "a" 无法匹配 "aa" 整个字符串。;
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        String s2 = "aa" p = "a*";
        // TODO：为 p2 设置输入
        Object result2 = solution.solution(s2, p2);
        // 期望输出可能包含多个结果：true 解释: 因为 '*' 代表可以匹配零个或多个前面的那一个元素, 在这里前面的元素就是 'a'。因此，字符串 "aa" 可被视为 'a' 重复了一次。
        System.out.println("示例2输出：" + TestUtil.format(result2));

        // 示例3
        String s3 = "ab" p = ".*";
        // TODO：为 p3 设置输入
        Object result3 = solution.solution(s3, p3);
        // 期望输出可能包含多个结果：true 解释: ".*" 表示可匹配零个或多个（'*'）任意字符（'.'）。
        System.out.println("示例3输出：" + TestUtil.format(result3));

        // 示例4
        String s4 = "aab" p = "c*a*b";
        // TODO：为 p4 设置输入
        Object result4 = solution.solution(s4, p4);
        // 期望输出可能包含多个结果：true 解释: 因为 '*' 表示零个或多个，这里 'c' 为 0 个, 'a' 被重复一次。因此可以匹配字符串 "aab"。
        System.out.println("示例4输出：" + TestUtil.format(result4));

        // 示例5
        String s5 = "mississippi" p = "mis*is*p*.";
        // TODO：为 p5 设置输入
        Object result5 = solution.solution(s5, p5);
        Object expected5 = false;
        boolean pass5 = TestUtil.isEqual(result5, expected5);
        System.out.println("示例5：" + (pass5 ? "通过" : "失败") + "，输出=" + TestUtil.format(result5) + "，期望=" + TestUtil.format(expected5));

    }
}
