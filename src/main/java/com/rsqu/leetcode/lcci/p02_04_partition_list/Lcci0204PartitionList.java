package com.rsqu.leetcode.lcci.p02_04_partition_list;

import com.rsqu.leetcode.util.TestUtil;
import com.rsqu.leetcode.util.ListNode;

public class Lcci0204PartitionList {
    // 题目描述：本目录 README.md。

    public ListNode solution(ListNode head, int x) {
        // TODO：请实现解法
        return null;
    }

    public static void main(String[] args) {
        Lcci0204PartitionList solution = new Lcci0204PartitionList();

        // 示例1
        ListNode head1 = ListNode.fromArray(new int[]{1, 4, 3, 2, 5, 2});
        int x1 = 3;
        Object result1 = solution.solution(head1, x1);
        Object expected1 = ListNode.fromArray(new int[]{1, 2, 2, 4, 3, 5});
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        ListNode head2 = ListNode.fromArray(new int[]{2, 1});
        int x2 = 2;
        Object result2 = solution.solution(head2, x2);
        Object expected2 = ListNode.fromArray(new int[]{1, 2});
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

    }
}
