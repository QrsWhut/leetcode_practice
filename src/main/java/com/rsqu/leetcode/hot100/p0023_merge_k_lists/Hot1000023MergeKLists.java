package com.rsqu.leetcode.hot100.p0023_merge_k_lists;

import com.rsqu.leetcode.util.ListNode;

import java.util.PriorityQueue;

public class Hot1000023MergeKLists {

    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> queue = new PriorityQueue<>((node1, node2) -> node1.val - node2.val);
        for (ListNode node : lists){
            while (node!=null) {
                queue.add(node);
                node = node.next;
            }
        }
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;
        while (!queue.isEmpty()) {
            current.next = queue.poll();
            current = current.next;
        }
        current.next = null;
        return dummy.next;
    }

    public static void main(String[] args) {
        Hot1000023MergeKLists solution = new Hot1000023MergeKLists();
    }
}