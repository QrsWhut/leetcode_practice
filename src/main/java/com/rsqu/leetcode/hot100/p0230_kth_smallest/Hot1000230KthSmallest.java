package com.rsqu.leetcode.hot100.p0230_kth_smallest;

import com.rsqu.leetcode.util.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;

public class Hot1000230KthSmallest {

    public int kthSmallest(TreeNode root, int k) {
        Deque<TreeNode> stack = new ArrayDeque<>();
        TreeNode current = root;

        while (current != null || stack.isEmpty() == false) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }

            current = stack.pop();
            k--;
            if (k == 0) {
                return current.val;
            }

            current = current.right;
        }

        return 0;
    }

    public static void main(String[] args) {
        Hot1000230KthSmallest solution = new Hot1000230KthSmallest();
    }
}