package com.rsqu.leetcode.hot100.p0020_is_valid;

import java.util.ArrayDeque;
import java.util.Deque;

public class Hot1000020IsValid {

    public boolean isValid(String s) {
        Deque<Character> deque = new ArrayDeque<>();
        for (char c : s.toCharArray()){
            if (c == '(' || c == '{' || c == '[') {
                deque.addLast(c);
            }
            if (c == ')') {
                if (deque.isEmpty() || deque.peekLast() !='('){
                    return false;
                }
                deque.removeLast();
            } else if (c == '}') {
                if (deque.isEmpty() || deque.peekLast() !='{'){
                    return false;
                }
                deque.removeLast();
            } else if (c == ']') {
                if (deque.isEmpty() || deque.peekLast() !='['){
                    return false;
                }
                deque.removeLast();
            }
        }
        return deque.isEmpty();
    }

    public static void main(String[] args) {
        Hot1000020IsValid solution = new Hot1000020IsValid();
    }
}