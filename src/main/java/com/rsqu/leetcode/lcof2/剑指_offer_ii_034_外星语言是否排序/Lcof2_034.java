package com.rsqu.leetcode.lcof2.剑指_offer_ii_034_外星语言是否排序;

public class Lcof2_034 {
    // Problem statement: README.md in this folder.

    public int solution(int[] nums) {
        // TODO: implement
        return 0;
    }

    public static void main(String[] args) {
        Lcof2_034 solution = new Lcof2_034();

        // Example 1:
        // Input: words = ["hello","leetcode"], order = "hlabcdefgijkmnopqrstuvwxyz"
        // Output: true 解释:在该语言的字母表中，'h' 位于 'l' 之前，所以单词序列是按字典序排列的。
        // Example 2:
        // Input: words = ["word","world","row"], order = "worldabcefghijkmnpqstuvxyz"
        // Output: false 解释:在该语言的字母表中，'d' 位于 'l' 之后，那么 words[0] > words[1]，因此单词序列不是按字典序排列的。
        // Example 3:
        // Input: words = ["apple","app"], order = "abcdefghijklmnopqrstuvwxyz"
        // Output: false 解释:当前三个字符 "app" 匹配时，第二个字符串相对短一些，然后根据词典编纂规则 "apple" > "app"，因为 'l' > '∅'，其中 '∅' 是空白字符，定义为比任何其他字符都小（更多信息）。

        // TODO: replace with the correct input/output types.
        // int[] input = {1, 2, 3};
        // System.out.println(solution.solution(input));
    }
}
