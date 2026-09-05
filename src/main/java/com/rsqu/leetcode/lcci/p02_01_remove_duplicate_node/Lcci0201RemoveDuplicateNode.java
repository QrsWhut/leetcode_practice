package com.rsqu.leetcode.lcci.p02_01_remove_duplicate_node;

import com.rsqu.leetcode.util.TestUtil;
import com.rsqu.leetcode.util.ListNode;

import java.util.HashSet;
import java.util.Set;

public class Lcci0201RemoveDuplicateNode {
    // 题目描述：本目录 README.md。

    public ListNode solution(ListNode head) {
        Set<Integer> set = new HashSet<>();
        if (head == null || head.next == null) {
            return head;
        }
        set.add(head.val);
        ListNode cur = head;
        ListNode next = head;
        while (next != null) {
            next = cur.next;
            if (set.contains(next.val)) {
                cur.next = next.next;
                next = next.next;
            } else {
                set.add(next.val);
                cur = next;
                next = next.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        Lcci0201RemoveDuplicateNode solution = new Lcci0201RemoveDuplicateNode();

        // 示例1
        ListNode head1 = ListNode.fromArray(new int[]{1, 2, 3, 3, 2, 1});
        Object result1 = solution.solution(head1);
        Object expected1 = ListNode.fromArray(new int[]{1, 2, 3});
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        ListNode head2 = ListNode.fromArray(new int[]{1, 1, 1, 1, 2});
        Object result2 = solution.solution(head2);
        Object expected2 = ListNode.fromArray(new int[]{1, 2});
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

    }
}
