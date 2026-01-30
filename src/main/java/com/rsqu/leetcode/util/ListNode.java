package com.rsqu.leetcode.util;

/**
 * 单链表节点定义。
 * LeetCode 常用单链表节点。
 */
public class ListNode {
    /**
     * 节点值。
     */
    public int val;

    /**
     * 下一节点引用。
     */
    public ListNode next;

    /**
     * 默认构造函数。
     */
    public ListNode() {
    }

    /**
     * 构造函数。
     *
     * @param val 节点值
     */
    public ListNode(int val) {
        this.val = val;
    }

    /**
     * 构造函数。
     *
     * @param val 节点值
     * @param next 下一节点
     */
    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    /**
     * 由数组构建链表。
     *
     * @param arr 输入数组
     * @return 链表头节点
     */
    public static ListNode fromArray(int[] arr) {
        if (arr == null || arr.length == 0) {
            return null;
        }

        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for (int value : arr) {
            current.next = new ListNode(value);
            current = current.next;
        }
        return dummy.next;
    }

    /**
     * 将链表转换为字符串。
     *
     * @param head 链表头节点
     * @return 链表字符串
     */
    public static String toString(ListNode head) {
        if (head == null) {
            return "null";
        }

        StringBuilder sb = new StringBuilder();
        ListNode current = head;
        while (current != null) {
            sb.append(current.val);
            if (current.next != null) {
                sb.append(" -> " );
            }
            current = current.next;
        }
        return sb.toString();
    }
}
