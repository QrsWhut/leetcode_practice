package com.rsqu.leetcode.lcof2.剑指_offer_ii_023_两个链表的第一个重合节点;

import com.rsqu.leetcode.util.TestUtil;
import com.rsqu.leetcode.util.ListNode;

public class Lcof2_023 {
    // 题目描述：本目录 README.md。

    public ListNode solution(ListNode headA, ListNode headB) {
        // TODO：请实现解法
        return null;
    }

    public static void main(String[] args) {
        Lcof2_023 solution = new Lcof2_023();

        // 示例1
        ListNode headA1 = null;
        ListNode headB1 = null;
        Object result1 = solution.solution(headA1, headB1);
        Object expected1 = null;
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        ListNode headA2 = null;
        ListNode headB2 = null;
        Object result2 = solution.solution(headA2, headB2);
        Object expected2 = null;
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

        // 示例3
        ListNode headA3 = null;
        ListNode headB3 = null;
        Object result3 = solution.solution(headA3, headB3);
        Object expected3 = null;
        boolean pass3 = TestUtil.isEqual(result3, expected3);
        System.out.println("示例3：" + (pass3 ? "通过" : "失败") + "，输出=" + TestUtil.format(result3) + "，期望=" + TestUtil.format(expected3));

    }
}
