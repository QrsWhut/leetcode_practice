package com.rsqu.leetcode.hot100.p0124_max_path_sum;

import com.rsqu.leetcode.util.TreeNode;

/**
 * 二叉树中的最大路径和。
 */
public class Hot1000124MaxPathSum {

    private int maxSum = Integer.MIN_VALUE;

    /**
     * 计算二叉树中的最大路径和。
     *
     * @param root 二叉树根节点
     * @return 最大路径和
     */
    public int maxPathSum(TreeNode root) {
        maxSum = Integer.MIN_VALUE;
        dfs(root);
        return maxSum;
    }

    /**
     * 返回当前节点能向父节点提供的最大单边路径贡献。
     *
     * @param root 当前节点
     * @return 最大单边路径贡献
     */
    private int dfs(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = Math.max(dfs(root.left), 0);
        int right = Math.max(dfs(root.right), 0);
        int sum = left + right + root.val;
        maxSum = Math.max(maxSum, sum);
        return Math.max(left, right) + root.val;
    }

    /**
     * 本地调试入口。
     *
     * @param args 命令行参数
     */
    public static void main(String[] args) {
        Hot1000124MaxPathSum solution = new Hot1000124MaxPathSum();
    }
}
