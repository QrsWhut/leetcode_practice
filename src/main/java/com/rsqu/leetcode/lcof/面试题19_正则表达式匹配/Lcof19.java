package com.rsqu.leetcode.lcof.面试题19_正则表达式匹配;

import java.util.*;

public class Lcof19 {
    // 题目描述：本目录 README.md。

    public boolean solution(String s, String p) {
        // TODO：请实现解法
        return false;
    }

    public static void main(String[] args) {
        Lcof19 solution = new Lcof19();

        // 示例1
        String s = "aa" p = "a";
        // TODO：为 p 设置输入
        Object result1 = solution.solution(s, p);
        Object expected1 = false 解释: "a" 无法匹配 "aa" 整个字符串。;
        boolean pass1 = isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + format(result1) + "，期望=" + format(expected1));

        // 示例2
        String s = "aa" p = "a*";
        // TODO：为 p 设置输入
        Object result2 = solution.solution(s, p);
        // 期望输出可能包含多个结果：true 解释: 因为 '*' 代表可以匹配零个或多个前面的那一个元素, 在这里前面的元素就是 'a'。因此，字符串 "aa" 可被视为 'a' 重复了一次。
        System.out.println("示例2输出：" + format(result2));

        // 示例3
        String s = "ab" p = ".*";
        // TODO：为 p 设置输入
        Object result3 = solution.solution(s, p);
        // 期望输出可能包含多个结果：true 解释: ".*" 表示可匹配零个或多个（'*'）任意字符（'.'）。
        System.out.println("示例3输出：" + format(result3));

        // 示例4
        String s = "aab" p = "c*a*b";
        // TODO：为 p 设置输入
        Object result4 = solution.solution(s, p);
        // 期望输出可能包含多个结果：true 解释: 因为 '*' 表示零个或多个，这里 'c' 为 0 个, 'a' 被重复一次。因此可以匹配字符串 "aab"。
        System.out.println("示例4输出：" + format(result4));

        // 示例5
        String s = "mississippi" p = "mis*is*p*.";
        // TODO：为 p 设置输入
        Object result5 = solution.solution(s, p);
        Object expected5 = false;
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
