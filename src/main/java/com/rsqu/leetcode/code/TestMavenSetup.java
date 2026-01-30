package com.rsqu.leetcode.code;

import com.rsqu.leetcode.util.ListNode;
import com.rsqu.leetcode.util.TreeNode;

/**
 * Maven 项目验证测试
 * 
 * @author rsqu
 * @since 2026-01-27
 */
public class TestMavenSetup {
    
    public static void main(String[] args) {
        System.out.println("=== Maven 项目验证测试 ===\n");
        
        // 测试 ListNode
        testListNode();
        
        // 测试 TreeNode
        testTreeNode();
        
        System.out.println("\n=== Maven 项目配置成功！ ===");
    }
    
    /**
     * 测试 ListNode 功能
     */
    private static void testListNode() {
        System.out.println("【测试 ListNode】");
        
        // 从数组创建链表
        int[] arr = {1, 2, 3, 4, 5};
        ListNode head = ListNode.fromArray(arr);
        System.out.println("创建链表: " + ListNode.toString(head));
        
        System.out.println();
    }
    
    /**
     * 测试 TreeNode 功能
     */
    private static void testTreeNode() {
        System.out.println("【测试 TreeNode】");
        
        // 从数组创建二叉树
        Integer[] arr = {1, 2, 3, null, 4, 5, 6};
        TreeNode root = TreeNode.fromArray(arr);
        System.out.println("创建二叉树: " + TreeNode.toString(root));
        
        System.out.println();
    }
}
