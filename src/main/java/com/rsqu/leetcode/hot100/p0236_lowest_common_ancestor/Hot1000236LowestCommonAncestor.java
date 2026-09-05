package com.rsqu.leetcode.hot100.p0236_lowest_common_ancestor;

import com.rsqu.leetcode.util.TreeNode;

public class Hot1000236LowestCommonAncestor {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q)
            return root;
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if (left != null && right != null)
            return root;
        if (left != null)
            return left;
        if (right != null)
            return right;
        return null;
    }

    public static void main(String[] args) {
        Hot1000236LowestCommonAncestor solution = new Hot1000236LowestCommonAncestor();
    }
}