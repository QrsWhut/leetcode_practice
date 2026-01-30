package com.rsqu.leetcode.lcci.p17_16_the_masseuse;

import com.rsqu.leetcode.util.TestUtil;

public class Lcci1716TheMasseuse {
    // 题目描述：本目录 README.md。

    public int solution(int[] nums) {
        // TODO：请实现解法
        return 0;
    }

    public static void main(String[] args) {
        Lcci1716TheMasseuse solution = new Lcci1716TheMasseuse();

        // 示例1
        int[] nums1 = new int[]{1, 2, 3, 1};
        Object result1 = solution.solution(nums1);
        Object expected1 = 4 解释: 选择 1 号预约和 3 号预约，总时长 = 1 + 3 = 4。;
        boolean pass1 = TestUtil.isEqual(result1, expected1);
        System.out.println("示例1：" + (pass1 ? "通过" : "失败") + "，输出=" + TestUtil.format(result1) + "，期望=" + TestUtil.format(expected1));

        // 示例2
        int[] nums2 = new int[]{2, 7, 9, 3, 1};
        Object result2 = solution.solution(nums2);
        Object expected2 = 12 解释: 选择 1 号预约、 3 号预约和 5 号预约，总时长 = 2 + 9 + 1 = 12。;
        boolean pass2 = TestUtil.isEqual(result2, expected2);
        System.out.println("示例2：" + (pass2 ? "通过" : "失败") + "，输出=" + TestUtil.format(result2) + "，期望=" + TestUtil.format(expected2));

        // 示例3
        int[] nums3 = new int[]{2, 1, 4, 5, 3, 1, 1, 3};
        Object result3 = solution.solution(nums3);
        Object expected3 = 12 解释: 选择 1 号预约、 3 号预约、 5 号预约和 8 号预约，总时长 = 2 + 4 + 3 + 3 = 12。;
        boolean pass3 = TestUtil.isEqual(result3, expected3);
        System.out.println("示例3：" + (pass3 ? "通过" : "失败") + "，输出=" + TestUtil.format(result3) + "，期望=" + TestUtil.format(expected3));

    }
}
