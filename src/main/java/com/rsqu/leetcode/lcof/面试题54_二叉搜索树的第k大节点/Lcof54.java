package com.rsqu.leetcode.lcof.面试题54_二叉搜索树的第k大节点;

import com.rsqu.leetcode.util.TestUtil;
import com.rsqu.leetcode.util.TreeNode;

public class Lcof54 {
    // 题目描述：本目录 README.md。

    public int solution(TreeNode root, int k) {
        // TODO：请实现解法
        return 0;
    }

    public static void main(String[] args) {
        Lcof54 solution = new Lcof54();

        // 示例1
        TreeNode root1 = TreeNode.fromArray(new Integer[]{3, 1, 4, null, 2});
        int k1 = 1; // 3 / \ 1   4 \ 2
        Object result1 = solution.solution(root1, k1);
        Object expected1 = 4;
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        TreeNode root2 = TreeNode.fromArray(new Integer[]{5, 3, 6, 2, 4, null, null, 1});
        int k2 = 3; // 5 / \ 3   6 / \ 2   4 / 1
        Object result2 = solution.solution(root2, k2);
        Object expected2 = 4;
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

    }
}
