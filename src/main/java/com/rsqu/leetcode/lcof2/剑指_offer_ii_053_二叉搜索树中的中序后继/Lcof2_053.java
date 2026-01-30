package com.rsqu.leetcode.lcof2.剑指_offer_ii_053_二叉搜索树中的中序后继;

import com.rsqu.leetcode.util.TestUtil;
import com.rsqu.leetcode.util.TreeNode;

public class Lcof2_053 {
    // 题目描述：本目录 README.md。

    public TreeNode solution(TreeNode root, TreeNode p) {
        // TODO：请实现解法
        return null;
    }

    public static void main(String[] args) {
        Lcof2_053 solution = new Lcof2_053();

        // 示例1
        TreeNode root1 = TreeNode.fromArray(new Integer[]{2, 1, 3});
        TreeNode p1 = null;
        Object result1 = solution.solution(root1, p1);
        Object expected1 = null;
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        TreeNode root2 = TreeNode.fromArray(new Integer[]{5, 3, 6, 2, 4, null, null, 1});
        TreeNode p2 = null;
        Object result2 = solution.solution(root2, p2);
        Object expected2 = null;
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

    }
}
