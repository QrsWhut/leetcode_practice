package com.rsqu.leetcode.lcci.p16_10_living_people;

import com.rsqu.leetcode.util.TestUtil;

public class Lcci1610LivingPeople {
    // 题目描述：本目录 README.md。

    public int solution(int[] birth, int[] death) {
        // TODO：请实现解法
        return 0;
    }

    public static void main(String[] args) {
        Lcci1610LivingPeople solution = new Lcci1610LivingPeople();

        // 示例1
        int[] birth1 = new int[]{1900, 1901, 1950};
        int[] death1 = new int[]{1948, 1951, 2000};
        Object result1 = solution.solution(birth1, death1);
        Object expected1 = 1901;
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

    }
}
