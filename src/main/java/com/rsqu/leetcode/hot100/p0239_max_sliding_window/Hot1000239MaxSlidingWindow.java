package com.rsqu.leetcode.hot100.p0239_max_sliding_window;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 239. 滑动窗口最大值
 * 给你一个整数数组 nums，有一个大小为 k 的滑动窗口从数组的最左侧移动到数组的最右侧。
 * 你只可以看到在滑动窗口内的 k 个数字。滑动窗口每次只向右移动一位。
 * 返回 滑动窗口中的最大值。
 *
 * <p>思路：单调双端队列（Monotonic Deque）
 * 与 Min Stack 不同，滑动窗口是 FIFO，元素从前面出去，所以不能用同步辅助栈。
 * 改用双端队列存储下标，维护单调递减：
 * - 队尾维护单调递减：新元素来时，弹出队尾所有 ≤ 新元素的值（它们再也没机会成为最大值）
 * - 队头处理过期：当队头下标滑出窗口时，弹出队头
 * - 队头始终是当前窗口最大值
 * </p>
 */
public class Hot1000239MaxSlidingWindow {

    /**
     * 时间复杂度 O(n)，每个元素最多入队出队各一次
     * 空间复杂度 O(k)，队列最多存 k 个元素
     */
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k <= 0) {
            return new int[0];
        }
        int n = nums.length;
        int[] result = new int[n - k + 1];
        // 双端队列，存储下标（不是值），方便判断是否在窗口内
        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            // 1. 队尾维护单调递减：弹出所有 ≤ 当前值的下标
            while (!deque.isEmpty() && nums[deque.peekLast()] <= nums[i]) {
                deque.pollLast();
            }
            deque.offerLast(i);

            // 2. 队头处理过期：如果队头下标已滑出窗口左边界，弹出
            //    窗口左边界 = i - k + 1，队头 < 左边界说明已过期
            if (deque.peekFirst() < i - k + 1) {
                deque.pollFirst();
            }

            // 3. 窗口形成后（i >= k - 1），队头就是当前窗口最大值
            if (i >= k - 1) {
                result[i - k + 1] = nums[deque.peekFirst()];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Hot1000239MaxSlidingWindow solution = new Hot1000239MaxSlidingWindow();

        // 示例 1：nums = [1,3,-1,-3,5,3,6,7], k = 3 → [3,3,5,5,6,7]
        int[] result1 = solution.maxSlidingWindow(new int[]{1, 3, -1, -3, 5, 3, 6, 7}, 3);
        System.out.print("示例1: ");
        for (int v : result1) System.out.print(v + " ");
        System.out.println();

        // 示例 2：nums = [1], k = 1 → [1]
        int[] result2 = solution.maxSlidingWindow(new int[]{1}, 1);
        System.out.print("示例2: ");
        for (int v : result2) System.out.print(v + " ");
        System.out.println();
    }
}