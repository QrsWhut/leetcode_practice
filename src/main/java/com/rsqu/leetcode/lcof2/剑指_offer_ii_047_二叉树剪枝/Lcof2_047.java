package com.rsqu.leetcode.lcof2.剑指_offer_ii_047_二叉树剪枝;

import com.rsqu.leetcode.util.TestUtil;
import com.rsqu.leetcode.util.TreeNode;

public class Lcof2_047 {
    // 题目描述：本目录 README.md。

    public TreeNode solution(TreeNode root) {
        // TODO：请实现解法
        return null;
    }

    public static void main(String[] args) {
        Lcof2_047 solution = new Lcof2_047();

        // 示例1
        TreeNode root1 = TreeNode.fromArray(new Integer[]{1, null, 0, 0, 1});
        Object result1 = solution.solution(root1);
        Object expected1 = null;
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        TreeNode root2 = TreeNode.fromArray(new Integer[]{1, 0, 1, 0, 0, 0, 1});
        Object result2 = solution.solution(root2);
        Object expected2 = null;
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

        // 示例3
        TreeNode root3 = TreeNode.fromArray(new Integer[]{1, 1, 0, 1, 1, 0, 1, 0});
        Object result3 = solution.solution(root3);
        Object expected3 = null;
        boolean pass3 = TestUtil.isEqual(result3, expected3);
        System.out.println("示例3：" + (pass3 ? "通过" : "失败") + "，输出=" + TestUtil.format(result3) + "，期望=" + TestUtil.format(expected3));

    }
}
