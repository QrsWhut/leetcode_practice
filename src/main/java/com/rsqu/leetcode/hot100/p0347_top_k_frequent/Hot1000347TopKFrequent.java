package com.rsqu.leetcode.hot100.p0347_top_k_frequent;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 347. 前 K 个高频元素 (Top K Frequent Elements)
 *
 * 桶排序解法：O(n) 时间
 * 1. HashMap 统计每个元素的频率
 * 2. 桶排序：bucket[freq] = 频率为 freq 的所有元素列表
 * 3. 从高频到低频取 k 个
 */
public class Hot1000347TopKFrequent {

    public int[] topKFrequent(int[] nums, int k) {
        // 第一步：HashMap 统计频率
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // 第二步：桶排序，bucket[i] = 频率为 i 的元素列表
        List<Integer>[] bucket = new List[nums.length + 1];
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            int freq = entry.getValue();
            if (bucket[freq] == null) {
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(entry.getKey());
        }

        // 第三步：从高频到低频收集 k 个
        int[] ans = new int[k];
        int index = 0;
        for (int i = bucket.length - 1; i >= 0 && index < k; i--) {
            if (bucket[i] != null) {
                for (int num : bucket[i]) {
                    ans[index++] = num;
                    if (index == k) {
                        break;
                    }
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Hot1000347TopKFrequent solution = new Hot1000347TopKFrequent();

        int[] result1 = solution.topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2);
        System.out.println(java.util.Arrays.toString(result1)); // [1, 2]

        int[] result2 = solution.topKFrequent(new int[]{1}, 1);
        System.out.println(java.util.Arrays.toString(result2)); // [1]
    }
}