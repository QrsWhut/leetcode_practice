package com.rsqu.leetcode.lcci.p02_03_delete_middle_node;

import com.rsqu.leetcode.util.TestUtil;
import com.rsqu.leetcode.util.ListNode;

import java.util.List;

public class Lcci0203DeleteMiddleNode {
    // 题目描述：本目录 README.md。
    static ListNode head1 = ListNode.fromArray(new int[]{1, 2, 3, 4, 5});
    public void solution(ListNode node) {
        ListNode slow = head1;
        ListNode fast = head1;
        while (fast != null && fast.next != null) {
            fast = fast.next;
            if (fast.next == null) {
                return;
            }
            if (fast.val == node.val) {
                slow.next = fast.next;
                fast = fast.next;
            }
            slow = slow.next;
        }
    }

    public static void main(String[] args) {
        Lcci0203DeleteMiddleNode solution = new Lcci0203DeleteMiddleNode();

        // 示例1
        ListNode node1 = new ListNode(3);
        solution.solution(node1);
        System.out.println(TestUtil.format(head1));
    }
}
