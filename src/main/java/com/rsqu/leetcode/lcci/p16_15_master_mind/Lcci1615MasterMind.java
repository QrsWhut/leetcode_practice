package com.rsqu.leetcode.lcci.p16_15_master_mind;

import com.rsqu.leetcode.util.TestUtil;

public class Lcci1615MasterMind {
    // 题目描述：本目录 README.md。

    public int[] solution(String solution, String guess) {
        // TODO：请实现解法
        return new int[]{};
    }

    public static void main(String[] args) {
        Lcci1615MasterMind solution = new Lcci1615MasterMind();

        // 示例1
        String solution1 = "RGBY";
        String guess1 = "GGRR";
        Object result1 = solution.solution(solution1, guess1);
        Object expected1 = java.util.Arrays.asList(1,1); // 解释: 猜中1次，伪猜中1次。
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

    }
}
