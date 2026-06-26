package com.rsqu.leetcode.hot100.p0207_can_finish;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * 课程表。
 */
public class Hot1000207CanFinish {

    /**
     * 判断是否可以完成所有课程。
     *
     * @param numCourses 课程数量
     * @param prerequisites 先修课程关系
     * @return 可以完成所有课程返回 true，否则返回 false
     */
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph = new ArrayList<>(numCourses);
        int[] inDegree = new int[numCourses];
        for (int course = 0; course < numCourses; course++) {
            graph.add(new ArrayList<>());
        }

        for (int[] prerequisite : prerequisites) {
            int nextCourse = prerequisite[0];
            int previousCourse = prerequisite[1];
            graph.get(previousCourse).add(nextCourse);
            inDegree[nextCourse]++;
        }

        Deque<Integer> zeroInDegreeCourses = new ArrayDeque<>();
        for (int course = 0; course < numCourses; course++) {
            if (inDegree[course] == 0) {
                zeroInDegreeCourses.offer(course);
            }
        }

        int learnedCount = 0;
        while (!zeroInDegreeCourses.isEmpty()) {
            int currentCourse = zeroInDegreeCourses.poll();
            learnedCount++;
            for (Integer nextCourse : graph.get(currentCourse)) {
                inDegree[nextCourse]--;
                if (inDegree[nextCourse] == 0) {
                    zeroInDegreeCourses.offer(nextCourse);
                }
            }
        }

        return learnedCount == numCourses;
    }

    public static void main(String[] args) {
        Hot1000207CanFinish solution = new Hot1000207CanFinish();
    }
}
