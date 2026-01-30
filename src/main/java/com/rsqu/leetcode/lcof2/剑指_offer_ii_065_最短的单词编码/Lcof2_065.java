package com.rsqu.leetcode.lcof2.剑指_offer_ii_065_最短的单词编码;

import com.rsqu.leetcode.util.TestUtil;

public class Lcof2_065 {
    // 题目描述：本目录 README.md。

    public int solution(String[] words) {
        // TODO：请实现解法
        return 0;
    }

    public static void main(String[] args) {
        Lcof2_065 solution = new Lcof2_065();

        // 示例1
        String[] words1 = new String[]{"time", "me", "bell"};
        Object result1 = solution.solution(words1);
        Object expected1 = 10 解释:一组有效编码为 s = "time#bell#" 和 indices = [0, 2, 5] 。 words[0] = "time" ，s 开始于 indices[0] = 0 到下一个 '#' 结束的子字符串，如加粗部分所示 "time#bell#" words[1] = "me" ，s 开始于 indices[1] = 2 到下一个 '#' 结束的子字符串，如加粗部分所示 "time#bell#" words[2] = "bell" ，s 开始于 indices[2] = 5 到下一个 '#' 结束的子字符串，如加粗部分所示 "time#bell#";
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        String[] words2 = new String[]{"t"};
        Object result2 = solution.solution(words2);
        Object expected2 = 2 解释:一组有效编码为 s = "t#" 和 indices = [0] 。;
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

    }
}
