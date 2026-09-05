package com.rsqu.leetcode.lcci.p04_02_minimum_height_tree;

import com.rsqu.leetcode.util.TreeNode;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Lcci0402MinimumHeightTreeTest {
    @Test
    public void shouldAcceptAnotherValidMinimumHeightTree() throws Exception {
        int[] nums = new int[]{-10, -3, 0, 5, 9};
        TreeNode root = TreeNode.fromArray(new Integer[]{0, -10, 5, null, -3, null, 9});

        boolean result = invokeIsValidMinimumHeightBst(nums, root);

        Assertions.assertTrue(result);
    }

    @Test
    public void shouldAcceptCurrentSolutionOutput() throws Exception {
        int[] nums = new int[]{-10, -3, 0, 5, 9};
        Lcci0402MinimumHeightTree solution = new Lcci0402MinimumHeightTree();

        boolean result = invokeIsValidMinimumHeightBst(nums, solution.solution(nums));

        Assertions.assertTrue(result);
    }

    private boolean invokeIsValidMinimumHeightBst(int[] nums, TreeNode root)
            throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = Lcci0402MinimumHeightTree.class.getDeclaredMethod(
                "isValidMinimumHeightBst", int[].class, TreeNode.class);
        method.setAccessible(true);
        return (boolean) method.invoke(null, nums, root);
    }
}
