package com.rsqu.leetcode.hot100.p0131_partition;

import java.util.ArrayList;
import java.util.List;

public class Hot1000131Partition {

    private List<List<String>> result = new ArrayList<>();

    public List<List<String>> partition(String s) {
        if (s == null || s.length() == 0) {
            return result;
        }
        backtrack(s, 0, new ArrayList<>());
        return result;
    }

    private void backtrack(String s, int startIndex, List<String> track) {
        int len = s.length() - startIndex;
        if (len == 0) {
            result.add(new ArrayList<>(track));
            return;
        }
        for (int i = 1; i <= len; i++) {
            String substring = s.substring(startIndex, startIndex + i);
            if (isPalindrome(substring)) {
                track.add(substring);
                backtrack(s, startIndex + i, track);
                track.remove(track.size() - 1);
            }
        }
    }

    private Boolean isPalindrome(String s) {
        int size = s.length();
        for (int i = 0; i < size / 2; i++) {
            if (s.charAt(i) != s.charAt(size - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Hot1000131Partition solution = new Hot1000131Partition();
    }
}