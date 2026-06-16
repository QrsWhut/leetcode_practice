package com.rsqu.leetcode.hot100.p0141_has_cycle;

import com.rsqu.leetcode.util.ListNode;

public class Hot1000141HasCycle {

    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Hot1000141HasCycle solution = new Hot1000141HasCycle();
    }
}