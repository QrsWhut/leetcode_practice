package com.rsqu.leetcode.lcof2.剑指_offer_ii_027_回文链表;

import com.rsqu.leetcode.util.TestUtil;
import com.rsqu.leetcode.util.ListNode;

public class Lcof2_027 {
    // 题目描述：本目录 README.md。

    public boolean solution(ListNode head) {
        // TODO：请实现解法
        return false;
    }

    public static void main(String[] args) {
        Lcof2_027 solution = new Lcof2_027();

        // 示例1
        ListNode head1 = ListNode.fromArray(new int[]{1, 2, 3, 3, 2, 1});
        Object result1 = solution.solution(head1);
        Object expected1 = true;
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        ListNode head2 = ListNode.fromArray(new int[]{1, 2});
        Object result2 = solution.solution(head2);
        Object expected2 = fasle;
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

    }
}
