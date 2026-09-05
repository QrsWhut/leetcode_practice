package com.rsqu.leetcode.lcci.p04_03_list_of_depth;

import com.rsqu.leetcode.util.ListNode;
import com.rsqu.leetcode.util.TestUtil;
import com.rsqu.leetcode.util.TreeNode;
import java.util.Deque;
import java.util.LinkedList;

public class Lcci0403ListofDepth {
    // 题目描述：本目录 README.md。

    public ListNode[] solution(TreeNode tree) {
        Deque<TreeNode> stack = new LinkedList<TreeNode>();
        stack.push(tree);
        LinkedList<ListNode> ans = new LinkedList<>();
        while (!stack.isEmpty()) {
            ListNode node = new ListNode(-1);
            ListNode cur = node;
            for (int i = stack.size(); i > 0; i--) {
                TreeNode treeNode = stack.pollLast();
                cur.next = new ListNode(treeNode.val);
                if (treeNode.left != null) {
                    stack.push(treeNode.left);
                }
                if (treeNode.right != null) {
                    stack.push(treeNode.right);
                }
                cur = cur.next;
            }
            ans.add(node.next);
        }
        return ans.toArray(new ListNode[ans.size()]);
    }

    public static void main(String[] args) {
        Lcci0403ListofDepth solution = new Lcci0403ListofDepth();

        // 示例 1
        TreeNode tree1 = TreeNode.fromArray(new Integer[]{1, 2, 3, 4, 5, null, 7, 8});
        Object result1 = solution.solution(tree1);
        Object expected1 = new ListNode[]{
                ListNode.fromArray(new int[]{1}),
                ListNode.fromArray(new int[]{2, 3}),
                ListNode.fromArray(new int[]{4, 5, 7}),
                ListNode.fromArray(new int[]{8})
        };
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出：" + TestUtil.format(result1) + "，期望：" + TestUtil.format(expected1));
    }
}
