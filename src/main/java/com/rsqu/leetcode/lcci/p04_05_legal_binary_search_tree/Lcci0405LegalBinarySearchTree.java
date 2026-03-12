package com.rsqu.leetcode.lcci.p04_05_legal_binary_search_tree;

import com.rsqu.leetcode.util.TestUtil;
import com.rsqu.leetcode.util.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Lcci0405LegalBinarySearchTree {
    // 题目描述：本目录 README.md。

    public boolean solution(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        pre(root, list);
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) > list.get(i + 1)) {
                return false;
            }
        }
        return true;
    }

    public void pre(TreeNode root, List<Integer> list) {
        if (root == null)
            return;
        pre(root.left, list);
        list.add(root.val);
        pre(root.right, list);
    }

    public static void main(String[] args) {
        Lcci0405LegalBinarySearchTree solution = new Lcci0405LegalBinarySearchTree();

        // 示例 1
        TreeNode root1 = TreeNode.fromArray(new Integer[]{2, 1, 3});
        Object result1 = solution.solution(root1);
        Object expected1 = true;
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出：" + TestUtil.format(result1) + "，期望：" + TestUtil.format(expected1));

        // 示例 2
        TreeNode root2 = TreeNode.fromArray(new Integer[]{5, 1, 4, null, null, 3, 6});
        Object result2 = solution.solution(root2);
        Object expected2 = false;
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出：" + TestUtil.format(result2) + "，期望：" + TestUtil.format(expected2));
    }
}
