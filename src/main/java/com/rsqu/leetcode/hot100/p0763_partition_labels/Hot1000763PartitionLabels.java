package com.rsqu.leetcode.hot100.p0763_partition_labels;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Hot1000763PartitionLabels {

    public List<Integer> partitionLabels(String s) {
        HashMap<Character, Integer> lastIndex = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            lastIndex.put(s.charAt(i), i);
        }
        int start = 0;
        int end = 0;
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            end = Math.max(end, lastIndex.get(s.charAt(i)));
            if (i == end) {
                result.add(end - start + 1);
                start = end + 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Hot1000763PartitionLabels solution = new Hot1000763PartitionLabels();
    }
}