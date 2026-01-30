package com.rsqu.leetcode.lcof2.剑指_offer_ii_034_外星语言是否排序;

import com.rsqu.leetcode.util.TestUtil;

public class Lcof2_034 {
    // 题目描述：本目录 README.md。

    public boolean solution(String[] words, String order) {
        // TODO：请实现解法
        return false;
    }

    public static void main(String[] args) {
        Lcof2_034 solution = new Lcof2_034();

        // 示例1
        String[] words1 = new String[]{"hello", "leetcode"};
        String order1 = "hlabcdefgijkmnopqrstuvwxyz";
        Object result1 = solution.solution(words1, order1);
        Object expected1 = true 解释:在该语言的字母表中，'h' 位于 'l' 之前，所以单词序列是按字典序排列的。;
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        String[] words2 = new String[]{"word", "world", "row"};
        String order2 = "worldabcefghijkmnpqstuvxyz";
        Object result2 = solution.solution(words2, order2);
        Object expected2 = false 解释:在该语言的字母表中，'d' 位于 'l' 之后，那么 words[0] > words[1]，因此单词序列不是按字典序排列的。;
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

        // 示例3
        String[] words3 = new String[]{"apple", "app"};
        String order3 = "abcdefghijklmnopqrstuvwxyz";
        Object result3 = solution.solution(words3, order3);
        Object expected3 = false 解释:当前三个字符 "app" 匹配时，第二个字符串相对短一些，然后根据词典编纂规则 "apple" > "app"，因为 'l' > '∅'，其中 '∅' 是空白字符，定义为比任何其他字符都小（更多信息）。;
        boolean pass3 = TestUtil.isEqual(result3, expected3);
        System.out.println("示例3：" + (pass3 ? "通过" : "失败") + "，输出=" + TestUtil.format(result3) + "，期望=" + TestUtil.format(expected3));

    }
}
