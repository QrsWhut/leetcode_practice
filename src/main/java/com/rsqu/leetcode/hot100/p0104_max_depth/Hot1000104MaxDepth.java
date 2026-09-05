package com.rsqu.leetcode.hot100.p0104_max_depth;

import com.rsqu.leetcode.util.TreeNode;

public class Hot1000104MaxDepth {

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return maxDepth(root, 1);
    }

    private int maxDepth(TreeNode root, int depth) {
        if (root == null) {
            return depth - 1;
        }
        return Math.max(maxDepth(root.left, depth + 1), maxDepth(root.right, depth + 1));
    }

    public static void main(String[] args) {
        Hot1000104MaxDepth solution = new Hot1000104MaxDepth();
    }
}