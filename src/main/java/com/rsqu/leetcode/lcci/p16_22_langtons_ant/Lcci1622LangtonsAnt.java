package com.rsqu.leetcode.lcci.p16_22_langtons_ant;

import java.util.*;
import com.rsqu.leetcode.util.TestUtil;

public class Lcci1622LangtonsAnt {
    // 题目描述：本目录 README.md。

    public List<String> solution(int k) {
        // TODO：请实现解法
        return null;
    }

    public static void main(String[] args) {
        Lcci1622LangtonsAnt solution = new Lcci1622LangtonsAnt();

        // 示例1
        int k1 = 0;
        Object result1 = solution.solution(k1);
        Object expected1 = java.util.Arrays.asList("R");
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        int k2 = 2;
        Object result2 = solution.solution(k2);
        Object expected2 = java.util.Arrays.asList("_X", "LX");
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

        // 示例3
        int k3 = 5;
        Object result3 = solution.solution(k3);
        Object expected3 = java.util.Arrays.asList("_U", "X_", "XX");
        boolean pass3 = TestUtil.isEqual(result3, expected3);
        System.out.println("示例3：" + (pass3 ? "通过" : "失败") + "，输出=" + TestUtil.format(result3) + "，期望=" + TestUtil.format(expected3));

    }
}
