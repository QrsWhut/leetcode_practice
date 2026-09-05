package com.rsqu.leetcode.hot100.p0019_remove_nth_from_end;

import com.rsqu.leetcode.util.ListNode;

public class Hot1000019RemoveNthFromEnd {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null)
            return null;
        ListNode preHead = new ListNode(-1);
        preHead.next = head;
        int count = n;
        ListNode fast = preHead;
        while (count>0 && fast.next != null){
            fast = fast.next;
            count--;
        }
        ListNode slow = preHead;
        while (fast.next!=null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return preHead.next;
    }

    public static void main(String[] args) {
        Hot1000019RemoveNthFromEnd solution = new Hot1000019RemoveNthFromEnd();
    }
}