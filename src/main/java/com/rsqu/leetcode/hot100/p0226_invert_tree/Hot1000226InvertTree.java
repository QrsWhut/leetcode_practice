package com.rsqu.leetcode.hot100.p0226_invert_tree;

import com.rsqu.leetcode.util.TreeNode;

public class Hot1000226InvertTree {

    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;
        if (root.left != null) {
            invertTree(root.left);
        }
        if (root.right != null) {
            invertTree(root.right);
        }
        return root;
    }

    public static void main(String[] args) {
        Hot1000226InvertTree solution = new Hot1000226InvertTree();
    }
}