package com.rsqu.leetcode.lcof2.剑指_offer_ii_050_向下的路径节点之和;

import com.rsqu.leetcode.util.TestUtil;
import com.rsqu.leetcode.util.TreeNode;

public class Lcof2_050 {
    // 题目描述：本目录 README.md。

    public int solution(TreeNode root, int targetSum) {
        // TODO：请实现解法
        return 0;
    }

    public static void main(String[] args) {
        Lcof2_050 solution = new Lcof2_050();

        // 示例1
        TreeNode root1 = TreeNode.fromArray(new Integer[]{10, 5, -3, 3, 2, null, 11, 3, -2, null, 1});
        int targetSum1 = 8;
        Object result1 = solution.solution(root1, targetSum1);
        Object expected1 = 3 解释:和等于 8 的路径有 3 条，如图所示。;
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        TreeNode root2 = TreeNode.fromArray(new Integer[]{5, 4, 8, 11, null, 13, 4, 7, 2, null, null, 5, 1});
        int targetSum2 = 22;
        Object result2 = solution.solution(root2, targetSum2);
        Object expected2 = 3;
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

    }
}
