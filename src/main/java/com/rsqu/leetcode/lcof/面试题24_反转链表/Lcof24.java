package com.rsqu.leetcode.lcof.面试题24_反转链表;

import com.rsqu.leetcode.util.TestUtil;
import com.rsqu.leetcode.util.ListNode;

public class Lcof24 {
    // 题目描述：本目录 README.md。

    public ListNode solution(ListNode head) {
        // TODO：请实现解法
        return null;
    }

    public static void main(String[] args) {
        Lcof24 solution = new Lcof24();

        // 示例1
        ListNode head1 = null;
        Object result1 = solution.solution(head1);
        Object expected1 = null;
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

    }
}
