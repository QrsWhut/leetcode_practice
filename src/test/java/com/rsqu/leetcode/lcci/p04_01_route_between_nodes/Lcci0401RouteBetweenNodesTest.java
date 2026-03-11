package com.rsqu.leetcode.lcci.p04_01_route_between_nodes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * {@link Lcci0401RouteBetweenNodes} 的回归测试。
 */
public class Lcci0401RouteBetweenNodesTest {
    /**
     * README 示例 1 中起点可以直接到达终点。
     */
    @Test
    public void shouldReturnTrueWhenReadmeExampleOneHasPath() {
        Lcci0401RouteBetweenNodes solution = new Lcci0401RouteBetweenNodes();
        int[][] graph = new int[][]{{0, 1}, {0, 2}, {1, 2}, {1, 2}};

        boolean result = solution.solution(3, graph, 0, 2);

        Assertions.assertTrue(result);
    }

    /**
     * README 示例 2 中起点可以通过多条路径到达终点。
     */
    @Test
    public void shouldReturnTrueWhenReadmeExampleTwoHasPath() {
        Lcci0401RouteBetweenNodes solution = new Lcci0401RouteBetweenNodes();
        int[][] graph = new int[][]{
            {0, 1}, {0, 2}, {0, 4}, {0, 4}, {0, 1},
            {1, 3}, {1, 4}, {1, 3}, {2, 3}, {3, 4}
        };

        boolean result = solution.solution(5, graph, 0, 4);

        Assertions.assertTrue(result);
    }

    /**
     * 不存在可达路径时应返回 false。
     */
    @Test
    public void shouldReturnFalseWhenTargetIsUnreachable() {
        Lcci0401RouteBetweenNodes solution = new Lcci0401RouteBetweenNodes();
        int[][] graph = new int[][]{{0, 1}, {1, 2}};

        boolean result = solution.solution(4, graph, 2, 3);

        Assertions.assertFalse(result);
    }
}
