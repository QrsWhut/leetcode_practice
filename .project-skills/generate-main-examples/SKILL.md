---
name: generate-main-examples
description: "Use when working in this Java LeetCode practice repository and the user asks to '根据 README 生成 main 示例', '补 main 测试样例', or sync README examples into a problem class under src/main/java/com/rsqu/leetcode/{lcci,lcof,lcof2}. Default behavior: modify only main and required imports, and report mismatches instead of changing the algorithm implementation unless the user explicitly allows broader edits."
---

# Generate Main Examples

## Overview

根据目标 Java 类同目录的 `README.md` 提取显式示例，生成可直接运行的 `main` 方法测试代码。
默认策略是最小改动，只允许修改 `main` 和必要 `import`，不改算法实现。

## Workflow

1. 读取目标类和同目录 `README.md`。
2. 只提取 `README` 中明确给出的示例，禁止自行补充额外样例。
3. 判断输入输出类型，优先复用项目已有工具类。
4. 仅修改 `main` 和必要 `import`，保持原有解法与辅助方法不变。
5. 可行时编译并运行目标类的 `main`。
6. 如果输出与 `README` 不一致，只报告问题，不自动修算法。

## Mapping Rules

- 标量、字符串、布尔值：直接使用对应 Java 字面量。
- 数组：使用对应数组字面量，输出通过 `TestUtil.format` 展示。
- 链表：优先使用 `ListNode.fromArray(int[])` 构造，必要时用 `ListNode.toString` 展示输入。
- 二叉树：优先使用 `TreeNode.fromArray(Integer[])` 构造，必要时用 `TreeNode.toString` 展示输入。
- 期望值：优先使用 `TestUtil.isEqual` 和 `TestUtil.format` 统一比较与打印。
- 如果 `README` 输入格式超出当前项目工具类能力，停止自动生成并明确说明阻塞点。

## Hard Constraints

- 除非用户明确授权，否则绝不修改 `solution`、辅助方法、字段或其他非 `main` 代码。
- 发现算法结果与 `README` 不一致时，绝不顺手修复算法，只能在结果中说明不一致。
- 保留用户已有改动，避免覆盖无关内容。
- 注释使用中文，文件保持 UTF-8 无 BOM。
- 优先最小改动，不做与示例生成无关的重构或清理。

## Verification

- 优先执行针对目标类的编译或项目编译，确认代码可通过编译。
- 尝试运行目标类 `main`，核对示例输出是否与 `README` 一致。
- 最终反馈中必须说明：
  - 生成了哪些示例
  - 是否只修改了 `main`
  - 编译与运行是否成功
  - 若失败，失败点在示例构造还是算法结果
