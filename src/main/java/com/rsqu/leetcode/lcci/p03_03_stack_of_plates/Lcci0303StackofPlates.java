package com.rsqu.leetcode.lcci.p03_03_stack_of_plates;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * 面试题 03.03 堆盘子。
 */
public class Lcci0303StackofPlates {
    /**
     * 每个子栈的最大容量。
     */
    private final int capacity;

    /**
     * 所有子栈的集合。
     */
    private final List<Deque<Integer>> stacks = new ArrayList<>();

    /**
     * 初始化堆盘子结构。
     *
     * @param capacity 单个子栈容量
     */
    public Lcci0303StackofPlates(int capacity) {
        this.capacity = capacity;
    }

    /**
     * 压入一个元素。
     *
     * @param value 待压入元素
     */
    public void push(int value) {
        if (capacity == 0) {
            return;
        }
        if (stacks.isEmpty() || stacks.get(stacks.size() - 1).size() >= capacity) {
            stacks.add(new ArrayDeque<Integer>());
        }
        stacks.get(stacks.size() - 1).push(value);
    }

    /**
     * 弹出最后一个子栈的栈顶元素。
     *
     * @return 弹出的元素；若不存在则返回 -1
     */
    public int pop() {
        return popAt(stacks.size() - 1);
    }

    /**
     * 弹出指定子栈的栈顶元素。
     *
     * @param index 子栈下标
     * @return 弹出的元素；若不存在则返回 -1
     */
    public int popAt(int index) {
        if (index < 0 || index >= stacks.size()) {
            return -1;
        }
        Deque<Integer> stack = stacks.get(index);
        int result = stack.pop();
        if (stack.isEmpty()) {
            stacks.remove(index);
        }
        return result;
    }

    /**
     * README 示例演示入口。
     *
     * @param args 命令行参数
     */
    public static void main(String[] args) {
        Lcci0303StackofPlates exampleOne = new Lcci0303StackofPlates(1);
        exampleOne.push(1);
        exampleOne.push(2);
        System.out.println("示例1 popAt(1) = " + exampleOne.popAt(1) + "，期望 = 2");
        System.out.println("示例1 pop() = " + exampleOne.pop() + "，期望 = 1");
        System.out.println("示例1 pop() = " + exampleOne.pop() + "，期望 = -1");

        Lcci0303StackofPlates exampleTwo = new Lcci0303StackofPlates(2);
        exampleTwo.push(1);
        exampleTwo.push(2);
        exampleTwo.push(3);
        System.out.println("示例2 popAt(0) = " + exampleTwo.popAt(0) + "，期望 = 2");
        System.out.println("示例2 popAt(0) = " + exampleTwo.popAt(0) + "，期望 = 1");
        System.out.println("示例2 popAt(0) = " + exampleTwo.popAt(0) + "，期望 = 3");
    }
}
