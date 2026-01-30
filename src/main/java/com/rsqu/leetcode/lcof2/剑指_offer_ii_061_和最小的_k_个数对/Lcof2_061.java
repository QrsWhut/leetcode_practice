package com.rsqu.leetcode.lcof2.剑指_offer_ii_061_和最小的_k_个数对;

import java.util.*;
import com.rsqu.leetcode.util.TestUtil;

public class Lcof2_061 {
    // 题目描述：本目录 README.md。

    public List<List<Integer>> solution(int[] nums1, int[] nums2, int k) {
        // TODO：请实现解法
        return null;
    }

    public static void main(String[] args) {
        Lcof2_061 solution = new Lcof2_061();

        // 示例1
        int[] nums11 = new int[]{1, 7, 11};
        int[] nums21 = new int[]{2, 4, 6};
        int k1 = 3;
        Object result1 = solution.solution(nums11, nums21, k1);
        // // TODO：请补充期望输出：[1,2],[1,4],[1,6] 解释: 返回序列中的前 3 对数: [1,2],[1,4],[1,6],[7,2],[7,4],[11,2],[7,6],[11,4],[11,6]
        System.out.println("示例1输出：" + TestUtil.format(result1));

        // 示例2
        int[] nums12 = new int[]{1, 1, 2};
        int[] nums22 = new int[]{1, 2, 3};
        int k2 = 2;
        Object result2 = solution.solution(nums12, nums22, k2);
        // // TODO：请补充期望输出：[1,1],[1,1] 解释: 返回序列中的前 2 对数: [1,1],[1,1],[1,2],[2,1],[1,2],[2,2],[1,3],[1,3],[2,3]
        System.out.println("示例2输出：" + TestUtil.format(result2));

        // 示例3
        int[] nums13 = new int[]{1, 2};
        int[] nums23 = new int[]{3};
        int k3 = 3;
        Object result3 = solution.solution(nums13, nums23, k3);
        // // TODO：请补充期望输出：[1,3],[2,3] 解释: 也可能序列中所有的数对都被返回:[1,3],[2,3]
        System.out.println("示例3输出：" + TestUtil.format(result3));

    }
}
