package com.rsqu.leetcode.hot100.p0994_oranges_rotting;

import java.util.LinkedList;
import java.util.Queue;

public class Hot1000994OrangesRotting {

    public int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] directions = new int[][] {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        Queue<int[]> queue = new LinkedList<>();
        int freshCount = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 2) {
                    queue.offer(new int[] {i, j});
                } else if (grid[i][j] == 1) {
                    freshCount++;
                }
            }
        }
        // 没有新鲜橘子，不需要时间
        if (freshCount == 0) {
            return 0;
        }
        int minutes = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            // 标记本层是否有新感染的橘子
            boolean rotted = false;
            // 按层取出，确保每一层算作 1 分钟
            for (int k = 0; k < size; k++) {
                int[] pos = queue.poll();
                for (int[] dir : directions) {
                    int x = pos[0] + dir[0];
                    int y = pos[1] + dir[1];
                    if (x >= 0 && x < m && y >= 0 && y < n && grid[x][y] == 1) {
                        grid[x][y] = 2;
                        freshCount--;
                        queue.offer(new int[] {x, y});
                        rotted = true;
                    }
                }
            }
            if (rotted) {
                minutes++;
            }
        }
        // 还有新鲜橘子则无法全腐烂
        return freshCount == 0 ? minutes : -1;
    }

    public static void main(String[] args) {
        Hot1000994OrangesRotting solution = new Hot1000994OrangesRotting();
    }
}