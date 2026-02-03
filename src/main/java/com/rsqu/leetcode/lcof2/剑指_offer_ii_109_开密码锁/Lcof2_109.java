package com.rsqu.leetcode.lcof2.剑指_offer_ii_109_开密码锁;

import com.rsqu.leetcode.util.TestUtil;

public class Lcof2_109 {
    // 题目描述：本目录 README.md。

    public int solution(String[] deadends, String target) {
        // TODO：请实现解法
        return 0;
    }

    public static void main(String[] args) {
        Lcof2_109 solution = new Lcof2_109();

        // 示例1
        String[] deadends1 = new String[]{"0201", "0101", "0102", "1212", "2002"};
        String target1 = "0202";
        Object result1 = solution.solution(deadends1, target1);
        Object expected1 = 6; // 解释: 可能的移动序列为 "0000" -> "1000" -> "1100" -> "1200" -> "1201" -> "1202" -> "0202"。 注意 "0000" -> "0001" -> "0002" -> "0102" -> "0202" 这样的序列是不能解锁的，因为当拨动到 "0102" 时这个锁就会被锁定。
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        String[] deadends2 = new String[]{"8888"};
        String target2 = "0009";
        Object result2 = solution.solution(deadends2, target2);
        Object expected2 = 1; // 解释: 把最后一位反向旋转一次即可 "0000" -> "0009"。
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

        // 示例3
        String[] deadends3 = new String[]{"8887", "8889", "8878", "8898", "8788", "8988", "7888", "9888"};
        String target3 = "8888";
        Object result3 = solution.solution(deadends3, target3);
        Object expected3 = -1; // 解释: 无法旋转到目标数字且不被锁定。
        boolean pass3 = TestUtil.isEqual(result3, expected3);
        System.out.println("示例3：" + (pass3 ? "通过" : "失败") + "，输出=" + TestUtil.format(result3) + "，期望=" + TestUtil.format(expected3));

        // 示例4
        String[] deadends4 = new String[]{"0000"};
        String target4 = "8888";
        Object result4 = solution.solution(deadends4, target4);
        Object expected4 = -1;
        boolean pass4 = TestUtil.isEqual(result4, expected4);
        System.out.println("示例4：" + (pass4 ? "通过" : "失败") + "，输出=" + TestUtil.format(result4) + "，期望=" + TestUtil.format(expected4));

    }
}
