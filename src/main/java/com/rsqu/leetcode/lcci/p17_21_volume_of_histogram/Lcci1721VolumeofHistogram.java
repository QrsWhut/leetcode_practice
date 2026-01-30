package com.rsqu.leetcode.lcci.p17_21_volume_of_histogram;

import com.rsqu.leetcode.util.TestUtil;

public class Lcci1721VolumeofHistogram {
    // 题目描述：本目录 README.md。

    public int solution(int[] height) {
        // TODO：请实现解法
        return 0;
    }

    public static void main(String[] args) {
        Lcci1721VolumeofHistogram solution = new Lcci1721VolumeofHistogram();

        // 示例1
        int[] height1 = new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        Object result1 = solution.solution(height1);
        Object expected1 = 6;
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

    }
}
