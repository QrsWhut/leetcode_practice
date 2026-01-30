package com.rsqu.leetcode.lcof.面试题59_i_滑动窗口的最大值;

public class Lcof59I {
    // Problem statement: README.md in this folder.

    public int solution(int[] nums) {
        // TODO: implement
        return 0;
    }

    public static void main(String[] args) {
        Lcof59I solution = new Lcof59I();

        // Example 1:
        // Input: nums = [1,3,-1,-3,5,3,6,7], 和 k = 3
        // Output: [3,3,5,5,6,7] 解释: 滑动窗口的位置                最大值 ---------------               ----- [1  3  -1] -3  5  3  6  7       3 1 [3  -1  -3] 5  3  6  7       3 1  3 [-1  -3  5] 3  6  7       5 1  3  -1 [-3  5  3] 6  7       5 1  3  -1  -3 [5  3  6] 7       6 1  3  -1  -3  5 [3  6  7]      7

        // TODO: replace with the correct input/output types.
        // int[] input = {1, 2, 3};
        // System.out.println(solution.solution(input));
    }
}
