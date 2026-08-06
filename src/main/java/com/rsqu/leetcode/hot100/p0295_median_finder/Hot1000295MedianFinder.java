package com.rsqu.leetcode.hot100.p0295_median_finder;

import java.util.PriorityQueue;

/**
 * 295. 数据流的中位数
 *
 * 思路：大小顶堆
 * - 大顶堆 maxHeap：存储较小的一半数字，堆顶是较小一半的最大值
 * - 小顶堆 minHeap：存储较大的一半数字，堆顶是较大一半的最小值
 * - 维护 maxHeap.size() >= minHeap.size()，且差值不超过 1
 * - 中位数 = maxHeap 堆顶（总数奇数）或两个堆顶平均值（总数偶数）
 *
 * 时间复杂度：addNum O(log n)，findMedian O(1)
 * 空间复杂度：O(n)
 */
public class Hot1000295MedianFinder {

    // 大顶堆：存储较小的一半
    private final PriorityQueue<Integer> maxHeap;
    // 小顶堆：存储较大的一半
    private final PriorityQueue<Integer> minHeap;

    public Hot1000295MedianFinder() {
        // 大顶堆：从大到小排序，堆顶最大
        maxHeap = new PriorityQueue<>((a, b) -> b - a);
        // 小顶堆：从小到大排序（默认），堆顶最小
        minHeap = new PriorityQueue<>();
    }

    /**
     * 添加数字，维护两个堆的平衡
     */
    public void addNum(int num) {
        // 统一先放入 maxHeap
        maxHeap.offer(num);
        // maxHeap 弹出最大值给 minHeap（保证 maxHeap 里都是较小的一半）
        minHeap.offer(maxHeap.poll());

        // 平衡：确保 maxHeap 大小 >= minHeap 大小
        if (maxHeap.size() < minHeap.size()) {
            maxHeap.offer(minHeap.poll());
        }
    }

    /**
     * 查找中位数
     */
    public double findMedian() {
        if (maxHeap.size() > minHeap.size()) {
            // 总数为奇数，中位数在 maxHeap 堆顶
            return maxHeap.peek();
        } else {
            // 总数为偶数，中位数为两个堆顶的平均值
            return (maxHeap.peek() + minHeap.peek()) / 2.0;
        }
    }

    public static void main(String[] args) {
        Hot1000295MedianFinder mf = new Hot1000295MedianFinder();
        mf.addNum(1);
        mf.addNum(2);
        System.out.println(mf.findMedian()); // 1.5
        mf.addNum(3);
        System.out.println(mf.findMedian()); // 2.0
    }
}