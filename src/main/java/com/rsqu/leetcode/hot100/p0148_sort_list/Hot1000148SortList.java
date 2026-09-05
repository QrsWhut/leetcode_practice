package com.rsqu.leetcode.hot100.p0148_sort_list;

import com.rsqu.leetcode.util.ListNode;

public class Hot1000148SortList {

    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode middle = getMiddle(head);
        ListNode rightHead = middle.next;
        middle.next = null;

        ListNode left = sortList(head);
        ListNode right = sortList(rightHead);
        return merge(left, right);
    }

    private ListNode getMiddle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private ListNode merge(ListNode left, ListNode right) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        while (left != null && right != null) {
            if (left.val <= right.val) {
                current.next = left;
                left = left.next;
            } else {
                current.next = right;
                right = right.next;
            }
            current = current.next;
        }
        if (left != null) {
            current.next = left;
        } else {
            current.next = right;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        Hot1000148SortList solution = new Hot1000148SortList();
    }
}
