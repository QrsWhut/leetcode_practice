package com.rsqu.leetcode.hot100.p0078_subsets;

import java.util.ArrayList;
import java.util.List;

public class Hot1000078Subsets {

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        backtrack(nums, 0, res, temp);
        return res;
    }

    private void backtrack(int[] nums, int start, List<List<Integer>> res, List<Integer> temp) {
        if (start == nums.length) {
            res.add(new ArrayList<>(temp));
            return;
        }
        temp.add(nums[start]);
        backtrack(nums, start + 1, res, temp);
        temp.remove(temp.size() - 1);
        backtrack(nums, start + 1, res, temp);
    }

    public static void main(String[] args) {
        Hot1000078Subsets solution = new Hot1000078Subsets();
    }
}