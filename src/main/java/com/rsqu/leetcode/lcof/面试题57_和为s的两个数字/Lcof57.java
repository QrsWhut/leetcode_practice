package com.rsqu.leetcode.lcof.面试题57_和为s的两个数字;

import java.util.*;

public class Lcof57 {
    // 题目描述：本目录 README.md。

    public int[] solution(int[] nums, int target) {
        // TODO：请实现解法
        return new int[]{};
    }

    public static void main(String[] args) {
        Lcof57 solution = new Lcof57();

        // 示例1
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        Object result1 = solution.solution(nums, target);
        // 期望输出可能包含多个结果：[2,7] 或者 [7,2]
        System.out.println("示例1输出：" + format(result1));

        // 示例2
        int[] nums = new int[]{10, 26, 30, 31, 47, 60};
        int target = 40;
        Object result2 = solution.solution(nums, target);
        // 期望输出可能包含多个结果：[10,30] 或者 [30,10]
        System.out.println("示例2输出：" + format(result2));

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
