package com.rsqu.leetcode.hot100.p0046_permute;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Hot1000046Permute {

    public List<List<Integer>> permute(int[] nums) {
        ArrayList<Integer> cur = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        Set<Integer> curNum = new HashSet<>();
        dfs(nums,curNum,cur,res);
        return res;
    }

    private void dfs(int[] nums, Set<Integer> curNum,List<Integer> cur,List<List<Integer>> res) {
        if (curNum.size()==nums.length) {
            res.add(new ArrayList<>(cur));
            return;
        }
        for (int num : nums) {
            if (curNum.contains(num)) {
                continue;
            }
            cur.add(num);
            curNum.add(num);
            dfs(nums,curNum,cur,res);
            curNum.remove(num);
            cur.remove(cur.size()-1);
        }
    }

    public static void main(String[] args) {
        Hot1000046Permute solution = new Hot1000046Permute();
    }
}