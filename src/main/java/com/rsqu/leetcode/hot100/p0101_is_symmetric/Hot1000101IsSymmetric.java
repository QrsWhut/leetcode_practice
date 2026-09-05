package com.rsqu.leetcode.hot100.p0101_is_symmetric;

import com.rsqu.leetcode.util.TreeNode;

public class Hot1000101IsSymmetric {

    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isMirror(root.left, root.right);
    }

    private boolean isMirror(TreeNode leftNode, TreeNode rightNode) {
        if (leftNode == null && rightNode == null) {
            return true;
        }
        if (leftNode == null || rightNode == null) {
            return false;
        }
        if (leftNode.val != rightNode.val) {
            return false;
        }
        return isMirror(leftNode.left, rightNode.right) && isMirror(leftNode.right, rightNode.left);
    }

    public static void main(String[] args) {
        Hot1000101IsSymmetric solution = new Hot1000101IsSymmetric();
    }
}
