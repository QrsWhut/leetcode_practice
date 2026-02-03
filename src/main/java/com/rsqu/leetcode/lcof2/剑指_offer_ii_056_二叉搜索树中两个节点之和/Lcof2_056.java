package com.rsqu.leetcode.lcof2.剑指_offer_ii_056_二叉搜索树中两个节点之和;

import com.rsqu.leetcode.util.TestUtil;
import com.rsqu.leetcode.util.TreeNode;

public class Lcof2_056 {
    // 题目描述：本目录 README.md。

    public boolean solution(TreeNode root, int k) {
        // TODO：请实现解法
        return false;
    }

    public static void main(String[] args) {
        Lcof2_056 solution = new Lcof2_056();

        // 示例1
        TreeNode root1 = TreeNode.fromArray(new Integer[]{8, 6, 10, 5, 7, 9, 11});
        int k1 = 12;
        Object result1 = solution.solution(root1, k1);
        Object expected1 = true; // 解释: 节点 5 和节点 7 之和等于 12
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        TreeNode root2 = TreeNode.fromArray(new Integer[]{8, 6, 10, 5, 7, 9, 11});
        int k2 = 22;
        Object result2 = solution.solution(root2, k2);
        Object expected2 = false; // 解释: 不存在两个节点值之和为 22 的节点
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

    }
}
