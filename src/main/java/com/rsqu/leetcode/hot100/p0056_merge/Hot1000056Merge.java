package com.rsqu.leetcode.hot100.p0056_merge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Hot1000056Merge {

    /**
     * 合并所有重叠的区间。
     *
     * @param intervals 输入的二维数组，每个元素是一个 [start, end] 区间
     * @return 合并后不重叠的区间数组
     */
    public int[][] merge(int[][] intervals) {
        if (intervals == null || intervals.length == 0) {
            return new int[0][];
        }

        // 按区间起点升序排序
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

        List<int[]> merged = new ArrayList<>();
        // 将第一个区间加入结果集
        merged.add(new int[]{intervals[0][0], intervals[0][1]});

        for (int i = 1; i < intervals.length; i++) {
            int[] curr = intervals[i];
            int[] last = merged.get(merged.size() - 1);

            if (curr[0] <= last[1]) {
                // 重叠，合并区间：更新右端点为较大值
                last[1] = Math.max(last[1], curr[1]);
            } else {
                // 不重叠，直接添加新区间
                merged.add(new int[]{curr[0], curr[1]});
            }
        }

        return merged.toArray(new int[merged.size()][]);
    }

    public static void main(String[] args) {
        Hot1000056Merge solution = new Hot1000056Merge();

        // 示例 1
        int[][] intervals1 = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] result1 = solution.merge(intervals1);
        System.out.println("输入: [[1,3],[2,6],[8,10],[15,18]]");
        System.out.println("输出: " + Arrays.deepToString(result1));
        System.out.println("预期: [[1,6],[8,10],[15,18]]");
        System.out.println();

        // 示例 2
        int[][] intervals2 = {{1, 4}, {4, 5}};
        int[][] result2 = solution.merge(intervals2);
        System.out.println("输入: [[1,4],[4,5]]");
        System.out.println("输出: " + Arrays.deepToString(result2));
        System.out.println("预期: [[1,5]]");
        System.out.println();

        // 边缘用例：单个区间
        int[][] intervals3 = {{1, 3}};
        int[][] result3 = solution.merge(intervals3);
        System.out.println("输入: [[1,3]]");
        System.out.println("输出: " + Arrays.deepToString(result3));
        System.out.println("预期: [[1,3]]");
        System.out.println();

        // 边缘用例：全重叠
        int[][] intervals4 = {{1, 4}, {2, 3}};
        int[][] result4 = solution.merge(intervals4);
        System.out.println("输入: [[1,4],[2,3]]");
        System.out.println("输出: " + Arrays.deepToString(result4));
        System.out.println("预期: [[1,4]]");
        System.out.println();

        // 边缘用例：无重叠
        int[][] intervals5 = {{1, 2}, {3, 4}, {5, 6}};
        int[][] result5 = solution.merge(intervals5);
        System.out.println("输入: [[1,2],[3,4],[5,6]]");
        System.out.println("输出: " + Arrays.deepToString(result5));
        System.out.println("预期: [[1,2],[3,4],[5,6]]");
    }
}