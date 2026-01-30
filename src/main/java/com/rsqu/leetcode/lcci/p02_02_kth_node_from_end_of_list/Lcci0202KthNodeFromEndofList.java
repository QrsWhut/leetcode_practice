package com.rsqu.leetcode.lcci.p02_02_kth_node_from_end_of_list;

import com.rsqu.leetcode.util.TestUtil;
import com.rsqu.leetcode.util.ListNode;

public class Lcci0202KthNodeFromEndofList {
    // 题目描述：本目录 README.md。

    public int solution(ListNode head, int k) {
        // TODO：请实现解法
        return 0;
    }

    public static void main(String[] args) {
        Lcci0202KthNodeFromEndofList solution = new Lcci0202KthNodeFromEndofList();

        // 示例1
        // TODO：为 head1 设置输入
        // TODO：为 k1 设置输入
        Object result1 = solution.solution(head1, k1);
        Object expected1 = 4;
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

    }
}
