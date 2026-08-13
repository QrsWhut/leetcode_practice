package com.rsqu.leetcode.hot100.p0739_daily_temperatures;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 739. 每日温度。
 *
 * <p>思路：单调递减栈。维护一个栈内温度从栈底到栈顶严格递减的下标栈，
 * 遍历每一天时，把栈中所有温度低于当前天的下标结算掉——
 * 它们等到的第一个更高温度就是当前天。
 * 每个下标最多入栈、出栈各一次，时间复杂度 O(n)。
 */
public class Hot1000739DailyTemperatures {

    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] answer = new int[n];
        // 单调递减栈，存下标，栈底温度最高
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            // 当前温度比栈顶高，说明栈顶那天等到了第一个更高温度，弹栈结算
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int prev = stack.pop();
                answer[prev] = i - prev;
            }
            stack.push(i);
        }
        // 栈中剩余下标之后没有更高温度，answer 保持默认 0
        return answer;
    }

    public static void main(String[] args) {
        Hot1000739DailyTemperatures solution = new Hot1000739DailyTemperatures();
        int[] result = solution.dailyTemperatures(new int[] {73, 74, 75, 71, 69, 72, 76, 73});
        System.out.println(java.util.Arrays.toString(result)); // [1, 1, 4, 2, 1, 1, 0, 0]
    }
}