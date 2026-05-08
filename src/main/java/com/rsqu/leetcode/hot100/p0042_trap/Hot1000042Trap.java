package com.rsqu.leetcode.hot100.p0042_trap;

public class Hot1000042Trap {

    public int trap(int[] height) {
        int len = height.length;
        if (len <= 2) {
            return 0;
        }
        int[] left = new int[len];
        int[] right = new int[len];
        left[0] = height[0];
        right[len-1] = height[len - 1];
        for (int i = 1; i < len; i++) {
            left[i] = Math.max(height[i],left[i-1]);
        }
        for (int i = len-2; i >= 0; i--) {
            right[i] = Math.max(height[i],right[i+1]);
        }
        int max = 0;
        for (int i = 1; i < len - 1; i++) {
            int deep = Math.min(left[i-1],right[i+1]) - height[i];
            if (deep>0) {
                max += deep;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Hot1000042Trap solution = new Hot1000042Trap();
    }
}