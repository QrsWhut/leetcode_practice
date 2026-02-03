package com.rsqu.leetcode.lcci.p08_03_magic_index;

import com.rsqu.leetcode.util.TestUtil;

public class Lcci0803MagicIndex {
    // 题目描述：本目录 README.md。

    public int solution(int[] nums) {
        // TODO：请实现解法
        return 0;
    }

    public static void main(String[] args) {
        Lcci0803MagicIndex solution = new Lcci0803MagicIndex();

        // 示例1
        int[] nums1 = new int[]{0, 2, 3, 4, 5};
        Object result1 = solution.solution(nums1);
        Object expected1 = 0; // 说明: 0下标的元素为0
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        int[] nums2 = new int[]{1, 1, 1};
        Object result2 = solution.solution(nums2);
        Object expected2 = 1;
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

    }
}
