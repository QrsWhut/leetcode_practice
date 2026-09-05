package com.rsqu.leetcode.hot100.p0025_reverse_k_group;

import com.rsqu.leetcode.util.ListNode;

public class Hot1000025ReverseKGroup {

    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode first = new ListNode(-1);
        first.next = head;
        if (k == 1) {
            return head;
        }
        ListNode preNode = first;
        while (preNode.next != null) {
            ListNode curNode = preNode;
            for (int i = 0; i < k && curNode != null; i++) {
                curNode = curNode.next;
            }
            if (curNode == null) {
                break;
            }
            ListNode groupTail = preNode.next;
            ListNode nextGroupHead = curNode.next;
            reverse(preNode, nextGroupHead);
            preNode = groupTail;
        }
        return first.next;
    }

    private void reverse(ListNode preNode, ListNode lastNode) {
        ListNode p = preNode.next;
        ListNode pre = lastNode;
        while (p != lastNode) {
            ListNode q = p.next;
            p.next = pre;
            pre = p;
            p = q;
        }
        preNode.next = pre;
    }

    public static void main(String[] args) {
        Hot1000025ReverseKGroup solution = new Hot1000025ReverseKGroup();
    }
}
