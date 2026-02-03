package com.rsqu.leetcode.lcof2.剑指_offer_ii_044_二叉树每层的最大值;

import java.util.*;
import com.rsqu.leetcode.util.TestUtil;
import com.rsqu.leetcode.util.TreeNode;

public class Lcof2_044 {
    // 题目描述：本目录 README.md。

    public List<Integer> solution(TreeNode root) {
        // TODO：请实现解法
        return null;
    }

    public static void main(String[] args) {
        Lcof2_044 solution = new Lcof2_044();

        // 示例1
        TreeNode root1 = TreeNode.fromArray(new Integer[]{1, 3, 2, 5, 3, null, 9});
        Object result1 = solution.solution(root1);
        Object expected1 = java.util.Arrays.asList(1,3,9); // 解释: 1 / \ 3   2 / \   \ 5   3   9
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        TreeNode root2 = TreeNode.fromArray(new Integer[]{1, 2, 3});
        Object result2 = solution.solution(root2);
        Object expected2 = java.util.Arrays.asList(1,3); // 解释: 1 / \ 2   3
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

        // 示例3
        TreeNode root3 = TreeNode.fromArray(new Integer[]{1});
        Object result3 = solution.solution(root3);
        Object expected3 = java.util.Arrays.asList(1);
        boolean pass3 = TestUtil.isEqual(result3, expected3);
        System.out.println("示例3：" + (pass3 ? "通过" : "失败") + "，输出=" + TestUtil.format(result3) + "，期望=" + TestUtil.format(expected3));

        // 示例4
        TreeNode root4 = TreeNode.fromArray(new Integer[]{1, null, 2});
        Object result4 = solution.solution(root4);
        Object expected4 = java.util.Arrays.asList(1,2); // 解释: 1 \ 2
        boolean pass4 = TestUtil.isEqual(result4, expected4);
        System.out.println("示例4：" + (pass4 ? "通过" : "失败") + "，输出=" + TestUtil.format(result4) + "，期望=" + TestUtil.format(expected4));

        // 示例5
        TreeNode root5 = TreeNode.fromArray(new Integer[]{});
        Object result5 = solution.solution(root5);
        Object expected5 = java.util.Arrays.asList();
        boolean pass5 = TestUtil.isEqual(result5, expected5);
        System.out.println("示例5：" + (pass5 ? "通过" : "失败") + "，输出=" + TestUtil.format(result5) + "，期望=" + TestUtil.format(expected5));

    }
}
