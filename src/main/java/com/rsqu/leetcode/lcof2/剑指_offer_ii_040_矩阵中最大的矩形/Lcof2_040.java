package com.rsqu.leetcode.lcof2.剑指_offer_ii_040_矩阵中最大的矩形;

import com.rsqu.leetcode.util.TestUtil;

public class Lcof2_040 {
    // 题目描述：本目录 README.md。

    public int solution(String[] matrix) {
        // TODO：请实现解法
        return 0;
    }

    public static void main(String[] args) {
        Lcof2_040 solution = new Lcof2_040();

        // 示例1
        String[] matrix1 = new String[]{"10100", "10111", "11111", "10010"};
        Object result1 = solution.solution(matrix1);
        Object expected1 = 6; // 解释:最大矩形如上图所示。
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        String[] matrix2 = new String[]{};
        Object result2 = solution.solution(matrix2);
        Object expected2 = 0;
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

        // 示例3
        String[] matrix3 = new String[]{"0"};
        Object result3 = solution.solution(matrix3);
        Object expected3 = 0;
        boolean pass3 = TestUtil.isEqual(result3, expected3);
        System.out.println("示例3：" + (pass3 ? "通过" : "失败") + "，输出=" + TestUtil.format(result3) + "，期望=" + TestUtil.format(expected3));

        // 示例4
        String[] matrix4 = new String[]{"1"};
        Object result4 = solution.solution(matrix4);
        Object expected4 = 1;
        boolean pass4 = TestUtil.isEqual(result4, expected4);
        System.out.println("示例4：" + (pass4 ? "通过" : "失败") + "，输出=" + TestUtil.format(result4) + "，期望=" + TestUtil.format(expected4));

        // 示例5
        String[] matrix5 = new String[]{"00"};
        Object result5 = solution.solution(matrix5);
        Object expected5 = 0;
        boolean pass5 = TestUtil.isEqual(result5, expected5);
        System.out.println("示例5：" + (pass5 ? "通过" : "失败") + "，输出=" + TestUtil.format(result5) + "，期望=" + TestUtil.format(expected5));

    }
}
