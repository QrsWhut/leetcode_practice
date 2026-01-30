package com.rsqu.leetcode.lcof2.剑指_offer_ii_078_合并排序链表;

import com.rsqu.leetcode.util.TestUtil;
import com.rsqu.leetcode.util.ListNode;

public class Lcof2_078 {
    // 题目描述：本目录 README.md。

    public ListNode solution(ListNode[] lists) {
        // TODO：请实现解法
        return null;
    }

    public static void main(String[] args) {
        Lcof2_078 solution = new Lcof2_078();

        // 示例1
        ListNode[] lists1 = new ListNode[]{{1, 4, 5}, {1, 3, 4}, {2, 6}};
        Object result1 = solution.solution(lists1);
        Object expected1 = null;
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        ListNode[] lists2 = new ListNode[]{};
        Object result2 = solution.solution(lists2);
        Object expected2 = ListNode.fromArray(new int[]{});
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

        // 示例3
        ListNode[] lists3 = new ListNode[]{{}};
        Object result3 = solution.solution(lists3);
        Object expected3 = ListNode.fromArray(new int[]{});
        boolean pass3 = TestUtil.isEqual(result3, expected3);
        System.out.println("示例3：" + (pass3 ? "通过" : "失败") + "，输出=" + TestUtil.format(result3) + "，期望=" + TestUtil.format(expected3));

    }
}
