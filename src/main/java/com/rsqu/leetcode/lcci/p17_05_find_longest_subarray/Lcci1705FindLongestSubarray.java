package com.rsqu.leetcode.lcci.p17_05_find_longest_subarray;

import com.rsqu.leetcode.util.TestUtil;

public class Lcci1705FindLongestSubarray {
    // 题目描述：本目录 README.md。

    public String[] solution(String[] array) {
        // TODO：请实现解法
        return new String[]{};
    }

    public static void main(String[] args) {
        Lcci1705FindLongestSubarray solution = new Lcci1705FindLongestSubarray();

        // 示例1
        String[] array1 = new String[]{"A", "1", "B", "C", "D", "2", "3", "4", "E", "5", "F", "G", "6", "7", "H", "I", "J", "K", "L", "M"};
        Object result1 = solution.solution(array1);
        Object expected1 = new String[]{"A", "1", "B", "C", "D", "2", "3", "4", "E", "5", "F", "G", "6", "7"};
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        String[] array2 = new String[]{"A", "A"};
        Object result2 = solution.solution(array2);
        Object expected2 = new String[]{};
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

    }
}
