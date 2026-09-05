package com.rsqu.leetcode.lcci.p04_08_first_common_ancestor;

import com.rsqu.leetcode.util.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Lcci0408FirstCommonAncestorTest {
    @Test
    public void shouldReturnAncestorWhenOneTargetIsAncestorOfTheOther() {
        TreeNode root = TreeNode.fromArray(new Integer[]{3, 5, 1, 6, 2, 0, 8, null, null, 7, 4});
        Lcci0408FirstCommonAncestor solution = new Lcci0408FirstCommonAncestor();

        TreeNode result = solution.solution(root, root.left, root.left.right.right);

        Assertions.assertSame(root.left, result);
    }
}
