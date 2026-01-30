package com.rsqu.leetcode.lcci.p02_06_palindrome_linked_list;

import com.rsqu.leetcode.util.TestUtil;
import com.rsqu.leetcode.util.ListNode;

public class Lcci0206PalindromeLinkedList {
    // 题目描述：本目录 README.md。

    public boolean solution(ListNode head) {
        // TODO：请实现解法
        return false;
    }

    public static void main(String[] args) {
        Lcci0206PalindromeLinkedList solution = new Lcci0206PalindromeLinkedList();

        // 示例1
        ListNode head1 = null;
        Object result1 = solution.solution(head1);
        Object expected1 = false;
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        ListNode head2 = null;
        Object result2 = solution.solution(head2);
        Object expected2 = true;
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

    }
}
