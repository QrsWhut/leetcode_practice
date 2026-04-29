package com.rsqu.leetcode.hot100.p0032_longest_valid_parentheses;

import java.util.ArrayDeque;
import java.util.Deque;

public class Hot1000032LongestValidParentheses {

    public int longestValidParentheses(String s) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.push(-1);
        int max = 0;
        char[] charArray = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if (charArray[i]=='(') {
                deque.push(i);
            } else {
                deque.pop();
                if (deque.isEmpty()){
                    deque.push(i);
                } else {
                    max = Math.max(max,i - deque.peek());
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Hot1000032LongestValidParentheses solution = new Hot1000032LongestValidParentheses();
    }
}