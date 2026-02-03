package com.rsqu.leetcode.lcof2.剑指_offer_ii_049_从根节点到叶节点的路径数字之和;

import com.rsqu.leetcode.util.TestUtil;
import com.rsqu.leetcode.util.TreeNode;

public class Lcof2_049 {
    // 题目描述：本目录 README.md。

    public int solution(TreeNode root) {
        // TODO：请实现解法
        return 0;
    }

    public static void main(String[] args) {
        Lcof2_049 solution = new Lcof2_049();

        // 示例1
        TreeNode root1 = TreeNode.fromArray(new Integer[]{1, 2, 3});
        Object result1 = solution.solution(root1);
        Object expected1 = 25; // 解释: 从根到叶子节点路径 1->2 代表数字 12 从根到叶子节点路径 1->3 代表数字 13 因此，数字总和 = 12 + 13 = 25
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        TreeNode root2 = TreeNode.fromArray(new Integer[]{4, 9, 0, 5, 1});
        Object result2 = solution.solution(root2);
        Object expected2 = 1026; // 解释: 从根到叶子节点路径 4->9->5 代表数字 495 从根到叶子节点路径 4->9->1 代表数字 491 从根到叶子节点路径 4->0 代表数字 40 因此，数字总和 = 495 + 491 + 40 = 1026
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

    }
}
