package com.rsqu.leetcode.lcci.p03_03_stack_of_plates;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * {@link Lcci0303StackofPlates} 的回归测试。
 */
public class Lcci0303StackofPlatesTest {
    /**
     * README 示例 1。
     */
    @Test
    public void shouldMatchReadmeExampleOne() {
        Lcci0303StackofPlates stackOfPlates = new Lcci0303StackofPlates(1);

        stackOfPlates.push(1);
        stackOfPlates.push(2);

        Assertions.assertEquals(2, stackOfPlates.popAt(1));
        Assertions.assertEquals(1, stackOfPlates.pop());
        Assertions.assertEquals(-1, stackOfPlates.pop());
    }

    /**
     * README 示例 2。
     */
    @Test
    public void shouldMatchReadmeExampleTwo() {
        Lcci0303StackofPlates stackOfPlates = new Lcci0303StackofPlates(2);

        stackOfPlates.push(1);
        stackOfPlates.push(2);
        stackOfPlates.push(3);

        Assertions.assertEquals(2, stackOfPlates.popAt(0));
        Assertions.assertEquals(1, stackOfPlates.popAt(0));
        Assertions.assertEquals(3, stackOfPlates.popAt(0));
    }
}
