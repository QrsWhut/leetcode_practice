package com.rsqu.leetcode.lcof.面试题67_把字符串转换成整数;

import java.util.*;

public class Lcof67 {
    // 题目描述：本目录 README.md。

    public int solution(String str) {
        // TODO：请实现解法
        return 0;
    }

    public static void main(String[] args) {
        Lcof67 solution = new Lcof67();

        // 示例1
        String str = "42";
        Object result1 = solution.solution(str);
        Object expected1 = 42;
        boolean pass1 = isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + format(result1) + "，期望=" + format(expected1));

        // 示例2
        String str = "   -42";
        Object result2 = solution.solution(str);
        Object expected2 = -42 解释: 第一个非空白字符为 '-', 它是一个负号。 我们尽可能将负号与后面所有连续出现的数字组合起来，最后得到 -42 。;
        boolean pass2 = isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + format(result2) + "，期望=" + format(expected2));

        // 示例3
        String str = "4193 with words";
        Object result3 = solution.solution(str);
        Object expected3 = 4193 解释: 转换截止于数字 '3' ，因为它的下一个字符不为数字。;
        boolean pass3 = isEqual(result3, expected3);
        System.out.println("示例3：" + (pass3 ? "通过" : "失败") + "，输出=" + format(result3) + "，期望=" + format(expected3));

        // 示例4
        String str = "words and 987";
        Object result4 = solution.solution(str);
        // 期望输出可能包含多个结果：0 解释: 第一个非空字符是 'w', 但它不是数字或正、负号。 因此无法执行有效的转换。
        System.out.println("示例4输出：" + format(result4));

        // 示例5
        String str = "-91283472332";
        Object result5 = solution.solution(str);
        Object expected5 = -2147483648 解释: 数字 "-91283472332" 超过 32 位有符号整数范围。 因此返回 INT_MIN (−231) 。;
        boolean pass5 = isEqual(result5, expected5);
        System.out.println("示例5：" + (pass5 ? "通过" : "失败") + "，输出=" + format(result5) + "，期望=" + format(expected5));

    }

    private static boolean isEqual(Object actual, Object expected) {
        if (actual == null || expected == null) {
            return actual == expected;
        }
        if (actual instanceof Double && expected instanceof Double) {
            return Math.abs((Double) actual - (Double) expected) < 1e-6;
        }
        if (actual instanceof Float && expected instanceof Float) {
            return Math.abs((Float) actual - (Float) expected) < 1e-6f;
        }
        if (actual.getClass().isArray() && expected.getClass().isArray()) {
            if (actual instanceof int[] && expected instanceof int[]) {
                return Arrays.equals((int[]) actual, (int[]) expected);
            }
            if (actual instanceof long[] && expected instanceof long[]) {
                return Arrays.equals((long[]) actual, (long[]) expected);
            }
            if (actual instanceof short[] && expected instanceof short[]) {
                return Arrays.equals((short[]) actual, (short[]) expected);
            }
            if (actual instanceof byte[] && expected instanceof byte[]) {
                return Arrays.equals((byte[]) actual, (byte[]) expected);
            }
            if (actual instanceof char[] && expected instanceof char[]) {
                return Arrays.equals((char[]) actual, (char[]) expected);
            }
            if (actual instanceof boolean[] && expected instanceof boolean[]) {
                return Arrays.equals((boolean[]) actual, (boolean[]) expected);
            }
            if (actual instanceof float[] && expected instanceof float[]) {
                return Arrays.equals((float[]) actual, (float[]) expected);
            }
            if (actual instanceof double[] && expected instanceof double[]) {
                return Arrays.equals((double[]) actual, (double[]) expected);
            }
            return Arrays.deepEquals((Object[]) actual, (Object[]) expected);
        }
        return Objects.equals(actual, expected);
    }

    private static String format(Object value) {
        if (value == null) {
            return "null";
        }
        if (value.getClass().isArray()) {
            if (value instanceof int[]) {
                return Arrays.toString((int[]) value);
            }
            if (value instanceof long[]) {
                return Arrays.toString((long[]) value);
            }
            if (value instanceof short[]) {
                return Arrays.toString((short[]) value);
            }
            if (value instanceof byte[]) {
                return Arrays.toString((byte[]) value);
            }
            if (value instanceof char[]) {
                return Arrays.toString((char[]) value);
            }
            if (value instanceof boolean[]) {
                return Arrays.toString((boolean[]) value);
            }
            if (value instanceof float[]) {
                return Arrays.toString((float[]) value);
            }
            if (value instanceof double[]) {
                return Arrays.toString((double[]) value);
            }
            return Arrays.deepToString((Object[]) value);
        }
        return String.valueOf(value);
    }
}
