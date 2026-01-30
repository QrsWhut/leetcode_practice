package com.rsqu.leetcode.lcci.p17_06_number_of_2s_in_range;

import com.rsqu.leetcode.util.TestUtil;

public class Lcci1706NumberOf2sInRange {
    // 题目描述：本目录 README.md。

    public int solution(int n) {
        // TODO：请实现解法
        return 0;
    }

    public static void main(String[] args) {
        Lcci1706NumberOf2sInRange solution = new Lcci1706NumberOf2sInRange();

        // 示例1
        int n1 = 25;
        Object result1 = solution.solution(n1);
        Object expected1 = 9 解释: (2, 12, 20, 21, 22, 23, 24, 25)(注意 22 应该算作两次);
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

    }
}
