package com.rsqu.leetcode.lcof2.剑指_offer_ii_022_链表中环的入口节点;

import com.rsqu.leetcode.util.TestUtil;
import com.rsqu.leetcode.util.ListNode;

public class Lcof2_022 {
    // 题目描述：本目录 README.md。

    public ListNode solution(ListNode head) {
        // TODO：请实现解法
        return null;
    }

    public static void main(String[] args) {
        Lcof2_022 solution = new Lcof2_022();

        // 示例1
        ListNode head1 = ListNode.fromArray(new int[]{3, 2, 0, -4});
        Object result1 = solution.solution(head1);
        Object expected1 = null;
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        ListNode head2 = ListNode.fromArray(new int[]{1, 2});
        Object result2 = solution.solution(head2);
        Object expected2 = null;
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

        // 示例3
        ListNode head3 = ListNode.fromArray(new int[]{1});
        Object result3 = solution.solution(head3);
        Object expected3 = null;
        boolean pass3 = TestUtil.isEqual(result3, expected3);
        System.out.println("示例3：" + (pass3 ? "通过" : "失败") + "，输出=" + TestUtil.format(result3) + "，期望=" + TestUtil.format(expected3));

    }
}
