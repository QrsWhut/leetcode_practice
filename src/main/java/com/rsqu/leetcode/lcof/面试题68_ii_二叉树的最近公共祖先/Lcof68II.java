package com.rsqu.leetcode.lcof.面试题68_ii_二叉树的最近公共祖先;

import com.rsqu.leetcode.util.TestUtil;
import com.rsqu.leetcode.util.TreeNode;

public class Lcof68II {
    // 题目描述：本目录 README.md。

    public TreeNode solution(TreeNode root, TreeNode p, TreeNode q) {
        // TODO：请实现解法
        return null;
    }

    public static void main(String[] args) {
        Lcof68II solution = new Lcof68II();

        // 示例1
        TreeNode root1 = TreeNode.fromArray(new Integer[]{3, 5, 1, 6, 2, 0, 8, null, null, 7, 4});
        TreeNode p1 = null;
        TreeNode q1 = null;
        Object result1 = solution.solution(root1, p1, q1);
        Object expected1 = null;
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        TreeNode root2 = TreeNode.fromArray(new Integer[]{3, 5, 1, 6, 2, 0, 8, null, null, 7, 4});
        TreeNode p2 = null;
        TreeNode q2 = null;
        Object result2 = solution.solution(root2, p2, q2);
        Object expected2 = null;
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

    }
}
