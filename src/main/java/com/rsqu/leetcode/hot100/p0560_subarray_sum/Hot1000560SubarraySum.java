package com.rsqu.leetcode.hot100.p0560_subarray_sum;

import java.util.HashMap;
import java.util.Map;

public class Hot1000560SubarraySum {

    // 前缀和 + 哈希表：sum[i] - sum[j-1] = k → sum[j-1] = sum[i] - k
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> prefixCount = new HashMap<>();
        prefixCount.put(0, 1); // 空前缀和，处理从开头开始的子数组
        int sum = 0;
        int count = 0;
        for (int num : nums) {
            sum += num;
            // 如果之前存在前缀和为 sum - k，则存在以当前元素结尾的子数组和为 k
            count += prefixCount.getOrDefault(sum - k, 0);
            prefixCount.merge(sum, 1, Integer::sum);
        }
        return count;
    }

    public static void main(String[] args) {
        Hot1000560SubarraySum solution = new Hot1000560SubarraySum();
    }
}