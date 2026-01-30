package com.rsqu.leetcode.lcof2.剑指_offer_ii_054_所有大于等于节点的值之和;

import com.rsqu.leetcode.util.TestUtil;
import com.rsqu.leetcode.util.TreeNode;

public class Lcof2_054 {
    // 题目描述：本目录 README.md。

    public TreeNode solution(TreeNode root) {
        // TODO：请实现解法
        return null;
    }

    public static void main(String[] args) {
        Lcof2_054 solution = new Lcof2_054();

        // 示例1
        TreeNode root1 = TreeNode.fromArray(new Integer[]{4, 1, 6, 0, 2, 5, 7, null, null, null, 3, null, null, null, 8});
        Object result1 = solution.solution(root1);
        Object expected1 = TreeNode.fromArray(new Integer[]{30, 36, 21, 36, 35, 26, 15, null, null, null, 33, null, null, null, 8});
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        TreeNode root2 = TreeNode.fromArray(new Integer[]{0, null, 1});
        Object result2 = solution.solution(root2);
        Object expected2 = TreeNode.fromArray(new Integer[]{1, null, 1});
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

        // 示例3
        TreeNode root3 = TreeNode.fromArray(new Integer[]{1, 0, 2});
        Object result3 = solution.solution(root3);
        Object expected3 = TreeNode.fromArray(new Integer[]{3, 3, 2});
        boolean pass3 = TestUtil.isEqual(result3, expected3);
        System.out.println("示例3：" + (pass3 ? "通过" : "失败") + "，输出=" + TestUtil.format(result3) + "，期望=" + TestUtil.format(expected3));

        // 示例4
        TreeNode root4 = TreeNode.fromArray(new Integer[]{3, 2, 4, 1});
        Object result4 = solution.solution(root4);
        Object expected4 = TreeNode.fromArray(new Integer[]{7, 9, 4, 10});
        boolean pass4 = TestUtil.isEqual(result4, expected4);
        System.out.println("示例4：" + (pass4 ? "通过" : "失败") + "，输出=" + TestUtil.format(result4) + "，期望=" + TestUtil.format(expected4));

    }
}
