package com.rsqu.leetcode.lcof.面试题58_i_翻转单词顺序;

import com.rsqu.leetcode.util.TestUtil;

public class Lcof58I {
    // 题目描述：本目录 README.md。

    public String solution(String s) {
        // TODO：请实现解法
        return null;
    }

    public static void main(String[] args) {
        Lcof58I solution = new Lcof58I();

        // 示例1
        String s1 = "the sky is blue";
        Object result1 = solution.solution(s1);
        Object expected1 = "blue is sky the";
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        String s2 = "  hello world!  ";
        Object result2 = solution.solution(s2);
        // 期望输出可能包含多个结果："world! hello" 解释: 输入字符串可以在前面或者后面包含多余的空格，但是反转后的字符不能包括。
        System.out.println("示例2输出：" + TestUtil.format(result2));

        // 示例3
        String s3 = "a good   example";
        Object result3 = solution.solution(s3);
        Object expected3 = "example good a"; // 解释: 如果两个单词间有多余的空格，将反转后单词间的空格减少到只含一个。"
        boolean pass3 = TestUtil.isEqual(result3, expected3);
        System.out.println("示例3：" + (pass3 ? "通过" : "失败") + "，输出=" + TestUtil.format(result3) + "，期望=" + TestUtil.format(expected3));

    }
}
