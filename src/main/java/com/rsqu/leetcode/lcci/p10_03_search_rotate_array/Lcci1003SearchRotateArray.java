package com.rsqu.leetcode.lcci.p10_03_search_rotate_array;

import com.rsqu.leetcode.util.TestUtil;

public class Lcci1003SearchRotateArray {
    // 题目描述：本目录 README.md。

    public int solution(int[] arr, int target) {
        // TODO：请实现解法
        return 0;
    }

    public static void main(String[] args) {
        Lcci1003SearchRotateArray solution = new Lcci1003SearchRotateArray();

        // 示例1
        int[] arr1 = new int[]{15, 16, 19, 20, 25, 1, 3, 4, 5, 7, 10, 14};
        int target1 = 5;
        Object result1 = solution.solution(arr1, target1);
        Object expected1 = 8（元素5在该数组中的索引）;
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        int[] arr2 = new int[]{15, 16, 19, 20, 25, 1, 3, 4, 5, 7, 10, 14};
        int target2 = 11;
        Object result2 = solution.solution(arr2, target2);
        Object expected2 = -1 （没有找到）;
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

    }
}
