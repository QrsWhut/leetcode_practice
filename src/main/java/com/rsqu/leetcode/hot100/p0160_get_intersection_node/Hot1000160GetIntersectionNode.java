package com.rsqu.leetcode.hot100.p0160_get_intersection_node;

import com.rsqu.leetcode.util.ListNode;

public class Hot1000160GetIntersectionNode {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lengthA = getLength(headA);
        int lengthB = getLength(headB);
        ListNode currentA = headA;
        ListNode currentB = headB;

        if (lengthA > lengthB) {
            currentA = moveForward(currentA, lengthA - lengthB);
        } else {
            currentB = moveForward(currentB, lengthB - lengthA);
        }

        while (currentA != null && currentB != null) {
            if (currentA == currentB) {
                return currentA;
            }
            currentA = currentA.next;
            currentB = currentB.next;
        }
        return null;
    }

    private int getLength(ListNode head) {
        int length = 0;
        ListNode current = head;
        while (current != null) {
            length++;
            current = current.next;
        }
        return length;
    }

    private ListNode moveForward(ListNode head, int step) {
        ListNode current = head;
        for (int i = 0; i < step; i++) {
            current = current.next;
        }
        return current;
    }

    public static void main(String[] args) {
        Hot1000160GetIntersectionNode solution = new Hot1000160GetIntersectionNode();
    }
}
