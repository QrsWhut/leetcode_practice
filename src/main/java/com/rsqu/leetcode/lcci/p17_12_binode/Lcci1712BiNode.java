package com.rsqu.leetcode.lcci.p17_12_binode;

import com.rsqu.leetcode.util.TestUtil;
import com.rsqu.leetcode.util.TreeNode;

public class Lcci1712BiNode {
    // 题目描述：本目录 README.md。

    public TreeNode solution(TreeNode root) {
        // TODO：请实现解法
        return null;
    }

    public static void main(String[] args) {
        Lcci1712BiNode solution = new Lcci1712BiNode();

        // 示例1
        TreeNode root1 = TreeNode.fromArray(new Integer[]{4, 2, 5, 1, 3, null, 6, 0});
        Object result1 = solution.solution(root1);
        Object expected1 = TreeNode.fromArray(new Integer[]{0, null, 1, null, 2, null, 3, null, 4, null, 5, null, 6});
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

    }
}
