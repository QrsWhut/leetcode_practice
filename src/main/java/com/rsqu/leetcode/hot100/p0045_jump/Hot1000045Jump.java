package com.rsqu.leetcode.hot100.p0045_jump;

import java.util.Arrays;

public class Hot1000045Jump {

    public int jump(int[] nums) {
        int[] memo = new int[nums.length];
        Arrays.fill(memo, Integer.MAX_VALUE);

        return trace(nums,memo,0);
    }

    private int trace(int[] nums,int[] memo,int index){
        if (nums.length - 1 == index) {
            return 0;
        }
        int min = Integer.MAX_VALUE;
        for (int i = index + 1; i <= Math.min(nums.length - 1, index + nums[index]) ; i++) {
            if (memo[i] != Integer.MAX_VALUE){
                min = Math.min(min,memo[i]+1);
                continue;
            }
            min = Math.min(min,trace(nums,memo,i)+1);
        }
        memo[index] = min;
        return min;
    }

    public static void main(String[] args) {
        Hot1000045Jump solution = new Hot1000045Jump();
    }
}