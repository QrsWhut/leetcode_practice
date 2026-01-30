package com.rsqu.leetcode.util;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 二叉树节点类
 * LeetCode 常用的二叉树节点定义
 * 
 * @author rsqu
 * @since 2026-01-27
 */
public class TreeNode {
    /**
     * 节点值
     */
    public int val;
    
    /**
     * 左子节点
     */
    public TreeNode left;
    
    /**
     * 右子节点
     */
    public TreeNode right;
    
    /**
     * 默认构造函数
     */
    public TreeNode() {
    }
    
    /**
     * 构造函数
     * 
     * @param val 节点值
     */
    public TreeNode(int val) {
        this.val = val;
    }
    
    /**
     * 构造函数
     * 
     * @param val 节点值
     * @param left 左子节点
     * @param right 右子节点
     */
    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
    
    /**
     * 从层序遍历数组创建二叉树
     * 数组中使用 null 表示空节点
     * 
     * @param arr 层序遍历数组
     * @return 二叉树根节点
     */
    public static TreeNode fromArray(Integer[] arr) {
        if (arr == null || arr.length == 0 || arr[0] == null) {
            return null;
        }
        
        TreeNode root = new TreeNode(arr[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        
        int i = 1;
        while (!queue.isEmpty() && i < arr.length) {
            TreeNode current = queue.poll();
            
            // 处理左子节点
            if (i < arr.length && arr[i] != null) {
                current.left = new TreeNode(arr[i]);
                queue.offer(current.left);
            }
            i++;
            
            // 处理右子节点
            if (i < arr.length && arr[i] != null) {
                current.right = new TreeNode(arr[i]);
                queue.offer(current.right);
            }
            i++;
        }
        
        return root;
    }
    
    /**
     * 层序遍历打印二叉树
     * 
     * @param root 二叉树根节点
     * @return 二叉树的字符串表示
     */
    public static String toString(TreeNode root) {
        if (root == null) {
            return "[]";
        }
        
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            
            if (node == null) {
                sb.append("null, ");
            } else {
                sb.append(node.val).append(", ");
                queue.offer(node.left);
                queue.offer(node.right);
            }
        }
        
        // 移除末尾的 null 和逗号
        String result = sb.toString();
        result = result.replaceAll("(, null)+, $", "");
        result = result.replaceAll(", $", "");
        
        return result + "]";
    }
}
