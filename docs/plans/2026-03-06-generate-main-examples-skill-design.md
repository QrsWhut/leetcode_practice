# 项目内 Generate Main Examples Skill 设计

## 目标

为当前 Java LeetCode 练习仓库提供一个仅在本仓库生效的 skill，用于根据题目同目录 `README.md` 自动补齐 `main` 函数中的测试示例，减少重复说明成本。

## 核心约束

- skill 必须只在当前仓库可见，不进入全局 skill 目录。
- 默认只允许修改 `main` 和必要 `import`。
- 发现示例运行结果与 `README` 不一致时，只报告，不自动修改算法实现。
- 复用仓库已有工具类 `ListNode`、`TreeNode`、`TestUtil`。

## 方案

采用“仓库内 skill + AGENTS 注册”的方式：

- skill 文件放在 `.project-skills/generate-main-examples/SKILL.md`
- 在仓库级 `AGENTS.md` 的 `Available skills` 中注册
- 通过 skill 描述限定触发词、适用目录和默认编辑边界

## 行为设计

1. 读取目标类和同目录 `README.md`
2. 提取 `README` 中显式示例
3. 按输入输出类型生成 `main` 示例代码
4. 仅改 `main` 和必要 `import`
5. 编译并尽量运行 `main`
6. 报告示例是否通过；若不通过，仅指出算法与示例不一致

## 非目标

- 不负责自动修复算法逻辑
- 不负责批量扫全仓库补全部题目示例
- 不负责处理超出当前工具类能力的复杂自定义输入结构
