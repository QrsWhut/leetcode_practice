package com.rsqu.leetcode.lcof2.剑指_offer_ii_088_爬楼梯的最少成本;

import com.rsqu.leetcode.util.TestUtil;

public class Lcof2_088 {
    // 题目描述：本目录 README.md。

    public int solution(int[] cost) {
        // TODO：请实现解法
        return 0;
    }

    public static void main(String[] args) {
        Lcof2_088 solution = new Lcof2_088();

        // 示例1
        int[] cost1 = new int[]{10, 15, 20};
        Object result1 = solution.solution(cost1);
        Object expected1 = 15; // 解释:最低花费是从 cost[1] 开始，然后走两步即可到阶梯顶，一共花费 15 。
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        int[] cost2 = new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        Object result2 = solution.solution(cost2);
        Object expected2 = 6; // 解释:最低花费方式是从 cost[0] 开始，逐个经过那些 1 ，跳过 cost[3] ，一共花费 6 。
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

    }
}
