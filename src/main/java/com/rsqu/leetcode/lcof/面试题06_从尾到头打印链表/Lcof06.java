package com.rsqu.leetcode.lcof.面试题06_从尾到头打印链表;

import com.rsqu.leetcode.util.TestUtil;
import com.rsqu.leetcode.util.ListNode;

public class Lcof06 {
    // 题目描述：本目录 README.md。

    public int[] solution(ListNode head) {
        // TODO：请实现解法
        return new int[]{};
    }

    public static void main(String[] args) {
        Lcof06 solution = new Lcof06();

        // 示例1
        ListNode head1 = ListNode.fromArray(new int[]{1, 3, 2});
        Object result1 = solution.solution(head1);
        Object expected1 = new int[]{2, 3, 1};
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

    }
}
