package com.rsqu.leetcode.lcci.p03_02_min_stack;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 面试题 03.02 最小栈。
 */
public class Lcci0302MinStack {
    /**
     * 保存真实入栈元素。
     */
    private final Deque<Integer> dataStack = new ArrayDeque<>();

    /**
     * 保存与 dataStack 同步位置下的最小值。
     */
    private final Deque<Integer> minStack = new ArrayDeque<>();

    /**
     * 初始化最小栈。
     */
    public Lcci0302MinStack() {
        minStack.push(Integer.MAX_VALUE);
    }

    /**
     * 将元素压入栈中。
     *
     * @param value 待压入的元素
     */
    public void push(int value) {
        dataStack.push(value);
        minStack.push(Math.min(value, minStack.peek()));
    }

    /**
     * 弹出栈顶元素。
     */
    public void pop() {
        ensureNotEmpty();
        dataStack.pop();
        minStack.pop();
    }

    /**
     * 获取栈顶元素。
     *
     * @return 当前栈顶元素
     */
    public int top() {
        ensureNotEmpty();
        return dataStack.peek();
    }

    /**
     * 获取当前栈中的最小值。
     *
     * @return 当前最小值
     */
    public int getMin() {
        ensureNotEmpty();
        return minStack.peek();
    }

    /**
     * 校验栈中至少包含一个真实元素。
     */
    private void ensureNotEmpty() {
        if (dataStack.isEmpty()) {
            throw new IllegalStateException("栈为空，无法执行当前操作");
        }
    }

    /**
     * README 示例演示入口。
     *
     * @param args 命令行参数
     */
    public static void main(String[] args) {
        Lcci0302MinStack minStack = new Lcci0302MinStack();

        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println("getMin() = " + minStack.getMin() + "，期望 = -3");

        minStack.pop();
        System.out.println("top() = " + minStack.top() + "，期望 = 0");
        System.out.println("getMin() = " + minStack.getMin() + "，期望 = -2");
    }
}
