# Lcci0303 StackOfPlates Implementation Plan

> **For Claude:** REQUIRED SUB-SKILL: Use superpowers:executing-plans to implement this plan task-by-task.

**Goal:** 为面试题 03.03 补齐可运行的 `StackOfPlates` Java 实现、README 示例 `main`，并增加回归测试。

**Architecture:** 使用 `List<Deque<Integer>>` 模拟多组子栈，每个子栈容量受 `cap` 控制。`push` 负责在满栈后新建子栈，`pop` 复用 `popAt` 弹出最后一个子栈的元素，空子栈会被移除。

**Tech Stack:** Java 8、`ArrayList`、`ArrayDeque`、JUnit 5、Maven

---

### Task 1: 编写失败测试

**Files:**
- Create: `src/test/java/com/rsqu/leetcode/lcci/p03_03_stack_of_plates/Lcci0303StackofPlatesTest.java`

**Step 1: 写 README 两个示例对应测试**

验证：
- 示例 1：`cap = 1` 时，`push(1)`, `push(2)`, `popAt(1)`, `pop()`, `pop()` 返回 `2, 1, -1`
- 示例 2：`cap = 2` 时，`push(1)`, `push(2)`, `push(3)`, 连续三次 `popAt(0)` 返回 `2, 1, 3`

**Step 2: 运行单测确认失败**

Run: `mvn -q -Dtest=Lcci0303StackofPlatesTest test`

### Task 2: 实现设计题类与 main

**Files:**
- Modify: `src/main/java/com/rsqu/leetcode/lcci/p03_03_stack_of_plates/Lcci0303StackofPlates.java`

**Step 1: 改成设计题类实现**

补齐：
- 构造方法
- `push(int val)`
- `pop()`
- `popAt(int index)`

**Step 2: 仅按 README 补 `main`**

打印两个示例每一步最终结果。

### Task 3: 验证

**Files:**
- Verify: `src/main/java/com/rsqu/leetcode/lcci/p03_03_stack_of_plates/Lcci0303StackofPlates.java`
- Verify: `src/test/java/com/rsqu/leetcode/lcci/p03_03_stack_of_plates/Lcci0303StackofPlatesTest.java`

**Step 1: 运行单测**

Run: `mvn -q -Dtest=Lcci0303StackofPlatesTest test`

**Step 2: 运行 main**

Run: `java -cp target/classes com.rsqu.leetcode.lcci.p03_03_stack_of_plates.Lcci0303StackofPlates`
