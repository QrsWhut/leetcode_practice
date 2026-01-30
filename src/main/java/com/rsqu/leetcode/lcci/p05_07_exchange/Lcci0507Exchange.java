package com.rsqu.leetcode.lcci.p05_07_exchange;

import com.rsqu.leetcode.util.TestUtil;

public class Lcci0507Exchange {
    // 题目描述：本目录 README.md。

    public int solution(int num) {
        // TODO：请实现解法
        return 0;
    }

    public static void main(String[] args) {
        Lcci0507Exchange solution = new Lcci0507Exchange();

        // 示例1
        int num1 = 2（或者0b10） 输出 1 (或者 0b01);
        Object result1 = solution.solution(num1);
        System.out.println("示例1输出：" + TestUtil.format(result1));

        // 示例2
        int num2 = 3;
        Object result2 = solution.solution(num2);
        Object expected2 = 3;
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

    }
}
