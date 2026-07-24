package com.rsqu.leetcode.hot100.p0287_find_duplicate;

public class Hot1000287FindDuplicate {

    public static void main(String[] args) {
        Hot1000287FindDuplicate solution = new Hot1000287FindDuplicate();
    }

    public int findDuplicate(int[] nums) {
        int n = nums.length - 1;
        int ans = 0;
        // n ≤ 10^5，最多 17 位就够，写 32 也行
        for (int bit = 0; bit < 32; bit++) {
            int mask = 1 << bit;
            int cntNums = 0, cntRange = 0;
            for (int i = 0; i <= n; i++) {
                if ((nums[i] & mask) != 0) cntNums++;
                if (i > 0 && (i & mask) != 0) cntRange++;
            }
            if (cntNums > cntRange) {
                ans |= mask;
            }
        }
        return ans;
    }

}