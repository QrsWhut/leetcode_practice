package com.rsqu.leetcode.lcof2.剑指_offer_ii_071_按权重生成随机数;

import com.rsqu.leetcode.util.TestUtil;

public class Lcof2_071 {
    // 题目描述：本目录 README.md。

    public int solution() {
        // TODO：请实现解法
        return 0;
    }

    public static void main(String[] args) {
        Lcof2_071 solution = new Lcof2_071();

        // 示例1
        Object result1 = solution.solution();
        Object expected1 = [null,0] 解释: Solution solution = new Solution([1]); solution.pickIndex(); // 返回 0，因为数组中只有一个元素，所以唯一的选择是返回下标 0。;
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        Object result2 = solution.solution();
        Object expected2 = [null,1,1,1,1,0] 解释: Solution solution = new Solution([1, 3]); solution.pickIndex(); // 返回 1，返回下标 1，返回该下标概率为 3/4 。 solution.pickIndex(); // 返回 1 solution.pickIndex(); // 返回 1 solution.pickIndex(); // 返回 1 solution.pickIndex(); // 返回 0，返回下标 0，返回该下标概率为 1/4 。 由于这是一个随机问题，允许多个答案，因此下列输出都可以被认为是正确的: [null,1,1,1,1,0] [null,1,1,1,1,1] [null,1,1,1,0,0] [null,1,1,1,0,1] [null,1,0,1,0,0] ...... 诸若此类。;
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

    }
}
