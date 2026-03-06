package com.rsqu.leetcode.lcci.p02_06_palindrome_linked_list;

import com.rsqu.leetcode.util.ListNode;
import com.rsqu.leetcode.util.TestUtil;

/**
 * 面试题 02.06. 回文链表。
 * 题目描述见当前目录 README.md。
 */
public class Lcci0206PalindromeLinkedList {
    /**
     * 反转链表时使用的哑节点默认值。
     */
    private static final int DUMMY_NODE_VALUE = -1;

    /**
     * 判断链表是否为回文链表。
     *
     * @param head 链表头节点
     * @return 是否为回文链表
     */
    public boolean solution(ListNode head) {
        if (head == null) {
            return true;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode reversedHead = reversal(slow.next);
        slow.next = null;
        ListNode left = head;
        ListNode right = reversedHead;
        while (right != null) {
            if (left.val != right.val) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    /**
     * 反转链表并返回新的头节点。
     *
     * @param head 原链表头节点
     * @return 反转后的头节点
     */
    public ListNode reversal(ListNode head) {
        ListNode newHead = new ListNode(DUMMY_NODE_VALUE);
        ListNode prev = head;
        while (prev != null) {
            ListNode next = prev.next;
            prev.next = newHead.next;
            newHead.next = prev;
            prev = next;
        }
        return newHead.next;
    }

    /**
     * 运行 README 中的示例。
     *
     * @param args 启动参数
     */
    public static void main(String[] args) {
        Lcci0206PalindromeLinkedList solution = new Lcci0206PalindromeLinkedList();

        // 示例 1：1 -> 2
        int[] nums1 = {1, 2};
        String input1 = ListNode.toString(ListNode.fromArray(nums1));
        boolean result1 = solution.solution(ListNode.fromArray(nums1));
        boolean expected1 = false;
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例 1：" + (pass1 ? "通过" : "失败") + "，输入=" + input1
                + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例 2：1 -> 2 -> 2 -> 1
        int[] nums2 = {1, 2, 2, 1};
        String input2 = ListNode.toString(ListNode.fromArray(nums2));
        boolean result2 = solution.solution(ListNode.fromArray(nums2));
        boolean expected2 = true;
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例 2：" + (pass2 ? "通过" : "失败") + "，输入=" + input2
                + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));
    }
}
