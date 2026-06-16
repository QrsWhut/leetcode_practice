package com.rsqu.leetcode.hot100.p0139_word_break;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Hot1000139WordBreak {

    public boolean wordBreak(String s, List<String> wordDict) {
        Map<Character, List<String>> map = new HashMap<>();
        for (String word : wordDict) {
            map.computeIfAbsent(word.charAt(0), k -> new ArrayList<>()).add(word);
        }
        Boolean[] memo = new Boolean[s.length()];
        return wordBreak(s, 0, map, memo);
    }

    private boolean wordBreak(String s, int index, Map<Character, List<String>> map, Boolean[] memo) {
        if (index == s.length()) {
            return true;
        }
        if (memo[index] != null) {
            return memo[index];
        }
        char currentChar = s.charAt(index);
        List<String> words = map.get(currentChar);
        if (words == null) {
            memo[index] = false;
            return false;
        }
        for (String word : words) {
            if (s.startsWith(word, index) && wordBreak(s, index + word.length(), map, memo)) {
                memo[index] = true;
                return true;
            }
        }
        memo[index] = false;
        return false;
    }

    public static void main(String[] args) {
        Hot1000139WordBreak solution = new Hot1000139WordBreak();
    }
}
