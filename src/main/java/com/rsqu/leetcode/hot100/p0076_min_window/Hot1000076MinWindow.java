package com.rsqu.leetcode.hot100.p0076_min_window;

import java.util.HashMap;

public class Hot1000076MinWindow {

    public String minWindow(String s, String t) {
        int minLen = Integer.MAX_VALUE;
        HashMap<Character, Integer> tMap = new HashMap<>();
        HashMap<Character, Integer> sMap = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            tMap.put(t.charAt(i), tMap.getOrDefault(t.charAt(i), 0) + 1);
        }
        int size = tMap.size();
        int left = 0, right = 0;
        int count = 0;
        StringBuilder res = new StringBuilder();
        while (right < s.length()) {
            char cur = s.charAt(right);
            sMap.put(cur,sMap.getOrDefault(cur,0)+1);
            if (tMap.containsKey(cur) && sMap.get(cur).equals(tMap.get(cur))) {
                count++;
            }
            while (count == size) {
                if (right-left+1 < minLen) {
                    minLen = right-left+1;
                    res.setLength(0);
                    res.append(s,left,right+1);
                }
                char leftChar = s.charAt(left);
                sMap.put(leftChar,sMap.get(leftChar)-1);
                if (tMap.containsKey(leftChar) && sMap.get(leftChar) < tMap.get(leftChar)) {
                    count--;
                }
                left++;
            }
            right++;
        }
        return res.toString();
    }

    public static void main(String[] args) {
        Hot1000076MinWindow solution = new Hot1000076MinWindow();
    }
}