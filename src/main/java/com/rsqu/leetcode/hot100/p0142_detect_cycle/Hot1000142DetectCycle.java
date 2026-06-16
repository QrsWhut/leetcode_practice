package com.rsqu.leetcode.hot100.p0142_detect_cycle;

import com.rsqu.leetcode.util.ListNode;

public class Hot1000142DetectCycle {

    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                fast = head;
                while (fast != slow) {
                    fast = fast.next;
                    slow = slow.next;
                }
                return fast;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Hot1000142DetectCycle solution = new Hot1000142DetectCycle();
    }
}