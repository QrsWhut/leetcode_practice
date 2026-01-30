package com.rsqu.leetcode.lcof.面试题07_重建二叉树;

import com.rsqu.leetcode.util.TestUtil;
import com.rsqu.leetcode.util.TreeNode;

public class Lcof07 {
    // 题目描述：本目录 README.md。

    public TreeNode solution(int[] preorder, int[] inorder) {
        // TODO：请实现解法
        return null;
    }

    public static void main(String[] args) {
        Lcof07 solution = new Lcof07();

        // 示例1
        int[] preorder1 = new int[]{3, 9, 20, 15, 7};
        int[] inorder1 = new int[]{9, 3, 15, 20, 7};
        Object result1 = solution.solution(preorder1, inorder1);
        Object expected1 = TreeNode.fromArray(new Integer[]{3, 9, 20, null, null, 15, 7});
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        int[] preorder2 = new int[]{-1};
        int[] inorder2 = new int[]{-1};
        Object result2 = solution.solution(preorder2, inorder2);
        Object expected2 = TreeNode.fromArray(new Integer[]{-1});
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

    }
}
