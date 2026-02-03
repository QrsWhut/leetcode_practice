package com.rsqu.leetcode.lcci.p04_05_legal_binary_search_tree;

import com.rsqu.leetcode.util.TestUtil;
import com.rsqu.leetcode.util.TreeNode;

public class Lcci0405LegalBinarySearchTree {
    // 题目描述：本目录 README.md。

    public boolean solution(TreeNode root) {
        // TODO：请实现解法
        return false;
    }

    public static void main(String[] args) {
        Lcci0405LegalBinarySearchTree solution = new Lcci0405LegalBinarySearchTree();

        // 示例1
        TreeNode root1 = null;
        Object result1 = solution.solution(root1);
        Object expected1 = true;
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        TreeNode root2 = null;
        Object result2 = solution.solution(root2);
        Object expected2 = false; // 解释: 输入为: [5,1,4,null,null,3,6]。 根节点的值为 5 ，但是其右子节点值为 4 。
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

    }
}
