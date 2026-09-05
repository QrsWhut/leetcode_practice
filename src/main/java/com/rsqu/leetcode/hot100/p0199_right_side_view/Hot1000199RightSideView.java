package com.rsqu.leetcode.hot100.p0199_right_side_view;

import com.rsqu.leetcode.util.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Hot1000199RightSideView {

    public List<Integer> rightSideView(TreeNode root) {
        Deque<TreeNode> deque = new ArrayDeque<>();
        deque.addLast(root);
        List<Integer> res = new ArrayList<>();
        while (!deque.isEmpty()) {
            int size =  deque.size();
            for (int i = 0; i < size; i++) {
                TreeNode treeNode = deque.pollFirst();
                if (i == size - 1) {
                    res.add(treeNode.val);
                }
                if (treeNode.left != null) {
                    deque.addLast(treeNode.left);
                }
                if (treeNode.right != null) {
                    deque.addLast(treeNode.right);
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Hot1000199RightSideView solution = new Hot1000199RightSideView();
    }
}