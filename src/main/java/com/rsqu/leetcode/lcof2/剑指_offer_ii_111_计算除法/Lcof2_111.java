package com.rsqu.leetcode.lcof2.剑指_offer_ii_111_计算除法;

import java.util.*;
import com.rsqu.leetcode.util.TestUtil;

public class Lcof2_111 {
    // 题目描述：本目录 README.md。

    public double[] solution(List<List<String>> equations, double[] values, List<List<String>> queries) {
        // TODO：请实现解法
        return new double[]{};
    }

    public static void main(String[] args) {
        Lcof2_111 solution = new Lcof2_111();

        // 示例1
        List<List<String>> equations1 = java.util.Arrays.asList(java.util.Arrays.asList("a", "b"), java.util.Arrays.asList("b", "c"));
        double[] values1 = new double[]{2.0, 3.0};
        List<List<String>> queries1 = java.util.Arrays.asList(java.util.Arrays.asList("a", "c"), java.util.Arrays.asList("b", "a"), java.util.Arrays.asList("a", "e"), java.util.Arrays.asList("a", "a"), java.util.Arrays.asList("x", "x"));
        Object result1 = solution.solution(equations1, values1, queries1);
        Object expected1 = new double[]{6.00000, 0.50000, -1.00000, 1.00000, -1.00000] 解释: 条件:a / b = 2.0, b / c = 3.0 问题:a / c = ?, b / a = ?, a / e = ?, a / a = ?, x / x = ? 结果:[6.0, 0.5, -1.0, 1.0, -1.0};
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        List<List<String>> equations2 = java.util.Arrays.asList(java.util.Arrays.asList("a", "b"), java.util.Arrays.asList("b", "c"), java.util.Arrays.asList("bc", "cd"));
        double[] values2 = new double[]{1.5, 2.5, 5.0};
        List<List<String>> queries2 = java.util.Arrays.asList(java.util.Arrays.asList("a", "c"), java.util.Arrays.asList("c", "b"), java.util.Arrays.asList("bc", "cd"), java.util.Arrays.asList("cd", "bc"));
        Object result2 = solution.solution(equations2, values2, queries2);
        Object expected2 = new double[]{3.75000, 0.40000, 5.00000, 0.20000};
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

        // 示例3
        List<List<String>> equations3 = java.util.Arrays.asList(java.util.Arrays.asList("a", "b"));
        double[] values3 = new double[]{0.5};
        List<List<String>> queries3 = java.util.Arrays.asList(java.util.Arrays.asList("a", "b"), java.util.Arrays.asList("b", "a"), java.util.Arrays.asList("a", "c"), java.util.Arrays.asList("x", "y"));
        Object result3 = solution.solution(equations3, values3, queries3);
        Object expected3 = new double[]{0.50000, 2.00000, -1.00000, -1.00000};
        boolean pass3 = TestUtil.isEqual(result3, expected3);
        System.out.println("示例3：" + (pass3 ? "通过" : "失败") + "，输出=" + TestUtil.format(result3) + "，期望=" + TestUtil.format(expected3));

    }
}
