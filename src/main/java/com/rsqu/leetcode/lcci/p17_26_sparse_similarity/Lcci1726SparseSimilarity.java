package com.rsqu.leetcode.lcci.p17_26_sparse_similarity;

import java.util.*;
import com.rsqu.leetcode.util.TestUtil;

public class Lcci1726SparseSimilarity {
    // 题目描述：本目录 README.md。

    public List<String> solution(int[][] docs) {
        // TODO：请实现解法
        return null;
    }

    public static void main(String[] args) {
        Lcci1726SparseSimilarity solution = new Lcci1726SparseSimilarity();

        // 示例1
        int[][] docs1 = new int[][]{{14, 15, 100, 9, 3}, {32, 1, 9, 3, 5}, {15, 29, 2, 6, 8, 7}, {7, 10}};
        Object result1 = solution.solution(docs1);
        Object expected1 = java.util.Arrays.asList("0,1: 0.2500", "0,2: 0.1000", "2,3: 0.1429");
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

    }
}
