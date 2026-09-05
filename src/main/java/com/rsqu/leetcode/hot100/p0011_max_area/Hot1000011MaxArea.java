package com.rsqu.leetcode.hot100.p0011_max_area;

public class Hot1000011MaxArea {

    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int max = 0;
        while (left < right){
            int area = Math.min(height[left],height[right]) * (right - left);
            max = Math.max(max,area);
            if (height[left]<=height[right]){

                left++;
            } else {
                right--;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Hot1000011MaxArea solution = new Hot1000011MaxArea();
    }
}