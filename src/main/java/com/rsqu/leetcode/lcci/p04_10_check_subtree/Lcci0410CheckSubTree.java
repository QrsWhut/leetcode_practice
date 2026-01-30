package com.rsqu.leetcode.lcci.p04_10_check_subtree;

import com.rsqu.leetcode.util.TestUtil;
import com.rsqu.leetcode.util.TreeNode;

public class Lcci0410CheckSubTree {
    // 题目描述：本目录 README.md。

    public boolean solution(TreeNode t1, TreeNode t2) {
        // TODO：请实现解法
        return false;
    }

    public static void main(String[] args) {
        Lcci0410CheckSubTree solution = new Lcci0410CheckSubTree();

        // 示例1
        TreeNode t11 = TreeNode.fromArray(new Integer[]{1, 2, 3});
        TreeNode t21 = TreeNode.fromArray(new Integer[]{2});
        Object result1 = solution.solution(t11, t21);
        Object expected1 = true;
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        TreeNode t12 = TreeNode.fromArray(new Integer[]{1, null, 2, 4});
        TreeNode t22 = TreeNode.fromArray(new Integer[]{3, 2});
        Object result2 = solution.solution(t12, t22);
        Object expected2 = false;
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

    }
}
