package com.rsqu.leetcode.hot100.p0206_reverse_list;

import com.rsqu.leetcode.util.ListNode;

public class Hot1000206ReverseList {

    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }


    public static void main(String[] args) {
        Hot1000206ReverseList solution = new Hot1000206ReverseList();
    }
}