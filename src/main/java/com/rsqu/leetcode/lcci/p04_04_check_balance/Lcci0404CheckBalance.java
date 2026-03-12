package com.rsqu.leetcode.lcci.p04_04_check_balance;

import com.rsqu.leetcode.util.TestUtil;
import com.rsqu.leetcode.util.TreeNode;

public class Lcci0404CheckBalance {
    // 题目描述：本目录 README.md。

    public boolean solution(TreeNode root) {
        int res = dfs(root);
        return res != -1;
    }
    public int dfs(TreeNode root){
        if(root == null) return 0;
        int left = dfs(root.left);
        int right = dfs(root.right);
        if (Math.abs(left - right) > 1) {
            return -1;
        }
        return Math.max(left, right) + 1;
    }
    public static void main(String[] args) {
        Lcci0404CheckBalance solution = new Lcci0404CheckBalance();

        // 示例 1
        TreeNode root1 = TreeNode.fromArray(new Integer[]{3, 9, 20, null, null, 15, 7});
        Object result1 = solution.solution(root1);
        Object expected1 = true;
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出：" + TestUtil.format(result1) + "，期望：" + TestUtil.format(expected1));

        // 示例 2
        TreeNode root2 = TreeNode.fromArray(new Integer[]{1, 2, 2, 3, 3, null, null, 4, 4});
        Object result2 = solution.solution(root2);
        Object expected2 = false;
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出：" + TestUtil.format(result2) + "，期望：" + TestUtil.format(expected2));
    }
}
