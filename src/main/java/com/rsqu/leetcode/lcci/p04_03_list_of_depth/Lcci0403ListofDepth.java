package com.rsqu.leetcode.lcci.p04_03_list_of_depth;

import com.rsqu.leetcode.util.TestUtil;
import com.rsqu.leetcode.util.ListNode;
import com.rsqu.leetcode.util.TreeNode;

public class Lcci0403ListofDepth {
    // 题目描述：本目录 README.md。

    public ListNode[] solution(TreeNode tree) {
        // TODO：请实现解法
        return new ListNode[]{};
    }

    public static void main(String[] args) {
        Lcci0403ListofDepth solution = new Lcci0403ListofDepth();

        // 示例1
        TreeNode tree1 = null;
        Object result1 = solution.solution(tree1);
        Object expected1 = new ListNode[]{{1}, {2, 3}, {4, 5, 7}, {8}};
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

    }
}
