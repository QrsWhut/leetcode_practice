package com.rsqu.leetcode.lcci.p02_06_palindrome_linked_list;

import com.rsqu.leetcode.util.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * {@link Lcci0206PalindromeLinkedList} 的回归测试。
 */
public class Lcci0206PalindromeLinkedListTest {
    /**
     * README 示例 1：1 -> 2 不是回文链表。
     */
    @Test
    public void shouldReturnFalseWhenListIsNotPalindrome() {
        Lcci0206PalindromeLinkedList solution = new Lcci0206PalindromeLinkedList();

        boolean result = solution.solution(ListNode.fromArray(new int[]{1, 2}));

        Assertions.assertFalse(result);
    }

    /**
     * README 示例 2：1 -> 2 -> 2 -> 1 是回文链表。
     */
    @Test
    public void shouldReturnTrueWhenListIsEvenPalindrome() {
        Lcci0206PalindromeLinkedList solution = new Lcci0206PalindromeLinkedList();

        boolean result = solution.solution(ListNode.fromArray(new int[]{1, 2, 2, 1}));

        Assertions.assertTrue(result);
    }
}
