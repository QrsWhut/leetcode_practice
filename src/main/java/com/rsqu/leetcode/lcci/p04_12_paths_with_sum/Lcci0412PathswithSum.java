package com.rsqu.leetcode.lcci.p04_12_paths_with_sum;

import com.rsqu.leetcode.util.TestUtil;
import com.rsqu.leetcode.util.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class Lcci0412PathswithSum {
    /**
     * 目标路径和。
     */
    private int targetSum;

    /**
     * 当前路径中前缀和出现次数。
     */
    private Map<Long, Integer> prefixCountMap;

    // 题目描述：本目录 README.md。

    public int solution(TreeNode root, int sum) {
        targetSum = sum;
        prefixCountMap = new HashMap<>();
        prefixCountMap.put(0L, 1);
        return dfs(root, 0L);
    }

    private int dfs(TreeNode root, long prefixSum) {
        if (root == null) {
            return 0;
        }

        long currentSum = prefixSum + root.val;
        int pathCount = prefixCountMap.getOrDefault(currentSum - targetSum, 0);
        prefixCountMap.put(currentSum, prefixCountMap.getOrDefault(currentSum, 0) + 1);

        pathCount += dfs(root.left, currentSum);
        pathCount += dfs(root.right, currentSum);

        int currentCount = prefixCountMap.get(currentSum);
        if (currentCount == 1) {
            prefixCountMap.remove(currentSum);
        } else {
            prefixCountMap.put(currentSum, currentCount - 1);
        }
        return pathCount;
    }

    public static void main(String[] args) {
        Lcci0412PathswithSum solution = new Lcci0412PathswithSum();

        // 示例1
        TreeNode root1 = TreeNode.fromArray(
                new Integer[]{5, 4, 8, 11, null, 13, 4, 7, 2, null, null, 5, 1});
        int sum1 = 22;
        int result1 = solution.solution(root1, sum1);
        int expected1 = 3;
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败")
                + "，输出=" + TestUtil.format(result1)
                + "，期望=" + TestUtil.format(expected1));
    }
}
