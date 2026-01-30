package com.rsqu.leetcode.lcci.p05_02_binary_number_to_string;

import com.rsqu.leetcode.util.TestUtil;

public class Lcci0502BinaryNumbertoString {
    // 题目描述：本目录 README.md。

    public String solution(double num) {
        // TODO：请实现解法
        return null;
    }

    public static void main(String[] args) {
        Lcci0502BinaryNumbertoString solution = new Lcci0502BinaryNumbertoString();

        // 示例1
        double num1 = 0.625;
        Object result1 = solution.solution(num1);
        Object expected1 = "0.101";
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        double num2 = 0.1;
        Object result2 = solution.solution(num2);
        Object expected2 = ""ERROR" 提示:0.1无法被二进制准确表示";
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

    }
}
