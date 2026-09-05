package com.rsqu.leetcode.hot100.p0021_merge_two_lists;

import com.rsqu.leetcode.util.ListNode;

public class Hot1000021MergeTwoLists {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode res = new ListNode(-1);
        ListNode left = list1;
        ListNode right = list2;
        ListNode cur = res;
        while (left != null && right != null) {
            if (left.val <= right.val) {
                cur.next = left;
                left = left.next;
            } else {
                cur.next = right;
                right = right.next;
            }
            cur = cur.next;
        }
        cur.next = left != null ? left : right;
        return res.next;
    }

    public static void main(String[] args) {
        Hot1000021MergeTwoLists solution = new Hot1000021MergeTwoLists();
    }
}
