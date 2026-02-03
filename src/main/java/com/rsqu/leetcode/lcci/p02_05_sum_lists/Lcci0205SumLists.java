package com.rsqu.leetcode.lcci.p02_05_sum_lists;

import com.rsqu.leetcode.util.TestUtil;
import com.rsqu.leetcode.util.ListNode;

public class Lcci0205SumLists {
    // 题目描述：本目录 README.md。

    public ListNode solution(ListNode l1, ListNode l2) {
        // TODO：请实现解法
        return null;
    }

    public static void main(String[] args) {
        Lcci0205SumLists solution = new Lcci0205SumLists();

        // 示例1
        ListNode l11 = null;
        ListNode l21 = null;
        Object result1 = solution.solution(l11, l21);
        Object expected1 = null;
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        ListNode l12 = null;
        ListNode l22 = null;
        Object result2 = solution.solution(l12, l22);
        Object expected2 = null;
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

    }
}
