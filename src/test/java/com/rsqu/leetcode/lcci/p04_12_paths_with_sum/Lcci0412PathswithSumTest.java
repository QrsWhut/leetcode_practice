package com.rsqu.leetcode.lcci.p04_12_paths_with_sum;

import com.rsqu.leetcode.util.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Lcci0412PathswithSumTest {
    @Test
    public void shouldCountPathsThatStartFromAnyNode() {
        TreeNode root = TreeNode.fromArray(
                new Integer[]{5, 4, 8, 11, null, 13, 4, 7, 2, null, null, 5, 1});
        Lcci0412PathswithSum solution = new Lcci0412PathswithSum();

        int result = solution.solution(root, 22);

        Assertions.assertEquals(3, result);
    }
}
