package com.rsqu.leetcode.lcci.p04_08_first_common_ancestor;

import com.rsqu.leetcode.util.TestUtil;
import com.rsqu.leetcode.util.TreeNode;

public class Lcci0408FirstCommonAncestor {
    // 题目描述：本目录 README.md。

    public TreeNode solution(TreeNode root, TreeNode p, TreeNode q) {
        // TODO：请实现解法
        return null;
    }

    public static void main(String[] args) {
        Lcci0408FirstCommonAncestor solution = new Lcci0408FirstCommonAncestor();

        // 示例1
        TreeNode root1 = TreeNode.fromArray(new Integer[]{3, 5, 1, 6, 2, 0, 8, null, null, 7, 4});
        TreeNode p1 = null;
        TreeNode q1 = null;
        Object result1 = solution.solution(root1, p1, q1);
        System.out.println("示例1输出：" + TestUtil.format(result1));

        // 示例2
        TreeNode root2 = null;
        // TODO：为 p2 设置输入
        // TODO：为 q2 设置输入
        Object result2 = solution.solution(root2, p2, q2);
        System.out.println("示例2输出：" + TestUtil.format(result2));

        // 示例3
        TreeNode root3 = TreeNode.fromArray(new Integer[]{3, 5, 1, 6, 2, 0, 8, null, null, 7, 4});
        TreeNode p3 = null;
        TreeNode q3 = null;
        Object result3 = solution.solution(root3, p3, q3);
        Object expected3 = null;
        boolean pass3 = TestUtil.isEqual(result3, expected3);
        System.out.println("示例3：" + (pass3 ? "通过" : "失败") + "，输出=" + TestUtil.format(result3) + "，期望=" + TestUtil.format(expected3));

    }
}
