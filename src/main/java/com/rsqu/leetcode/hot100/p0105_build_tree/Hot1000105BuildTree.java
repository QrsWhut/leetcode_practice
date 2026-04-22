package com.rsqu.leetcode.hot100.p0105_build_tree;

import com.rsqu.leetcode.util.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class Hot1000105BuildTree {

    private final Map<Integer, Integer> inorderIndexMap = new HashMap<>();

    /**
     * 根据前序遍历和中序遍历构造二叉树。
     *
     * @param preorder 前序遍历结果
     * @param inorder 中序遍历结果
     * @return 二叉树根节点
     */
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        inorderIndexMap.clear();
        for (int i = 0; i < inorder.length; i++) {
            inorderIndexMap.put(inorder[i], i);
        }
        return dfs(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
    }

    /**
     * 递归构造当前区间对应的二叉树。
     *
     * @param preorder 前序遍历结果
     * @param preStart 当前子树前序起点
     * @param preEnd 当前子树前序终点
     * @param inorder 中序遍历结果
     * @param inStart 当前子树中序起点
     * @param inEnd 当前子树中序终点
     * @return 当前子树根节点
     */
    private TreeNode dfs(int[] preorder, int preStart, int preEnd, int[] inorder, int inStart, int inEnd) {
        if (preStart > preEnd || inStart > inEnd) {
            return null;
        }

        int rootValue = preorder[preStart];
        TreeNode root = new TreeNode(rootValue);
        int inorderRootIndex = inorderIndexMap.get(rootValue);
        int leftTreeSize = inorderRootIndex - inStart;

        root.left = dfs(
                preorder,
                preStart + 1,
                preStart + leftTreeSize,
                inorder,
                inStart,
                inorderRootIndex - 1
        );
        root.right = dfs(
                preorder,
                preStart + leftTreeSize + 1,
                preEnd,
                inorder,
                inorderRootIndex + 1,
                inEnd
        );
        return root;
    }

    public static void main(String[] args) {
        Hot1000105BuildTree solution = new Hot1000105BuildTree();
    }
}
