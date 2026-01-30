package com.rsqu.leetcode.lcof.面试题27_二叉树的镜像;

import com.rsqu.leetcode.util.TestUtil;
import com.rsqu.leetcode.util.TreeNode;

public class Lcof27 {
    // 题目描述：本目录 README.md。

    public TreeNode solution(TreeNode root) {
        // TODO：请实现解法
        return null;
    }

    public static void main(String[] args) {
        Lcof27 solution = new Lcof27();

        // 示例1
        TreeNode root1 = TreeNode.fromArray(new Integer[]{4, 2, 7, 1, 3, 6, 9});
        Object result1 = solution.solution(root1);
        Object expected1 = TreeNode.fromArray(new Integer[]{4, 7, 2, 9, 6, 3, 1});
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

    }
}
