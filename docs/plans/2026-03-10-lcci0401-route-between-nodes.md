# Lcci0401RouteBetweenNodes Implementation Plan

> **For Claude:** REQUIRED SUB-SKILL: Use superpowers:executing-plans to implement this plan task-by-task.

**Goal:** 修复面试题 04.01 的 DFS 实现，使其能够正确判断有向图中两点之间是否存在路径。

**Architecture:** 保持现有 `solution + dfs` 结构不变，只在用户现有半成品基础上修正邻接表初始化、访问标记和遍历逻辑。补充独立的 JUnit 回归测试覆盖 README 样例和不可达场景，确保修复后行为稳定。

**Tech Stack:** Java 8、JUnit 5、Maven Surefire

---

### Task 1: 补充回归测试

**Files:**
- Create: `src/test/java/com/rsqu/leetcode/lcci/p04_01_route_between_nodes/Lcci0401RouteBetweenNodesTest.java`

**Step 1: Write the failing test**

编写 3 个测试：
- README 示例 1，应返回 `true`
- README 示例 2，应返回 `true`
- 不可达场景，应返回 `false`

**Step 2: Run test to verify it fails**

Run: `mvn -q -Dtest=Lcci0401RouteBetweenNodesTest test`

Expected: 当前实现失败，暴露邻接表初始化或 DFS 逻辑问题。

### Task 2: 修复 DFS 实现

**Files:**
- Modify: `src/main/java/com/rsqu/leetcode/lcci/p04_01_route_between_nodes/Lcci0401RouteBetweenNodes.java`

**Step 1: 修复邻接表初始化**

为 `adj` 的每个位置初始化集合实例，避免 `NullPointerException`。

**Step 2: 修复 DFS 访问逻辑**

使用 `boolean[]` 记录访问状态，在 `dfs` 内部统一处理访问标记，并只遍历真实邻居节点。

**Step 3: 保持主流程最小变更**

不改方法签名，不引入额外复杂结构，确保仍符合当前练习项目风格。

### Task 3: 验证修复结果

**Files:**
- Verify: `src/main/java/com/rsqu/leetcode/lcci/p04_01_route_between_nodes/Lcci0401RouteBetweenNodes.java`
- Verify: `src/test/java/com/rsqu/leetcode/lcci/p04_01_route_between_nodes/Lcci0401RouteBetweenNodesTest.java`

**Step 1: 运行目标测试**

Run: `mvn -q -Dtest=Lcci0401RouteBetweenNodesTest test`

Expected: PASS

**Step 2: 运行示例程序**

Run: `java -cp target/classes com.rsqu.leetcode.lcci.p04_01_route_between_nodes.Lcci0401RouteBetweenNodes`

Expected: 两个 README 示例输出为 `true`
