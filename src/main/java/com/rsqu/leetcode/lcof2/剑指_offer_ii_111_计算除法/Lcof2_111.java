package com.rsqu.leetcode.lcof2.剑指_offer_ii_111_计算除法;

import java.util.*;

public class Lcof2_111 {
    // 题目描述：本目录 README.md。

    public double[] solution(List<List<String>> equations, double[] values, List<List<String>> queries) {
        // TODO：请实现解法
        return new double[]{};
    }

    public static void main(String[] args) {
        Lcof2_111 solution = new Lcof2_111();

        // 示例1
        List<List<String>> equations = java.util.Arrays.asList(java.util.Arrays.asList("a", "b"), java.util.Arrays.asList("b", "c"));
        double[] values = new double[]{2.0, 3.0};
        List<List<String>> queries = java.util.Arrays.asList(java.util.Arrays.asList("a", "c"), java.util.Arrays.asList("b", "a"), java.util.Arrays.asList("a", "e"), java.util.Arrays.asList("a", "a"), java.util.Arrays.asList("x", "x"));
        Object result1 = solution.solution(equations, values, queries);
        Object expected1 = new double[]{6.00000, 0.50000, -1.00000, 1.00000, -1.00000] 解释: 条件:a / b = 2.0, b / c = 3.0 问题:a / c = ?, b / a = ?, a / e = ?, a / a = ?, x / x = ? 结果:[6.0, 0.5, -1.0, 1.0, -1.0};
        boolean pass1 = isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + format(result1) + "，期望=" + format(expected1));

        // 示例2
        List<List<String>> equations = java.util.Arrays.asList(java.util.Arrays.asList("a", "b"), java.util.Arrays.asList("b", "c"), java.util.Arrays.asList("bc", "cd"));
        double[] values = new double[]{1.5, 2.5, 5.0};
        List<List<String>> queries = java.util.Arrays.asList(java.util.Arrays.asList("a", "c"), java.util.Arrays.asList("c", "b"), java.util.Arrays.asList("bc", "cd"), java.util.Arrays.asList("cd", "bc"));
        Object result2 = solution.solution(equations, values, queries);
        Object expected2 = new double[]{3.75000, 0.40000, 5.00000, 0.20000};
        boolean pass2 = isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + format(result2) + "，期望=" + format(expected2));

        // 示例3
        List<List<String>> equations = java.util.Arrays.asList(java.util.Arrays.asList("a", "b"));
        double[] values = new double[]{0.5};
        List<List<String>> queries = java.util.Arrays.asList(java.util.Arrays.asList("a", "b"), java.util.Arrays.asList("b", "a"), java.util.Arrays.asList("a", "c"), java.util.Arrays.asList("x", "y"));
        Object result3 = solution.solution(equations, values, queries);
        Object expected3 = new double[]{0.50000, 2.00000, -1.00000, -1.00000};
        boolean pass3 = isEqual(result3, expected3);
        System.out.println("示例3：" + (pass3 ? "通过" : "失败") + "，输出=" + format(result3) + "，期望=" + format(expected3));

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
