package com.rsqu.leetcode.lcof2.剑指_offer_ii_058_日程表;

import com.rsqu.leetcode.util.TestUtil;

public class Lcof2_058 {
    // 题目描述：本目录 README.md。

    public boolean solution(int start, int end) {
        // TODO：请实现解法
        return false;
    }

    public static void main(String[] args) {
        Lcof2_058 solution = new Lcof2_058();

        // 示例1
        int start1 = ["MyCalendar","book","book","book"] [[],[10,20],[15,25],[20,30]];
        // TODO：为 end1 设置输入
        Object result1 = solution.solution(start1, end1);
        Object expected1 = [null,true,false,true] 解释: MyCalendar myCalendar = new MyCalendar(); MyCalendar.book(10, 20); // returns true MyCalendar.book(15, 25); // returns false ，第二个日程安排不能添加到日历中，因为时间 15 已经被第一个日程安排预定了 MyCalendar.book(20, 30); // returns true ，第三个日程安排可以添加到日历中，因为第一个日程安排并不包含时间 20;
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

    }
}
