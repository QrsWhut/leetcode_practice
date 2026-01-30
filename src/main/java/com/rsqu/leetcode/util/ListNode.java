package com.rsqu.leetcode.util;

/**
 * 链表节点类
 * LeetCode 常用的单链表节点定义
 * 
 * @author rsqu
 * @since 2026-01-27
 */
public class ListNode {
    /**
     * 节点值
     */
    public int val;
    
    /**
     * 下一个节点的引用
     */
    public ListNode next;
    
    /**
     * 默认构造函数
     */
    public ListNode() {
    }
    
    /**
     * 构造函数
     * 
     * @param val 节点值
     */
    public ListNode(int val) {
        this.val = val;
    }
    
    /**
     * 构造函数
     * 
     * @param val 节点值
     * @param next 下一个节点的引用
     */
    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
    
    /**
     * 从数组创建链表
     * 
     * @param arr 数组
     * @return 链表头节点
     */
    public static ListNode fromArray(int[] arr) {
        if (arr == null || arr.length == 0) {
            return null;
        }
        
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;
        
        for (int val : arr) {
            current.next = new ListNode(val);
            current = current.next;
        }
        
        return dummyHead.next;
    }
    
    /**
     * 打印链表
     * 
     * @param head 链表头节点
     * @return 链表的字符串表示
     */
    public static String toString(ListNode head) {
        if (head == null) {
            return "null";
        }
        
        StringBuilder sb = new StringBuilder();
        ListNode current = head;
        
        while (current != null) {
            sb.append(current.val);
            if (current.next != null) {
                sb.append(" -> ");
            }
            current = current.next;
        }
        
        return sb.toString();
    }
}
