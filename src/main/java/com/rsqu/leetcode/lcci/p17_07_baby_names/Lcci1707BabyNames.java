package com.rsqu.leetcode.lcci.p17_07_baby_names;

import com.rsqu.leetcode.util.TestUtil;

public class Lcci1707BabyNames {
    // 题目描述：本目录 README.md。

    public String[] solution(String[] names, String[] synonyms) {
        // TODO：请实现解法
        return new String[]{};
    }

    public static void main(String[] args) {
        Lcci1707BabyNames solution = new Lcci1707BabyNames();

        // 示例1
        String[] names1 = new String[]{"John(15)", "Jon(12)", "Chris(13)", "Kris(4)", "Christopher(19)"};
        String[] synonyms1 = new String[]{"(Jon,John)", "(John,Johnny)", "(Chris,Kris)", "(Chris,Christopher)"};
        Object result1 = solution.solution(names1, synonyms1);
        Object expected1 = new String[]{"John(27)", "Chris(36)"};
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

    }
}
