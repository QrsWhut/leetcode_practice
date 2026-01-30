package com.rsqu.leetcode.lcof2.剑指_offer_ii_046_二叉树的右侧视图;

import java.util.*;
import com.rsqu.leetcode.util.TestUtil;
import com.rsqu.leetcode.util.TreeNode;

public class Lcof2_046 {
    // 题目描述：本目录 README.md。

    public List<Integer> solution(TreeNode root) {
        // TODO：请实现解法
        return null;
    }

    public static void main(String[] args) {
        Lcof2_046 solution = new Lcof2_046();

        // 示例1
        TreeNode root1 = TreeNode.fromArray(new Integer[]{1, 2, 3, null, 5, null, 4});
        Object result1 = solution.solution(root1);
        Object expected1 = java.util.Arrays.asList(1, 3, 4);
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        TreeNode root2 = TreeNode.fromArray(new Integer[]{1, null, 3});
        Object result2 = solution.solution(root2);
        Object expected2 = java.util.Arrays.asList(1, 3);
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

        // 示例3
        TreeNode root3 = TreeNode.fromArray(new Integer[]{});
        Object result3 = solution.solution(root3);
        Object expected3 = java.util.Arrays.asList();
        boolean pass3 = TestUtil.isEqual(result3, expected3);
        System.out.println("示例3：" + (pass3 ? "通过" : "失败") + "，输出=" + TestUtil.format(result3) + "，期望=" + TestUtil.format(expected3));

    }
}
