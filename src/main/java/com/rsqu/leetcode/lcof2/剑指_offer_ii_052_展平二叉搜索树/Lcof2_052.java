package com.rsqu.leetcode.lcof2.剑指_offer_ii_052_展平二叉搜索树;

import com.rsqu.leetcode.util.TestUtil;
import com.rsqu.leetcode.util.TreeNode;

public class Lcof2_052 {
    // 题目描述：本目录 README.md。

    public TreeNode solution(TreeNode root) {
        // TODO：请实现解法
        return null;
    }

    public static void main(String[] args) {
        Lcof2_052 solution = new Lcof2_052();

        // 示例1
        TreeNode root1 = TreeNode.fromArray(new Integer[]{5, 3, 6, 2, 4, null, 8, 1, null, null, null, 7, 9});
        Object result1 = solution.solution(root1);
        Object expected1 = TreeNode.fromArray(new Integer[]{1, null, 2, null, 3, null, 4, null, 5, null, 6, null, 7, null, 8, null, 9});
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        TreeNode root2 = TreeNode.fromArray(new Integer[]{5, 1, 7});
        Object result2 = solution.solution(root2);
        Object expected2 = TreeNode.fromArray(new Integer[]{1, null, 5, null, 7});
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

    }
}
