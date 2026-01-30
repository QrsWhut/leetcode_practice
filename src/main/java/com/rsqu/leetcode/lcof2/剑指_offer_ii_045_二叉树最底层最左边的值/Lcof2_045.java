package com.rsqu.leetcode.lcof2.剑指_offer_ii_045_二叉树最底层最左边的值;

import com.rsqu.leetcode.util.TestUtil;
import com.rsqu.leetcode.util.TreeNode;

public class Lcof2_045 {
    // 题目描述：本目录 README.md。

    public int solution(TreeNode root) {
        // TODO：请实现解法
        return 0;
    }

    public static void main(String[] args) {
        Lcof2_045 solution = new Lcof2_045();

        // 示例1
        TreeNode root1 = TreeNode.fromArray(new Integer[]{2, 1, 3});
        Object result1 = solution.solution(root1);
        Object expected1 = 1;
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        TreeNode root2 = TreeNode.fromArray(new Integer[]{1, 2, 3, 4, null, 5, 6, null, null, 7});
        Object result2 = solution.solution(root2);
        Object expected2 = 7;
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

    }
}
