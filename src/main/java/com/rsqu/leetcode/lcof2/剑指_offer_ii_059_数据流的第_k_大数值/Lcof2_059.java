package com.rsqu.leetcode.lcof2.剑指_offer_ii_059_数据流的第_k_大数值;

import com.rsqu.leetcode.util.TestUtil;

public class Lcof2_059 {
    // 题目描述：本目录 README.md。

    public int solution(int val) {
        // TODO：请实现解法
        return 0;
    }

    public static void main(String[] args) {
        Lcof2_059 solution = new Lcof2_059();

        // 示例1
        int val1 = ["KthLargest", "add", "add", "add", "add", "add"] [[3, [4, 5, 8, 2]], [3], [5], [10], [9], [4]];
        Object result1 = solution.solution(val1);
        Object expected1 = [null, 4, 5, 5, 8, 8] 解释: KthLargest kthLargest = new KthLargest(3, [4, 5, 8, 2]); kthLargest.add(3);   // return 4 kthLargest.add(5);   // return 5 kthLargest.add(10);  // return 5 kthLargest.add(9);   // return 8 kthLargest.add(4);   // return 8;
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

    }
}
