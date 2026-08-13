package com.rsqu.leetcode.hot100.p0437_path_sum;

import com.rsqu.leetcode.util.TreeNode;

public class Hot1000437PathSum {

    public int pathSum(TreeNode root, long targetSum) {
        if (root == null) {
            return 0;
        }
        // 总路径数 = 以 root 为起点的路径 + 左子树内部路径 + 右子树内部路径
        return dfs(root, targetSum)
                + pathSum(root.left, targetSum)
                + pathSum(root.right, targetSum);
    }

    /**
     * 只统计以 node 为起点、且必须包含 node 的路径数。
     */
    private int dfs(TreeNode node, long targetSum) {
        if (node == null) {
            return 0;
        }
        int count = 0;
        if (node.val == targetSum) {
            count++;
        }
        count += dfs(node.left, targetSum - node.val);
        count += dfs(node.right, targetSum - node.val);
        return count;
    }

    public static void main(String[] args) {
        Hot1000437PathSum solution = new Hot1000437PathSum();
        // 示例：10 -> 5 -> 3, 3, -2; 5 -> 2 -> 1; 10 -> -3 -> 11，targetSum = 8，答案 3
        TreeNode root = TreeNode.fromArray(new Integer[]{10, 5, -3, 3, 2, null, 11, 3, -2, null, 1});
        System.out.println(solution.pathSum(root, 8));
        // 反例验证：1 -> 1 -> -1，targetSum = 1，答案 3
        TreeNode chain = TreeNode.fromArray(new Integer[]{1, 1, -1});
        System.out.println(solution.pathSum(chain, 1));
        // 空树
        System.out.println(solution.pathSum(null, 8));
    }
}