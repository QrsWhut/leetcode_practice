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
        int row11 = ["NumMatrix","sumRegion","sumRegion","sumRegion"] [[[[3,0,1,4,2],[5,6,3,2,1],[1,2,0,1,5],[4,1,0,1,7],[1,0,3,0,5]]],[2,1,4,3],[1,1,2,2],[1,2,2,4]];
        // TODO：为 col11 设置输入
        // TODO：为 row21 设置输入
        // TODO：为 col21 设置输入
        Object result1 = solution.solution(row11, col11, row21, col21);
        Object expected1 = [null, 8, 11, 12] 解释: NumMatrix numMatrix = new NumMatrix([[3,0,1,4,2],[5,6,3,2,1],[1,2,0,1,5],[4,1,0,1,7],[1,0,3,0,5]]]); numMatrix.sumRegion(2, 1, 4, 3); // return 8 (红色矩形框的元素总和) numMatrix.sumRegion(1, 1, 2, 2); // return 11 (绿色矩形框的元素总和) numMatrix.sumRegion(1, 2, 2, 4); // return 12 (蓝色矩形框的元素总和);
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

    }
}
