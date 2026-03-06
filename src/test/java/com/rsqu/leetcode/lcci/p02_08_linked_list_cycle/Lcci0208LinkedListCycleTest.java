package com.rsqu.leetcode.lcci.p02_08_linked_list_cycle;

import com.rsqu.leetcode.util.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * {@link Lcci0208LinkedListCycle} 的回归测试。
 */
public class Lcci0208LinkedListCycleTest {
    /**
     * 当环入口为头节点时，应返回头节点本身。
     */
    @Test
    public void shouldReturnHeadWhenCycleStartsAtHead() {
        Lcci0208LinkedListCycle solution = new Lcci0208LinkedListCycle();
        ListNode head = new ListNode(1);
        ListNode second = new ListNode(2);
        head.next = second;
        second.next = head;

        ListNode result = solution.solution(head);

        Assertions.assertSame(head, result);
    }
}
