package com.rsqu.leetcode.lcof2.剑指_offer_ii_025_链表中的两数相加;

import com.rsqu.leetcode.util.TestUtil;
import com.rsqu.leetcode.util.ListNode;

public class Lcof2_025 {
    // 题目描述：本目录 README.md。

    public ListNode solution(ListNode l1, ListNode l2) {
        // TODO：请实现解法
        return null;
    }

    public static void main(String[] args) {
        Lcof2_025 solution = new Lcof2_025();

        // 示例1
        ListNode l11 = ListNode.fromArray(new int[]{7, 2, 4, 3});
        ListNode l21 = ListNode.fromArray(new int[]{5, 6, 4});
        Object result1 = solution.solution(l11, l21);
        Object expected1 = ListNode.fromArray(new int[]{7, 8, 0, 7});
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        ListNode l12 = ListNode.fromArray(new int[]{2, 4, 3});
        ListNode l22 = ListNode.fromArray(new int[]{5, 6, 4});
        Object result2 = solution.solution(l12, l22);
        Object expected2 = ListNode.fromArray(new int[]{8, 0, 7});
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

        // 示例3
        ListNode l13 = ListNode.fromArray(new int[]{0});
        ListNode l23 = ListNode.fromArray(new int[]{0});
        Object result3 = solution.solution(l13, l23);
        Object expected3 = ListNode.fromArray(new int[]{0});
        boolean pass3 = TestUtil.isEqual(result3, expected3);
        System.out.println("示例3：" + (pass3 ? "通过" : "失败") + "，输出=" + TestUtil.format(result3) + "，期望=" + TestUtil.format(expected3));

    }
}
