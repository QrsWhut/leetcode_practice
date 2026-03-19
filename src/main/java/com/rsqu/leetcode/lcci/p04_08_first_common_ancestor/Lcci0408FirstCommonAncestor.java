package com.rsqu.leetcode.lcci.p04_08_first_common_ancestor;

import com.rsqu.leetcode.util.TestUtil;
import com.rsqu.leetcode.util.TreeNode;

public class Lcci0408FirstCommonAncestor {
    // 题目描述：本目录 README.md。

    public static TreeNode res;

    public TreeNode solution(TreeNode root, TreeNode p, TreeNode q) {
        res = null;
        dfs(root, p, q);
        return res;
    }

    public boolean dfs(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return false;
        }

        boolean self = root == p || root == q;
        boolean left = dfs(root.left, p, q);
        boolean right = dfs(root.right, p, q);
        if ((self && left) || (self && right) || (left && right)) {
            res = root;
        }
        return self || left || right;
    }

    public static void main(String[] args) {
        Lcci0408FirstCommonAncestor solution = new Lcci0408FirstCommonAncestor();

        // 示例1
        TreeNode root1 = TreeNode.fromArray(new Integer[]{3, 5, 1, 6, 2, 0, 8, null, null, 7, 4});
        TreeNode p1 = root1.left;
        TreeNode q1 = root1.right;
        TreeNode resultNode1 = solution.solution(root1, p1, q1);
        Integer result1 = resultNode1 == null ? null : resultNode1.val;
        Integer expected1 = 3;
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败")
                + "，输出=" + TestUtil.format(result1)
                + "，期望=" + TestUtil.format(expected1));

        // 示例2
        TreeNode root2 = TreeNode.fromArray(new Integer[]{3, 5, 1, 6, 2, 0, 8, null, null, 7, 4});
        TreeNode p2 = root2.left;
        TreeNode q2 = root2.left.right.right;
        TreeNode resultNode2 = solution.solution(root2, p2, q2);
        Integer result2 = resultNode2 == null ? null : resultNode2.val;
        Integer expected2 = 5;
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败")
                + "，输出=" + TestUtil.format(result2)
                + "，期望=" + TestUtil.format(expected2));
    }
}
