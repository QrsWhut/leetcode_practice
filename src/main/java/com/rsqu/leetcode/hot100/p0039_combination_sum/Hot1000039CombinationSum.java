package com.rsqu.leetcode.hot100.p0039_combination_sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Hot1000039CombinationSum {

    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        if (target<=1){
            return new ArrayList<>();
        }
        Arrays.sort(candidates);
        ArrayList<Integer> list = new ArrayList<>();
        dfs(candidates,0,target,list);
        return res;
    }

    public void dfs(int[] candidates,int startIndex,int remain,List<Integer> list) {
        if (remain==0){
            res.add(new ArrayList<>(list));
            return;
        }
        for (int i = startIndex; i < candidates.length && candidates[i] <= remain; i++) {
            list.add(candidates[i]);
            dfs(candidates,i,remain-candidates[i],list);
            list.remove(list.size()-1);
        }
    }

    public static void main(String[] args) {
        Hot1000039CombinationSum solution = new Hot1000039CombinationSum();
    }
}