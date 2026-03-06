package com.rsqu.leetcode.lcci.p02_05_sum_lists;

import com.rsqu.leetcode.util.TestUtil;
import com.rsqu.leetcode.util.ListNode;

public class Lcci0205SumLists {
    // 题目描述：本目录 README.md。

    public ListNode solution(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(0);
        ListNode one = l1;
        ListNode two = l2;
        ListNode cur = res;
        int flag = 0;
        while (one != null && two != null) {
            int first = one.val;
            int second = two.val;
            int sum = first + second + flag;
            if(sum >= 10) {
                flag = 1;
            } else {
                flag = 0;
            }
            one = one.next;
            two = two.next;
            cur.next = new ListNode(sum%10);
            cur = cur.next;
        }
        if (one == null && two != null) {
            if (flag == 1) {
                cur.next = new ListNode(1);
            }
        }
        while (one != null) {
            cur.next = new ListNode(one.val + flag);
            cur = cur.next;
            flag = 0;
            one = one.next;
        }
        while (two != null) {
            cur.next = new ListNode(two.val + flag);
            cur = cur.next;
            flag = 0;
            two = two.next;
        }

        return res.next;
    }

    public static void main(String[] args) {
        Lcci0205SumLists solution = new Lcci0205SumLists();

        // 示例1
        ListNode l11 = ListNode.fromArray(new int[]{7, 1, 6});
        ListNode l21 = ListNode.fromArray(new int[]{5, 9, 2});
        Object result1 = solution.solution(l11, l21);
        Object expected1 = ListNode.fromArray(new int[]{2, 1, 9});
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

    }
}
