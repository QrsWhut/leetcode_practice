package com.rsqu.leetcode.lcci.p02_07_intersection_of_two_linked_lists;

import com.rsqu.leetcode.util.TestUtil;
import com.rsqu.leetcode.util.ListNode;

public class Lcci0207IntersectionofTwoLinkedLists {
    // 题目描述：本目录 README.md。

    public ListNode solution(ListNode headA, ListNode headB) {
        // TODO：请实现解法
        return null;
    }

    public static void main(String[] args) {
        Lcci0207IntersectionofTwoLinkedLists solution = new Lcci0207IntersectionofTwoLinkedLists();

        // 示例1
        // TODO：为 headA1 设置输入
        // TODO：为 headB1 设置输入
        Object result1 = solution.solution(headA1, headB1);
        Object expected1 = null;
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        // TODO：为 headA2 设置输入
        // TODO：为 headB2 设置输入
        Object result2 = solution.solution(headA2, headB2);
        Object expected2 = null;
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

        // 示例3
        // TODO：为 headA3 设置输入
        // TODO：为 headB3 设置输入
        Object result3 = solution.solution(headA3, headB3);
        Object expected3 = null;
        boolean pass3 = TestUtil.isEqual(result3, expected3);
        System.out.println("示例3：" + (pass3 ? "通过" : "失败") + "，输出=" + TestUtil.format(result3) + "，期望=" + TestUtil.format(expected3));

    }
}
