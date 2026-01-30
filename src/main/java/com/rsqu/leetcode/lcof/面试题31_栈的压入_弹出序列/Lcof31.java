package com.rsqu.leetcode.lcof.面试题31_栈的压入_弹出序列;

import com.rsqu.leetcode.util.TestUtil;

public class Lcof31 {
    // 题目描述：本目录 README.md。

    public boolean solution(int[] pushed, int[] popped) {
        // TODO：请实现解法
        return false;
    }

    public static void main(String[] args) {
        Lcof31 solution = new Lcof31();

        // 示例1
        int[] pushed1 = new int[]{1, 2, 3, 4, 5};
        int[] popped1 = new int[]{4, 5, 3, 2, 1};
        Object result1 = solution.solution(pushed1, popped1);
        Object expected1 = true 解释:我们可以按以下顺序执行: push(1), push(2), push(3), push(4), pop() -> 4, push(5), pop() -> 5, pop() -> 3, pop() -> 2, pop() -> 1;
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        int[] pushed2 = new int[]{1, 2, 3, 4, 5};
        int[] popped2 = new int[]{4, 3, 5, 1, 2};
        Object result2 = solution.solution(pushed2, popped2);
        Object expected2 = false 解释:1 不能在 2 之前弹出。;
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

    }
}
