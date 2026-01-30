package com.rsqu.leetcode.lcof2.剑指_offer_ii_112_最长递增路径;

import com.rsqu.leetcode.util.TestUtil;

public class Lcof2_112 {
    // 题目描述：本目录 README.md。

    public int solution(int[][] matrix) {
        // TODO：请实现解法
        return 0;
    }

    public static void main(String[] args) {
        Lcof2_112 solution = new Lcof2_112();

        // 示例1
        int[][] matrix1 = new int[][]{{9, 9, 4}, {6, 6, 8}, {2, 1, 1}};
        Object result1 = solution.solution(matrix1);
        Object expected1 = 4 解释:最长递增路径为 [1, 2, 6, 9]。;
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        int[][] matrix2 = new int[][]{{3, 4, 5}, {3, 2, 6}, {2, 2, 1}};
        Object result2 = solution.solution(matrix2);
        Object expected2 = 4 解释:最长递增路径是 [3, 4, 5, 6]。注意不允许在对角线方向上移动。;
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

        // 示例3
        int[][] matrix3 = new int[][]{{1}};
        Object result3 = solution.solution(matrix3);
        Object expected3 = 1;
        boolean pass3 = TestUtil.isEqual(result3, expected3);
        System.out.println("示例3：" + (pass3 ? "通过" : "失败") + "，输出=" + TestUtil.format(result3) + "，期望=" + TestUtil.format(expected3));

    }
}
