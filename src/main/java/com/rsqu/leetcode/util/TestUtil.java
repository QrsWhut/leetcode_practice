package com.rsqu.leetcode.util;

import java.util.Arrays;
import java.util.Objects;

/**
 * 测试工具类，用于比较结果并格式化输出。
 */
public final class TestUtil {
    private static final char ARRAY_LEFT_BRACKET = '[';
    private static final char ARRAY_RIGHT_BRACKET = ']';
    private static final char ARRAY_SEPARATOR = ',';

    private TestUtil() {
    }

    /**
     * 判断两个结果是否相等（支持数组、链表与二叉树）。
     *
     * @param actual 实际结果
     * @param expected 期望结果
     * @return 是否相等
     */
    public static boolean isEqual(Object actual, Object expected) {
        if (actual == null || expected == null) {
            return actual == expected;
        }
        if (actual instanceof Double && expected instanceof Double) {
            return Math.abs((Double) actual - (Double) expected) < 1e-6;
        }
        if (actual instanceof Float && expected instanceof Float) {
            return Math.abs((Float) actual - (Float) expected) < 1e-6f;
        }
        if (actual instanceof ListNode && expected instanceof ListNode) {
            return ListNode.toString((ListNode) actual).equals(ListNode.toString((ListNode) expected));
        }
        if (actual instanceof TreeNode && expected instanceof TreeNode) {
            return TreeNode.toString((TreeNode) actual).equals(TreeNode.toString((TreeNode) expected));
        }
        if (actual instanceof ListNode[] && expected instanceof ListNode[]) {
            return isListNodeArrayEqual((ListNode[]) actual, (ListNode[]) expected);
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

    /**
     * 将结果转换为字符串输出（支持数组、链表与二叉树）。
     *
     * @param value 结果值
     * @return 字符串
     */
    public static String format(Object value) {
        if (value == null) {
            return "null";
        }
        if (value instanceof ListNode) {
            return ListNode.toString((ListNode) value);
        }
        if (value instanceof TreeNode) {
            return TreeNode.toString((TreeNode) value);
        }
        if (value instanceof ListNode[]) {
            return formatListNodeArray((ListNode[]) value);
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

    /**
     * 比较链表数组中的每一条链表是否按节点值相等。
     *
     * @param actual 实际链表数组
     * @param expected 期望链表数组
     * @return 是否相等
     */
    private static boolean isListNodeArrayEqual(ListNode[] actual, ListNode[] expected) {
        if (actual.length != expected.length) {
            return false;
        }
        for (int i = 0; i < actual.length; i++) {
            if (isEqual(actual[i], expected[i]) == false) {
                return false;
            }
        }
        return true;
    }

    /**
     * 将链表数组格式化为 LeetCode 风格的二维数组字符串。
     *
     * @param value 链表数组
     * @return 格式化结果
     */
    private static String formatListNodeArray(ListNode[] value) {
        StringBuilder sb = new StringBuilder();
        sb.append(ARRAY_LEFT_BRACKET);
        for (int i = 0; i < value.length; i++) {
            if (i > 0) {
                sb.append(ARRAY_SEPARATOR);
            }
            sb.append(formatListNode(value[i]));
        }
        sb.append(ARRAY_RIGHT_BRACKET);
        return sb.toString();
    }

    /**
     * 将单条链表格式化为数组风格字符串。
     *
     * @param head 链表头节点
     * @return 数组风格字符串
     */
    private static String formatListNode(ListNode head) {
        StringBuilder sb = new StringBuilder();
        sb.append(ARRAY_LEFT_BRACKET);
        ListNode current = head;
        while (current != null) {
            sb.append(current.val);
            current = current.next;
            if (current != null) {
                sb.append(ARRAY_SEPARATOR);
            }
        }
        sb.append(ARRAY_RIGHT_BRACKET);
        return sb.toString();
    }
}
