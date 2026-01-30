package com.rsqu.leetcode.lcof2.剑指_offer_ii_034_外星语言是否排序;

import java.util.*;

public class Lcof2_034 {
    // 题目描述：本目录 README.md。

    public boolean solution(String[] words, String order) {
        // TODO：请实现解法
        return false;
    }

    public static void main(String[] args) {
        Lcof2_034 solution = new Lcof2_034();

        // 示例1
        String[] words = new String[]{"hello", "leetcode"};
        String order = "hlabcdefgijkmnopqrstuvwxyz";
        Object result1 = solution.solution(words, order);
        Object expected1 = true 解释:在该语言的字母表中，'h' 位于 'l' 之前，所以单词序列是按字典序排列的。;
        boolean pass1 = isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + format(result1) + "，期望=" + format(expected1));

        // 示例2
        String[] words = new String[]{"word", "world", "row"};
        String order = "worldabcefghijkmnpqstuvxyz";
        Object result2 = solution.solution(words, order);
        Object expected2 = false 解释:在该语言的字母表中，'d' 位于 'l' 之后，那么 words[0] > words[1]，因此单词序列不是按字典序排列的。;
        boolean pass2 = isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + format(result2) + "，期望=" + format(expected2));

        // 示例3
        String[] words = new String[]{"apple", "app"};
        String order = "abcdefghijklmnopqrstuvwxyz";
        Object result3 = solution.solution(words, order);
        Object expected3 = false 解释:当前三个字符 "app" 匹配时，第二个字符串相对短一些，然后根据词典编纂规则 "apple" > "app"，因为 'l' > '∅'，其中 '∅' 是空白字符，定义为比任何其他字符都小（更多信息）。;
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
