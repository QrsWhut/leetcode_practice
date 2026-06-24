package com.rsqu.leetcode.hot100.p0169_majority_element;

public class Hot1000169MajorityElement {

    public int majorityElement(int[] nums) {
        int candidate = nums[0];
        int count = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        return candidate;
    }


    public static void main(String[] args) {
        Hot1000169MajorityElement solution = new Hot1000169MajorityElement();
    }
}