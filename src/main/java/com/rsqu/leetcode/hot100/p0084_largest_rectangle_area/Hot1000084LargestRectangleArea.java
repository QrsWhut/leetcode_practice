package com.rsqu.leetcode.hot100.p0084_largest_rectangle_area;

import java.util.ArrayDeque;
import java.util.Deque;

public class Hot1000084LargestRectangleArea {

    public int largestRectangleArea(int[] heights) {
        Deque<Integer> increasingIndexStack = new ArrayDeque<>();
        int maxArea = 0;
        for (int currentIndex = 0; currentIndex <= heights.length; currentIndex++) {
            int currentHeight = currentIndex == heights.length ? 0 : heights[currentIndex];
            while (!increasingIndexStack.isEmpty() && heights[increasingIndexStack.peek()] > currentHeight) {
                int heightIndex = increasingIndexStack.pop();
                int leftLowerIndex = increasingIndexStack.isEmpty() ? -1 : increasingIndexStack.peek();
                int width = currentIndex - leftLowerIndex - 1;
                maxArea = Math.max(maxArea, heights[heightIndex] * width);
            }
            if (currentIndex < heights.length) {
                increasingIndexStack.push(currentIndex);
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        Hot1000084LargestRectangleArea solution = new Hot1000084LargestRectangleArea();
    }
}
