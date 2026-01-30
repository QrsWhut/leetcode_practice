package com.rsqu.leetcode.lcof2.剑指_offer_ii_021_删除链表的倒数第_n_个结点;

import com.rsqu.leetcode.util.TestUtil;
import com.rsqu.leetcode.util.ListNode;

public class Lcof2_021 {
    // 题目描述：本目录 README.md。

    public ListNode solution(ListNode head, int n) {
        // TODO：请实现解法
        return null;
    }

    public static void main(String[] args) {
        Lcof2_021 solution = new Lcof2_021();

        // 示例1
        ListNode head1 = ListNode.fromArray(new int[]{1, 2, 3, 4, 5});
        int n1 = 2;
        Object result1 = solution.solution(head1, n1);
        Object expected1 = ListNode.fromArray(new int[]{1, 2, 3, 5});
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        ListNode head2 = ListNode.fromArray(new int[]{1});
        int n2 = 1;
        Object result2 = solution.solution(head2, n2);
        Object expected2 = ListNode.fromArray(new int[]{});
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

        // 示例3
        ListNode head3 = ListNode.fromArray(new int[]{1, 2});
        int n3 = 1;
        Object result3 = solution.solution(head3, n3);
        Object expected3 = ListNode.fromArray(new int[]{1});
        boolean pass3 = TestUtil.isEqual(result3, expected3);
        System.out.println("示例3：" + (pass3 ? "通过" : "失败") + "，输出=" + TestUtil.format(result3) + "，期望=" + TestUtil.format(expected3));

    }
}
