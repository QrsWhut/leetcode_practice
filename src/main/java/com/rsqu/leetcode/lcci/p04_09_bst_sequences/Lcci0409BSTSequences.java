package com.rsqu.leetcode.lcci.p04_09_bst_sequences;

import com.rsqu.leetcode.util.TestUtil;
import com.rsqu.leetcode.util.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Lcci0409BSTSequences {
    // 题目描述：本目录 README.md。

    public List<List<Integer>> solution(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            result.add(new ArrayList<>());
            return result;
        }

        List<List<Integer>> leftSequenceList = solution(root.left);
        List<List<Integer>> rightSequenceList = solution(root.right);
        LinkedList<Integer> prefix = new LinkedList<>();
        prefix.add(root.val);
        for (List<Integer> leftSequence : leftSequenceList) {
            for (List<Integer> rightSequence : rightSequenceList) {
                weaveSequence(new LinkedList<>(leftSequence), new LinkedList<>(rightSequence), prefix, result);
            }
        }
        return result;
    }

    private void weaveSequence(LinkedList<Integer> firstSequence, LinkedList<Integer> secondSequence,
                               LinkedList<Integer> prefix, List<List<Integer>> result) {
        if (firstSequence.isEmpty() || secondSequence.isEmpty()) {
            List<Integer> currentSequence = new ArrayList<>(prefix);
            currentSequence.addAll(firstSequence);
            currentSequence.addAll(secondSequence);
            result.add(currentSequence);
            return;
        }

        Integer firstHead = firstSequence.removeFirst();
        prefix.addLast(firstHead);
        weaveSequence(firstSequence, secondSequence, prefix, result);
        prefix.removeLast();
        firstSequence.addFirst(firstHead);

        Integer secondHead = secondSequence.removeFirst();
        prefix.addLast(secondHead);
        weaveSequence(firstSequence, secondSequence, prefix, result);
        prefix.removeLast();
        secondSequence.addFirst(secondHead);
    }

    public static void main(String[] args) {
        Lcci0409BSTSequences solution = new Lcci0409BSTSequences();

        // 示例1
        TreeNode root1 = TreeNode.fromArray(new Integer[]{2, 1, 3});
        List<List<Integer>> result1 = solution.solution(root1);
        List<List<Integer>> expected1 = Arrays.asList(
                Arrays.asList(2, 1, 3),
                Arrays.asList(2, 3, 1)
        );
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败")
                + "，输出=" + TestUtil.format(result1)
                + "，期望=" + TestUtil.format(expected1));
    }
}
