package com.rsqu.leetcode.lcof.面试题34_二叉树中和为某一值的路径;

import java.util.*;
import com.rsqu.leetcode.util.TestUtil;
import com.rsqu.leetcode.util.TreeNode;

public class Lcof34 {
    // 题目描述：本目录 README.md。

    public List<List<Integer>> solution(TreeNode root, int target) {
        // TODO：请实现解法
        return null;
    }

    public static void main(String[] args) {
        Lcof34 solution = new Lcof34();

        // 示例1
        TreeNode root1 = TreeNode.fromArray(new Integer[]{5, 4, 8, 11, null, 13, 4, 7, 2, null, null, 5, 1});
        int target1 = 22;
        Object result1 = solution.solution(root1, target1);
        Object expected1 = java.util.Arrays.asList(java.util.Arrays.asList(5, 4, 11, 2), java.util.Arrays.asList(5, 8, 4, 5));
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        TreeNode root2 = TreeNode.fromArray(new Integer[]{1, 2, 3});
        int target2 = 5;
        Object result2 = solution.solution(root2, target2);
        Object expected2 = java.util.Arrays.asList();
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

        // 示例3
        TreeNode root3 = TreeNode.fromArray(new Integer[]{1, 2});
        int target3 = 5;
        Object result3 = solution.solution(root3, target3);
        Object expected3 = java.util.Arrays.asList();
        boolean pass3 = TestUtil.isEqual(result3, expected3);
        System.out.println("示例3：" + (pass3 ? "通过" : "失败") + "，输出=" + TestUtil.format(result3) + "，期望=" + TestUtil.format(expected3));

    }
}
