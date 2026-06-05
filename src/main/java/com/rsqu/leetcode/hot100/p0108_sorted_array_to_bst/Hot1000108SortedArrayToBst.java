package com.rsqu.leetcode.hot100.p0108_sorted_array_to_bst;

import com.rsqu.leetcode.util.TreeNode;

public class Hot1000108SortedArrayToBst {

    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) {
            return null;
        }
        return sortedArrayToBST(nums, 0, nums.length - 1);
    }

    private TreeNode sortedArrayToBST(int[] nums, int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = (start + end) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = sortedArrayToBST(nums, start, mid - 1);
        root.right = sortedArrayToBST(nums, mid + 1, end);
        return root;
    }

    public static void main(String[] args) {
        Hot1000108SortedArrayToBst solution = new Hot1000108SortedArrayToBst();
    }
}