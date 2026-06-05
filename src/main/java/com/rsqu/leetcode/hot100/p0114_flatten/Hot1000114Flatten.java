package com.rsqu.leetcode.hot100.p0114_flatten;

import com.rsqu.leetcode.util.TreeNode;

/**
 * 114. 二叉树展开为链表。
 */
public class Hot1000114Flatten {

    /**
     * 按前序遍历顺序原地展开二叉树。
     *
     * @param root 二叉树根节点
     */
    public void flatten(TreeNode root) {
        TreeNode current = root;
        while (current != null) {
            if (current.left != null) {
                TreeNode predecessor = current.left;
                while (predecessor.right != null) {
                    predecessor = predecessor.right;
                }
                predecessor.right = current.right;
                current.right = current.left;
                current.left = null;
            }
            current = current.right;
        }
    }

}
