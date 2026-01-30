package com.rsqu.leetcode.lcof2.剑指_offer_ii_077_链表排序;

import com.rsqu.leetcode.util.TestUtil;
import com.rsqu.leetcode.util.ListNode;

public class Lcof2_077 {
    // 题目描述：本目录 README.md。

    public ListNode solution(ListNode head) {
        // TODO：请实现解法
        return null;
    }

    public static void main(String[] args) {
        Lcof2_077 solution = new Lcof2_077();

        // 示例1
        ListNode head1 = ListNode.fromArray(new int[]{4, 2, 1, 3});
        Object result1 = solution.solution(head1);
        Object expected1 = ListNode.fromArray(new int[]{1, 2, 3, 4});
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        ListNode head2 = ListNode.fromArray(new int[]{-1, 5, 3, 4, 0});
        Object result2 = solution.solution(head2);
        Object expected2 = ListNode.fromArray(new int[]{-1, 0, 3, 4, 5});
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

        // 示例3
        ListNode head3 = ListNode.fromArray(new int[]{});
        Object result3 = solution.solution(head3);
        Object expected3 = ListNode.fromArray(new int[]{});
        boolean pass3 = TestUtil.isEqual(result3, expected3);
        System.out.println("示例3：" + (pass3 ? "通过" : "失败") + "，输出=" + TestUtil.format(result3) + "，期望=" + TestUtil.format(expected3));

    }
}
