package com.rsqu.leetcode.lcof.面试题18_删除链表的节点;

import com.rsqu.leetcode.util.TestUtil;
import com.rsqu.leetcode.util.ListNode;

public class Lcof18 {
    // 题目描述：本目录 README.md。

    public ListNode solution(ListNode head, int val) {
        // TODO：请实现解法
        return null;
    }

    public static void main(String[] args) {
        Lcof18 solution = new Lcof18();

        // 示例1
        ListNode head1 = ListNode.fromArray(new int[]{4, 5, 1, 9});
        int val1 = 5;
        Object result1 = solution.solution(head1, val1);
        Object expected1 = null;
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        ListNode head2 = ListNode.fromArray(new int[]{4, 5, 1, 9});
        int val2 = 1;
        Object result2 = solution.solution(head2, val2);
        Object expected2 = null;
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

    }
}
