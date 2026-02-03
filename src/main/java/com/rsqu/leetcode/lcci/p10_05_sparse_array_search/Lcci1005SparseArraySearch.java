package com.rsqu.leetcode.lcci.p10_05_sparse_array_search;

import com.rsqu.leetcode.util.TestUtil;

public class Lcci1005SparseArraySearch {
    // 题目描述：本目录 README.md。

    public int solution(String[] words, String s) {
        // TODO：请实现解法
        return 0;
    }

    public static void main(String[] args) {
        Lcci1005SparseArraySearch solution = new Lcci1005SparseArraySearch();

        // 示例1
        String[] words1 = new String[]{"at", "", "", "", "ball", "", "", "car", "", "", "dad", "", ""};
        String s1 = "ta";
        Object result1 = solution.solution(words1, s1);
        Object expected1 = -1; // 说明: 不存在返回-1。
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        String[] words2 = new String[]{"at", "", "", "", "ball", "", "", "car", "", "", "dad", "", ""};
        String s2 = "ball";
        Object result2 = solution.solution(words2, s2);
        Object expected2 = 4;
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

    }
}
