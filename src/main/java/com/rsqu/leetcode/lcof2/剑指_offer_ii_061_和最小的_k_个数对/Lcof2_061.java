package com.rsqu.leetcode.lcof2.剑指_offer_ii_061_和最小的_k_个数对;

import java.util.*;

public class Lcof2_061 {
    // 题目描述：本目录 README.md。

    public List<List<Integer>> solution(int[] nums1, int[] nums2, int k) {
        // TODO：请实现解法
        return null;
    }

    public static void main(String[] args) {
        Lcof2_061 solution = new Lcof2_061();

        // 示例1
        int[] nums1 = new int[]{1, 7, 11};
        int[] nums2 = new int[]{2, 4, 6};
        int k = 3;
        Object result1 = solution.solution(nums1, nums2, k);
        // // TODO：请补充期望输出：[1,2],[1,4],[1,6] 解释: 返回序列中的前 3 对数: [1,2],[1,4],[1,6],[7,2],[7,4],[11,2],[7,6],[11,4],[11,6]
        System.out.println("示例1输出：" + format(result1));

        // 示例2
        int[] nums1 = new int[]{1, 1, 2};
        int[] nums2 = new int[]{1, 2, 3};
        int k = 2;
        Object result2 = solution.solution(nums1, nums2, k);
        // // TODO：请补充期望输出：[1,1],[1,1] 解释: 返回序列中的前 2 对数: [1,1],[1,1],[1,2],[2,1],[1,2],[2,2],[1,3],[1,3],[2,3]
        System.out.println("示例2输出：" + format(result2));

        // 示例3
        int[] nums1 = new int[]{1, 2};
        int[] nums2 = new int[]{3};
        int k = 3;
        Object result3 = solution.solution(nums1, nums2, k);
        // // TODO：请补充期望输出：[1,3],[2,3] 解释: 也可能序列中所有的数对都被返回:[1,3],[2,3]
        System.out.println("示例3输出：" + format(result3));

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
