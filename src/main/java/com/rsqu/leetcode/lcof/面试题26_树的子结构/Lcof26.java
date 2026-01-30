package com.rsqu.leetcode.lcof.面试题26_树的子结构;

import com.rsqu.leetcode.util.TestUtil;
import com.rsqu.leetcode.util.TreeNode;

public class Lcof26 {
    // 题目描述：本目录 README.md。

    public boolean solution(TreeNode a, TreeNode b) {
        // TODO：请实现解法
        return false;
    }

    public static void main(String[] args) {
        Lcof26 solution = new Lcof26();

        // 示例1
        TreeNode a1 = TreeNode.fromArray(new Integer[]{1, 2, 3});
        TreeNode b1 = TreeNode.fromArray(new Integer[]{3, 1});
        Object result1 = solution.solution(a1, b1);
        Object expected1 = false;
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        TreeNode a2 = TreeNode.fromArray(new Integer[]{3, 4, 5, 1, 2});
        TreeNode b2 = TreeNode.fromArray(new Integer[]{4, 1});
        Object result2 = solution.solution(a2, b2);
        Object expected2 = true;
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

    }
}
