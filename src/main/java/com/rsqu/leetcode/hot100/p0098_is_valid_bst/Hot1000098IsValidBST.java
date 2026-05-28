package com.rsqu.leetcode.hot100.p0098_is_valid_bst;

import com.rsqu.leetcode.util.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Hot1000098IsValidBST {

    private Boolean isValid = true;

    public boolean isValidBST(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        trace(root,res);
        return isValid;
    }

    private void trace(TreeNode root, List<Integer> res) {
        if (root == null || !isValid) {
            return ;
        }
        trace(root.left,res);
        if (res.size() > 0 && res.get(res.size() - 1) >= root.val) {
            isValid = false;
            return ;
        }
        res.add(root.val);
        trace(root.right,res);

    }

    public static void main(String[] args) {
        Hot1000098IsValidBST solution = new Hot1000098IsValidBST();
    }
}