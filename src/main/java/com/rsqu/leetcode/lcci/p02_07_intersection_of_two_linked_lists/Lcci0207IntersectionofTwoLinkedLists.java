package com.rsqu.leetcode.lcci.p02_07_intersection_of_two_linked_lists;

import com.rsqu.leetcode.util.TestUtil;
import com.rsqu.leetcode.util.ListNode;

public class Lcci0207IntersectionofTwoLinkedLists {
    // 题目描述：本目录 README.md。

    public ListNode solution(ListNode headA, ListNode headB) {
        ListNode pA = headA;
        ListNode pB = headB;
        Boolean flagA = false;
        Boolean flagB = false;
        while (pA != pB && (pA != null && pB != null)) {
            pA = pA.next;
            pB = pB.next;
            if (pA == null && !flagA){
                pA = headB;
                flagA = true;
            }
            if (pB == null && !flagB){
                pB = headA;
                flagB = true;
            }
        }
        if (pA == null || pB == null)
            return null;
        return pA;
    }

    public static void main(String[] args) {
        Lcci0207IntersectionofTwoLinkedLists solution = new Lcci0207IntersectionofTwoLinkedLists();

        // 示例 1：intersectVal = 8, listA = [4,1,8,4,5], listB = [5,0,1,8,4,5]
        ListNode common1 = new ListNode(8, new ListNode(4, new ListNode(5)));
        ListNode headA1 = new ListNode(4, new ListNode(1, common1));
        ListNode headB1 = new ListNode(5, new ListNode(0, new ListNode(1, common1)));
        ListNode result1 = solution.solution(headA1, headB1);
        ListNode expected1 = common1;
        boolean pass1 = result1 == expected1;
        String actualText1 = result1 == null ? "null"
                : "Reference of the node with value = " + result1.val;
        String expectedText1 = "Reference of the node with value = 8";
        System.out.println("示例 1：" + (pass1 ? "通过" : "失败")
                + "，输入=intersectVal = 8, listA = [4,1,8,4,5], listB = [5,0,1,8,4,5], skipA = 2, skipB = 3"
                + "，输出=" + actualText1 + "，期望=" + expectedText1);

        // 示例 2：intersectVal = 2, listA = [0,9,1,2,4], listB = [3,2,4]
        ListNode common2 = new ListNode(2, new ListNode(4));
        ListNode headA2 = new ListNode(0, new ListNode(9, new ListNode(1, common2)));
        ListNode headB2 = new ListNode(3, common2);
        ListNode result2 = solution.solution(headA2, headB2);
        ListNode expected2 = common2;
        boolean pass2 = result2 == expected2;
        String actualText2 = result2 == null ? "null"
                : "Reference of the node with value = " + result2.val;
        String expectedText2 = "Reference of the node with value = 2";
        System.out.println("示例 2：" + (pass2 ? "通过" : "失败")
                + "，输入=intersectVal = 2, listA = [0,9,1,2,4], listB = [3,2,4], skipA = 3, skipB = 1"
                + "，输出=" + actualText2 + "，期望=" + expectedText2);

        // 示例 3：intersectVal = 0, listA = [2,6,4], listB = [1,5]
        ListNode headA3 = ListNode.fromArray(new int[]{2, 6, 4});
        ListNode headB3 = ListNode.fromArray(new int[]{1, 5});
        ListNode result3 = solution.solution(headA3, headB3);
        ListNode expected3 = null;
        boolean pass3 = result3 == expected3;
        String actualText3 = result3 == null ? "null"
                : "Reference of the node with value = " + result3.val;
        String expectedText3 = "null";
        System.out.println("示例 3：" + (pass3 ? "通过" : "失败")
                + "，输入=intersectVal = 0, listA = [2,6,4], listB = [1,5], skipA = 3, skipB = 2"
                + "，输出=" + actualText3 + "，期望=" + expectedText3);

    }
}