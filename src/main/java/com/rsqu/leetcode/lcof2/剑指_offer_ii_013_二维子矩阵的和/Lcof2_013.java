package com.rsqu.leetcode.lcof2.剑指_offer_ii_013_二维子矩阵的和;

import com.rsqu.leetcode.util.TestUtil;

public class Lcof2_013 {
    // 题目描述：本目录 README.md。

    public int solution(int row1, int col1, int row2, int col2) {
        // TODO：请实现解法
        return 0;
    }

    public static void main(String[] args) {
        Lcof2_013 solution = new Lcof2_013();

        // 示例1
        int row11 = 2;
        int col11 = 1;
        int row21 = 4;
        int col21 = 3;
        Object result1 = solution.solution(row11, col11, row21, col21);
        Object expected1 = 8; // 解释: 示例中查询 (2,1) 到 (4,3) 的区域和为 8
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

    }
}
