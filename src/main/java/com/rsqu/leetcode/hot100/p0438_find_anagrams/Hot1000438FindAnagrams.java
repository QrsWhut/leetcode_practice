package com.rsqu.leetcode.hot100.p0438_find_anagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Hot1000438FindAnagrams {

    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        // 如果 s 比 p 短，不可能存在异位词
        if (s.length() < p.length()) {
            return result;
        }
        int[] sCount = new int[26];
        int[] pCount = new int[26];
        for (int i = 0; i < p.length(); i++) {
            pCount[p.charAt(i) - 'a']++;
        }
        for (int i = 0; i < p.length(); i++) {
            sCount[s.charAt(i) - 'a']++;
        }
        if (Arrays.equals(sCount, pCount)) {
            result.add(0);
        }
        for (int i = p.length(); i < s.length(); i++) {
            sCount[s.charAt(i) - 'a']++;
            sCount[s.charAt(i - p.length()) - 'a']--;
            if (Arrays.equals(sCount, pCount)) {
                result.add(i - p.length() + 1);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Hot1000438FindAnagrams solution = new Hot1000438FindAnagrams();
    }
}