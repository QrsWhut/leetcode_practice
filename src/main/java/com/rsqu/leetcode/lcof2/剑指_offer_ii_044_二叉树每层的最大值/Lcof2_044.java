package com.rsqu.leetcode.lcof2.剑指_offer_ii_044_二叉树每层的最大值;

import java.util.*;
import com.rsqu.leetcode.util.TreeNode;

public class Lcof2_044 {
    // 题目描述：本目录 README.md。

    public List<Integer> solution(TreeNode root) {
        // TODO：请实现解法
        return null;
    }

    public static void main(String[] args) {
        Lcof2_044 solution = new Lcof2_044();

        // 示例1
        TreeNode root = TreeNode.fromArray(new Integer[]{1, 3, 2, 5, 3, null, 9});
        Object result1 = solution.solution(root);
        Object expected1 = [1,3,9] 解释: 1 / \ 3   2 / \   \ 5   3   9;
        boolean pass1 = isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + format(result1) + "，期望=" + format(expected1));

        // 示例2
        TreeNode root = TreeNode.fromArray(new Integer[]{1, 2, 3});
        Object result2 = solution.solution(root);
        Object expected2 = [1,3] 解释: 1 / \ 2   3;
        boolean pass2 = isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + format(result2) + "，期望=" + format(expected2));

        // 示例3
        TreeNode root = TreeNode.fromArray(new Integer[]{1});
        Object result3 = solution.solution(root);
        Object expected3 = java.util.Arrays.asList(1);
        boolean pass3 = isEqual(result3, expected3);
        System.out.println("示例3：" + (pass3 ? "通过" : "失败") + "，输出=" + format(result3) + "，期望=" + format(expected3));

        // 示例4
        TreeNode root = TreeNode.fromArray(new Integer[]{1, null, 2});
        Object result4 = solution.solution(root);
        Object expected4 = [1,2] 解释: 1 \ 2;
        boolean pass4 = isEqual(result4, expected4);
        System.out.println("示例4：" + (pass4 ? "通过" : "失败") + "，输出=" + format(result4) + "，期望=" + format(expected4));

        // 示例5
        TreeNode root = TreeNode.fromArray(new Integer[]{});
        Object result5 = solution.solution(root);
        Object expected5 = java.util.Arrays.asList();
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
        if (actual instanceof TreeNode && expected instanceof TreeNode) {
            return TreeNode.toString((TreeNode) actual).equals(TreeNode.toString((TreeNode) expected));
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
        if (value instanceof TreeNode) {
            return TreeNode.toString((TreeNode) value);
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
