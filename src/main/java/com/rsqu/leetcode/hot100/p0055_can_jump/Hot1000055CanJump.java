package com.rsqu.leetcode.hot100.p0055_can_jump;

public class Hot1000055CanJump {

    public boolean canJump(int[] nums) {
        int right = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i <= right) {
                right = Math.max(right, i + nums[i]);
            }else {
                return false;
            }
            if (right >= nums.length - 1) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Hot1000055CanJump solution = new Hot1000055CanJump();
    }
}