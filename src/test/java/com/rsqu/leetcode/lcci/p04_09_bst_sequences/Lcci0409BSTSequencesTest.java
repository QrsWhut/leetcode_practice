package com.rsqu.leetcode.lcci.p04_09_bst_sequences;

import com.rsqu.leetcode.util.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class Lcci0409BSTSequencesTest {
    @Test
    public void shouldReturnAllSequencesForSampleTree() {
        TreeNode root = TreeNode.fromArray(new Integer[]{2, 1, 3});
        Lcci0409BSTSequences solution = new Lcci0409BSTSequences();
        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(2, 1, 3),
                Arrays.asList(2, 3, 1)
        );

        List<List<Integer>> result = solution.solution(root);

        Assertions.assertEquals(expected, result);
    }
}
