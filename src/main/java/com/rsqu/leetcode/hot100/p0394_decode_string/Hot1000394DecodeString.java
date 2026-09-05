package com.rsqu.leetcode.hot100.p0394_decode_string;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 394. 字符串解码 (Decode String)
 *
 * 栈解法：
 * - 数字可能多位数，遇到数字要累积读取
 * - 遇到 '[' 把当前数字和 StringBuilder 压栈
 * - 遇到 ']' 从栈弹出，重复拼接后还给外层
 * - 普通字母追加到当前 StringBuilder
 */
public class Hot1000394DecodeString {

    public String decodeString(String s) {
        Deque<Integer> numStack = new ArrayDeque<>();
        Deque<StringBuilder> strStack = new ArrayDeque<>();
        StringBuilder cur = new StringBuilder();
        int num = 0;
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                num = num * 10 + c - '0';
            } else if (c == '[') {
                numStack.push(num);
                strStack.push(cur);
                cur = new StringBuilder();
                num = 0;
            } else if (c == ']') {
                StringBuilder prev = strStack.pop();
                int times = numStack.pop();
                for (int i = 0; i < times; i++) {
                    prev.append(cur);
                }
                cur = prev;
            } else {
                cur.append(c);
            }
        }

        return null;
    }

    public static void main(String[] args) {
        Hot1000394DecodeString solution = new Hot1000394DecodeString();

        System.out.println(solution.decodeString("3[a]2[bc]"));      // aaabcbc
        System.out.println(solution.decodeString("3[a2[c]]"));       // accaccacc
        System.out.println(solution.decodeString("2[abc]3[cd]ef"));  // abcabccdcdcdef
    }
}