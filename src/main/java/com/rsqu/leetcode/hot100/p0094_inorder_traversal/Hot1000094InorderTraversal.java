package com.rsqu.leetcode.hot100.p0094_inorder_traversal;

import com.rsqu.leetcode.util.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Hot1000094InorderTraversal {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        trace(res,root);
        return res;
    }

    private void trace(List<Integer> res,TreeNode root) {
        if (root == null) {
            return;
        }
        trace(res,root.left);
        res.add(root.val);
        trace(res,root.right);
    }

    public static void main(String[] args) {
        Hot1000094InorderTraversal solution = new Hot1000094InorderTraversal();
    }
}