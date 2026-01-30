package com.rsqu.leetcode.lcof.面试题28_对称的二叉树;

import com.rsqu.leetcode.util.TestUtil;
import com.rsqu.leetcode.util.TreeNode;

public class Lcof28 {
    // 题目描述：本目录 README.md。

    public boolean solution(TreeNode root) {
        // TODO：请实现解法
        return false;
    }

    public static void main(String[] args) {
        Lcof28 solution = new Lcof28();

        // 示例1
        TreeNode root1 = TreeNode.fromArray(new Integer[]{1, 2, 2, 3, 4, 4, 3});
        Object result1 = solution.solution(root1);
        Object expected1 = true;
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        TreeNode root2 = TreeNode.fromArray(new Integer[]{1, 2, 2, null, 3, null, 3});
        Object result2 = solution.solution(root2);
        Object expected2 = false;
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

    }
}
