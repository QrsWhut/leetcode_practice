package com.rsqu.leetcode.lcof2.剑指_offer_ii_103_最少的硬币数目;

import com.rsqu.leetcode.util.TestUtil;

public class Lcof2_103 {
    // 题目描述：本目录 README.md。

    public int solution(int[] coins, int amount) {
        // TODO：请实现解法
        return 0;
    }

    public static void main(String[] args) {
        Lcof2_103 solution = new Lcof2_103();

        // 示例1
        int[] coins1 = new int[]{1, 2, 5};
        int amount1 = 11;
        Object result1 = solution.solution(coins1, amount1);
        Object expected1 = 3 解释:11 = 5 + 5 + 1;
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        int[] coins2 = new int[]{2};
        int amount2 = 3;
        Object result2 = solution.solution(coins2, amount2);
        Object expected2 = -1;
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

        // 示例3
        int[] coins3 = new int[]{1};
        int amount3 = 0;
        Object result3 = solution.solution(coins3, amount3);
        Object expected3 = 0;
        boolean pass3 = TestUtil.isEqual(result3, expected3);
        System.out.println("示例3：" + (pass3 ? "通过" : "失败") + "，输出=" + TestUtil.format(result3) + "，期望=" + TestUtil.format(expected3));

        // 示例4
        int[] coins4 = new int[]{1};
        int amount4 = 1;
        Object result4 = solution.solution(coins4, amount4);
        Object expected4 = 1;
        boolean pass4 = TestUtil.isEqual(result4, expected4);
        System.out.println("示例4：" + (pass4 ? "通过" : "失败") + "，输出=" + TestUtil.format(result4) + "，期望=" + TestUtil.format(expected4));

        // 示例5
        int[] coins5 = new int[]{1};
        int amount5 = 2;
        Object result5 = solution.solution(coins5, amount5);
        Object expected5 = 2;
        boolean pass5 = TestUtil.isEqual(result5, expected5);
        System.out.println("示例5：" + (pass5 ? "通过" : "失败") + "，输出=" + TestUtil.format(result5) + "，期望=" + TestUtil.format(expected5));

    }
}
