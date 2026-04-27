package com.rsqu.leetcode.hot100.p0024_swap_pairs;

import com.rsqu.leetcode.util.ListNode;

public class Hot1000024SwapPairs {

    public ListNode swapPairs(ListNode head) {
        if (head == null)
            return null;
        ListNode first = new ListNode(-1);
        ListNode pre = first;
        first.next = head;
        while (pre.next != null && pre.next.next != null) {
            ListNode p = pre.next;
            ListNode q = p.next;

            p.next = q.next;
            q.next = p;
            pre.next = q;

            pre = p;
        }

        return first.next;
    }

    public static void main(String[] args) {
        Hot1000024SwapPairs solution = new Hot1000024SwapPairs();
    }
}