package com.rsqu.leetcode.lcof2.剑指_offer_ii_092_翻转字符;

import com.rsqu.leetcode.util.TestUtil;

public class Lcof2_092 {
    // 题目描述：本目录 README.md。

    public int solution(String s) {
        // TODO：请实现解法
        return 0;
    }

    public static void main(String[] args) {
        Lcof2_092 solution = new Lcof2_092();

        // 示例1
        String s1 = "00110";
        Object result1 = solution.solution(s1);
        Object expected1 = 1 解释:我们翻转最后一位得到 00111.;
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        String s2 = "010110";
        Object result2 = solution.solution(s2);
        // 期望输出可能包含多个结果：2 解释:我们翻转得到 011111，或者是 000111。
        System.out.println("示例2输出：" + TestUtil.format(result2));

        // 示例3
        String s3 = "00011000";
        Object result3 = solution.solution(s3);
        Object expected3 = 2 解释:我们翻转得到 00000000。;
        boolean pass3 = TestUtil.isEqual(result3, expected3);
        System.out.println("示例3：" + (pass3 ? "通过" : "失败") + "，输出=" + TestUtil.format(result3) + "，期望=" + TestUtil.format(expected3));

    }
}
