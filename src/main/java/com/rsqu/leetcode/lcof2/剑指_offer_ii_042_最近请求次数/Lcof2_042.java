package com.rsqu.leetcode.lcof2.剑指_offer_ii_042_最近请求次数;

import com.rsqu.leetcode.util.TestUtil;

public class Lcof2_042 {
    // 题目描述：本目录 README.md。

    public int solution(int t) {
        // TODO：请实现解法
        return 0;
    }

    public static void main(String[] args) {
        Lcof2_042 solution = new Lcof2_042();

        // 示例1
        int t1 = ["RecentCounter", "ping", "ping", "ping", "ping"] inputs = [[], [1], [100], [3001], [3002]];
        Object result1 = solution.solution(t1);
        Object expected1 = [null, 1, 2, 3, 3] 解释: RecentCounter recentCounter = new RecentCounter(); recentCounter.ping(1);     // requests = [1]，范围是 [-2999,1]，返回 1 recentCounter.ping(100);   // requests = [1, 100]，范围是 [-2900,100]，返回 2 recentCounter.ping(3001);  // requests = [1, 100, 3001]，范围是 [1,3001]，返回 3 recentCounter.ping(3002);  // requests = [1, 100, 3001, 3002]，范围是 [2,3002]，返回 3;
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

    }
}
