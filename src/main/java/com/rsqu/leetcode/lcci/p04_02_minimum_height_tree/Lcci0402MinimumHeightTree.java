package com.rsqu.leetcode.lcci.p04_02_minimum_height_tree;

import com.rsqu.leetcode.util.TestUtil;
import com.rsqu.leetcode.util.TreeNode;
import java.util.ArrayList;
import java.util.List;

/**
 * 面试题 04.02 最小高度树。
 */
public class Lcci0402MinimumHeightTree {
    /**
     * 根据有序数组构建最小高度二叉搜索树。
     *
     * @param nums 升序且元素互不相同的数组
     * @return 最小高度二叉搜索树根节点
     */
    public TreeNode solution(int[] nums) {
        if (nums.length == 0) {
            return null;
        }
        return dfs(nums, 0, nums.length - 1);
    }

    /**
     * 递归构建区间对应的平衡二叉搜索树。
     *
     * @param nums 原始有序数组
     * @param start 当前区间左边界
     * @param end 当前区间右边界
     * @return 当前区间构建出的子树根节点
     */
    private TreeNode dfs(int[] nums, int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = (start + end) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = dfs(nums, start, mid - 1);
        root.right = dfs(nums, mid + 1, end);
        return root;
    }

    /**
     * 校验结果树是否满足题目要求。
     *
     * @param nums 原始有序数组
     * @param root 待校验的结果树
     * @return 是否为合法的最小高度二叉搜索树
     */
    private static boolean isValidMinimumHeightBst(int[] nums, TreeNode root) {
        if (nums == null || nums.length == 0) {
            return root == null;
        }
        List<Integer> inorderValues = new ArrayList<>(nums.length);
        collectInorderValues(root, inorderValues);
        if (inorderValues.size() != nums.length) {
            return false;
        }
        for (int i = 0; i < nums.length; i++) {
            if (inorderValues.get(i) != nums[i]) {
                return false;
            }
        }
        return getHeight(root) == getMinimumHeight(nums.length);
    }

    /**
     * 中序遍历收集树节点值。
     *
     * @param node 当前节点
     * @param inorderValues 中序遍历结果
     */
    private static void collectInorderValues(TreeNode node, List<Integer> inorderValues) {
        if (node == null) {
            return;
        }
        collectInorderValues(node.left, inorderValues);
        inorderValues.add(node.val);
        collectInorderValues(node.right, inorderValues);
    }

    /**
     * 计算二叉树高度。
     *
     * @param node 根节点
     * @return 树高度
     */
    private static int getHeight(TreeNode node) {
        if (node == null) {
            return 0;
        }
        return Math.max(getHeight(node.left), getHeight(node.right)) + 1;
    }

    /**
     * 根据节点数计算最小可能高度。
     *
     * @param nodeCount 节点总数
     * @return 最小高度
     */
    private static int getMinimumHeight(int nodeCount) {
        int minimumHeight = 0;
        long maximumNodeCount = 0L;
        while (maximumNodeCount < nodeCount) {
            minimumHeight++;
            maximumNodeCount = maximumNodeCount * 2 + 1;
        }
        return minimumHeight;
    }

    /**
     * 运行 README 示例。
     *
     * @param args 命令行参数
     */
    public static void main(String[] args) {
        Lcci0402MinimumHeightTree solution = new Lcci0402MinimumHeightTree();

        int[] nums1 = new int[]{-10, -3, 0, 5, 9};
        TreeNode result1 = solution.solution(nums1);
        boolean pass1 = isValidMinimumHeightBst(nums1, result1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出：" + TestUtil.format(result1)
                + "，校验：最小高度二叉搜索树");
    }
}
