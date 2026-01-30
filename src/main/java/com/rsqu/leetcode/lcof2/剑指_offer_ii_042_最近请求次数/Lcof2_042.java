package com.rsqu.leetcode.lcof2.剑指_offer_ii_042_最近请求次数;

public class Lcof2_042 {
    // Problem statement: README.md in this folder.

    public int solution(int[] nums) {
        // TODO: implement
        return 0;
    }

    public static void main(String[] args) {
        Lcof2_042 solution = new Lcof2_042();

        // Example 1:
        // Input: inputs = ["RecentCounter", "ping", "ping", "ping", "ping"] inputs = [[], [1], [100], [3001], [3002]]
        // Output: [null, 1, 2, 3, 3] 解释: RecentCounter recentCounter = new RecentCounter(); recentCounter.ping(1);     // requests = [1]，范围是 [-2999,1]，返回 1 recentCounter.ping(100);   // requests = [1, 100]，范围是 [-2900,100]，返回 2 recentCounter.ping(3001);  // requests = [1, 100, 3001]，范围是 [1,3001]，返回 3 recentCounter.ping(3002);  // requests = [1, 100, 3001, 3002]，范围是 [2,3002]，返回 3

        // TODO: replace with the correct input/output types.
        // int[] input = {1, 2, 3};
        // System.out.println(solution.solution(input));
    }
}
