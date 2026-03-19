package com.rsqu.leetcode.lcci.p04_06_successor;

import com.rsqu.leetcode.util.ListNode;
import com.rsqu.leetcode.util.TestUtil;
import com.rsqu.leetcode.util.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Lcci0406Successor {
    // 题目描述：本目录 README.md。

    public TreeNode solution(TreeNode root, TreeNode p) {
        List<TreeNode> list = new ArrayList<>();
        pre(root, list);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)==p){
                if (i+1 != list.size()) {
                    return list.get(i+1);
                } else {
                    return null;
                }
            }
        }
        return null;
    }

    public void pre(TreeNode root, List<TreeNode> list) {
        if (root == null)
            return;
        pre(root.left, list);
        list.add(root);
        pre(root.right, list);
    }

    public static void main(String[] args) {
        Lcci0406Successor solution = new Lcci0406Successor();

        // 示例1
        TreeNode root1 = TreeNode.fromArray(new Integer[]{2, 1, 3});
        TreeNode p1 = root1.left;
        TreeNode resultNode1 = solution.solution(root1, p1);
        Integer result1 = resultNode1 == null ? null : resultNode1.val;
        Integer expected1 = 2;
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败")
                + "，输出=" + TestUtil.format(result1)
                + "，期望=" + TestUtil.format(expected1));

        // 示例2
        TreeNode root2 = TreeNode.fromArray(new Integer[]{5, 3, 6, 2, 4, null, null, 1});
        TreeNode p2 = root2.right;
        TreeNode resultNode2 = solution.solution(root2, p2);
        Integer result2 = resultNode2 == null ? null : resultNode2.val;
        Integer expected2 = null;
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败")
                + "，输出=" + TestUtil.format(result2)
                + "，期望=" + TestUtil.format(expected2));
    }
}
