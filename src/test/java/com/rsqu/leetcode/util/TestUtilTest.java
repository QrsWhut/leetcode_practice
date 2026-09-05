package com.rsqu.leetcode.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * TestUtil 的回归测试。
 */
public class TestUtilTest {
    /**
     * 相同链表内容的链表数组应判定为相等。
     */
    @Test
    public void shouldCompareListNodeArrayByNodeValues() {
        ListNode[] actual = new ListNode[]{
                ListNode.fromArray(new int[]{1}),
                ListNode.fromArray(new int[]{2, 3})
        };
        ListNode[] expected = new ListNode[]{
                ListNode.fromArray(new int[]{1}),
                ListNode.fromArray(new int[]{2, 3})
        };

        boolean result = TestUtil.isEqual(actual, expected);

        Assertions.assertTrue(result);
    }

    /**
     * 链表数组应格式化为 LeetCode 风格的二维数组字符串。
     */
    @Test
    public void shouldFormatListNodeArrayAsLeetCodeStyleString() {
        ListNode[] value = new ListNode[]{
                ListNode.fromArray(new int[]{1}),
                ListNode.fromArray(new int[]{2, 3}),
                null
        };

        String result = TestUtil.format(value);

        Assertions.assertEquals("[[1],[2,3],[]]", result);
    }
}
