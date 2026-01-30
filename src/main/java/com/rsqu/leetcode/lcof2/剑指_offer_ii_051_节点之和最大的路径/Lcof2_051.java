package com.rsqu.leetcode.lcof2.剑指_offer_ii_051_节点之和最大的路径;

import com.rsqu.leetcode.util.TestUtil;
import com.rsqu.leetcode.util.TreeNode;

public class Lcof2_051 {
    // 题目描述：本目录 README.md。

    public int solution(TreeNode root) {
        // TODO：请实现解法
        return 0;
    }

    public static void main(String[] args) {
        Lcof2_051 solution = new Lcof2_051();

        // 示例1
        TreeNode root1 = TreeNode.fromArray(new Integer[]{1, 2, 3});
        Object result1 = solution.solution(root1);
        Object expected1 = 6 解释:最优路径是 2 -> 1 -> 3 ，路径和为 2 + 1 + 3 = 6;
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        TreeNode root2 = TreeNode.fromArray(new Integer[]{-10, 9, 20, null, null, 15, 7});
        Object result2 = solution.solution(root2);
        Object expected2 = 42 解释:最优路径是 15 -> 20 -> 7 ，路径和为 15 + 20 + 7 = 42;
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

    }
}
