package com.rsqu.leetcode.lcof2.剑指_offer_ii_037_小行星碰撞;

import com.rsqu.leetcode.util.TestUtil;

public class Lcof2_037 {
    // 题目描述：本目录 README.md。

    public int[] solution(int[] asteroids) {
        // TODO：请实现解法
        return new int[]{};
    }

    public static void main(String[] args) {
        Lcof2_037 solution = new Lcof2_037();

        // 示例1
        int[] asteroids1 = new int[]{5, 10, -5};
        Object result1 = solution.solution(asteroids1);
        Object expected1 = java.util.Arrays.asList(5,10); // 解释:10 和 -5 碰撞后只剩下 10 。 5 和 10 永远不会发生碰撞。
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        int[] asteroids2 = new int[]{8, -8};
        Object result2 = solution.solution(asteroids2);
        Object expected2 = java.util.Arrays.asList(); // 解释:8 和 -8 碰撞后，两者都发生爆炸。
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

        // 示例3
        int[] asteroids3 = new int[]{10, 2, -5};
        Object result3 = solution.solution(asteroids3);
        Object expected3 = java.util.Arrays.asList(10); // 解释:2 和 -5 发生碰撞后剩下 -5 。10 和 -5 发生碰撞后剩下 10 。
        boolean pass3 = TestUtil.isEqual(result3, expected3);
        System.out.println("示例3：" + (pass3 ? "通过" : "失败") + "，输出=" + TestUtil.format(result3) + "，期望=" + TestUtil.format(expected3));

        // 示例4
        int[] asteroids4 = new int[]{-2, -1, 1, 2};
        Object result4 = solution.solution(asteroids4);
        Object expected4 = java.util.Arrays.asList(-2,-1,1,2); // 解释:-2 和 -1 向左移动，而 1 和 2 向右移动。 由于移动方向相同的行星不会发生碰撞，所以最终没有行星发生碰撞。
        boolean pass4 = TestUtil.isEqual(result4, expected4);
        System.out.println("示例4：" + (pass4 ? "通过" : "失败") + "，输出=" + TestUtil.format(result4) + "，期望=" + TestUtil.format(expected4));

    }
}
