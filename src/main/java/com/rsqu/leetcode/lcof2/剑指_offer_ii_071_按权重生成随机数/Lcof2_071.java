package com.rsqu.leetcode.lcof2.剑指_offer_ii_071_按权重生成随机数;

public class Lcof2_071 {
    // Problem statement: README.md in this folder.

    public int solution(int[] nums) {
        // TODO: implement
        return 0;
    }

    public static void main(String[] args) {
        Lcof2_071 solution = new Lcof2_071();

        // Example 1:
        // Input: inputs = ["Solution","pickIndex"] inputs = [[[1]],[]]
        // Output: [null,0] 解释: Solution solution = new Solution([1]); solution.pickIndex(); // 返回 0，因为数组中只有一个元素，所以唯一的选择是返回下标 0。
        // Example 2:
        // Input: inputs = ["Solution","pickIndex","pickIndex","pickIndex","pickIndex","pickIndex"] inputs = [[[1,3]],[],[],[],[],[]]
        // Output: [null,1,1,1,1,0] 解释: Solution solution = new Solution([1, 3]); solution.pickIndex(); // 返回 1，返回下标 1，返回该下标概率为 3/4 。 solution.pickIndex(); // 返回 1 solution.pickIndex(); // 返回 1 solution.pickIndex(); // 返回 1 solution.pickIndex(); // 返回 0，返回下标 0，返回该下标概率为 1/4 。 由于这是一个随机问题，允许多个答案，因此下列输出都可以被认为是正确的: [null,1,1,1,1,0] [null,1,1,1,1,1] [null,1,1,1,0,0] [null,1,1,1,0,1] [null,1,0,1,0,0] ...... 诸若此类。

        // TODO: replace with the correct input/output types.
        // int[] input = {1, 2, 3};
        // System.out.println(solution.solution(input));
    }
}
