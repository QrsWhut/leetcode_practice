package com.rsqu.leetcode.hot100.p0049_group_anagrams;

import org.apache.commons.lang3.StringUtils;

import java.util.*;

public class Hot1000049GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0) {
            return new ArrayList<>();
        }
        HashMap<String,List<String>> map = new HashMap<>();
        for (String str : strs) {
            int[] nums = new int[26];
            for (char c : str.toCharArray()) {
                nums[c-'a'] += 1;
            }
            String key = Arrays.toString(nums);
            map.computeIfAbsent(key,value -> new ArrayList<>()).add(str);
        }
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        Hot1000049GroupAnagrams solution = new Hot1000049GroupAnagrams();
    }
}