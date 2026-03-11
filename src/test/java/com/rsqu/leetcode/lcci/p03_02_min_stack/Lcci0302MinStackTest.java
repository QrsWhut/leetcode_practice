package com.rsqu.leetcode.lcci.p03_02_min_stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * {@link Lcci0302MinStack} 的回归测试。
 */
public class Lcci0302MinStackTest {
    /**
     * README 示例要求最小值能够随入栈和出栈同步变化。
     */
    @Test
    public void shouldTrackMinValueWithPushAndPop() {
        Lcci0302MinStack minStack = new Lcci0302MinStack();

        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);

        Assertions.assertEquals(-3, minStack.getMin());

        minStack.pop();

        Assertions.assertEquals(0, minStack.top());
        Assertions.assertEquals(-2, minStack.getMin());
    }
}
