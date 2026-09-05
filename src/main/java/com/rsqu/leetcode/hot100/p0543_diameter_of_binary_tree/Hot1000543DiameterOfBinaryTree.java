package com.rsqu.leetcode.hot100.p0543_diameter_of_binary_tree;

import com.rsqu.leetcode.util.TreeNode;

public class Hot1000543DiameterOfBinaryTree {

    private int max = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        depth(root);
        return max;
    }

    // 返回以 node 为根的树的高度（节点数），同时更新全局最大直径（边数）
    private int depth(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int left = depth(node.left);
        int right = depth(node.right);
        // 经过当前节点的路径边数 = left + right（左右各给一条边）
        max = Math.max(max, left + right);
        // 树高 = 最深子树高度 + 当前节点
        return Math.max(left, right) + 1;
    }

    public static void main(String[] args) {
        Hot1000543DiameterOfBinaryTree solution = new Hot1000543DiameterOfBinaryTree();
    }
}