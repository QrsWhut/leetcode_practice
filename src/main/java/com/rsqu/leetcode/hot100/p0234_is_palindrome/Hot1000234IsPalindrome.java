package com.rsqu.leetcode.hot100.p0234_is_palindrome;

import com.rsqu.leetcode.util.ListNode;

public class Hot1000234IsPalindrome {

    public boolean isPalindrome(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast!=null && fast.next!=null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        if (fast!=null) {
            slow = slow.next;
        }
        fast = reverse(slow);
        slow = head;
        while (fast!=null) {
            if (fast.val != slow.val) {
                return false;
            }
            fast = fast.next;
            slow = slow.next;
        }
        return true;
    }

    private ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        while (current!=null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    public static void main(String[] args) {
        Hot1000234IsPalindrome solution = new Hot1000234IsPalindrome();
    }
}