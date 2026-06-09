package com.rsqu.leetcode.hot100.p0128_longest_consecutive;

import java.util.HashSet;
import java.util.Set;

public class Hot1000128LongestConsecutive {

    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int maxLength = 0;
        for (int num : nums) {
            set.add(num);
        }
        for (int num : set) {
            if (set.contains(num - 1)) {
                continue;
            }
            int count = 1;
            while (set.contains(num + 1)) {
                count++;
                num++;
            }
            maxLength = Math.max(maxLength, count);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        Hot1000128LongestConsecutive solution = new Hot1000128LongestConsecutive();
    }
}