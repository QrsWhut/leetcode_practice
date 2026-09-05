# Generate Main Examples Skill Implementation Plan

> **For Claude:** REQUIRED SUB-SKILL: Use superpowers:executing-plans to implement this plan task-by-task.

**Goal:** 在当前仓库中创建一个仅对本项目生效的 skill，用于根据题目同目录 `README.md` 生成 `main` 函数测试示例，并把默认编辑范围限制在 `main`。

**Architecture:** 通过仓库内 `.project-skills/generate-main-examples/` 保存 skill，本体用 `SKILL.md` 描述触发条件、工作流和硬约束；再通过仓库级 `AGENTS.md` 注册该 skill，使后续会话只在本仓库触发。额外保存最小设计文档，便于后续维护和迭代。

**Tech Stack:** Markdown、仓库级 AGENTS 约定、Python skill 初始化/校验脚本

---

### Task 1: 初始化项目内 Skill 目录

**Files:**
- Create: `.project-skills/generate-main-examples/SKILL.md`
- Create: `.project-skills/generate-main-examples/agents/openai.yaml`

**Step 1: 生成 skill 骨架**

Run: `python C:\Users\rsqu.rose\.codex\skills\.system\skill-creator\scripts\init_skill.py generate-main-examples --path .project-skills --interface 'display_name=补Main示例' --interface 'short_description=根据当前仓库README补Java题目main示例，默认只改main' --interface 'default_prompt=Use $generate-main-examples to add README examples into the target Java class main method without changing the algorithm implementation.'`

**Step 2: 确认骨架已生成**

Run: `Get-ChildItem -Recurse -Force .project-skills\generate-main-examples`

Expected: 能看到 `SKILL.md` 与 `agents/openai.yaml`

### Task 2: 编写 Skill 约束与流程

**Files:**
- Modify: `.project-skills/generate-main-examples/SKILL.md`
- Modify: `.project-skills/generate-main-examples/agents/openai.yaml`

**Step 1: 补齐触发描述**

写入仅针对当前仓库、`README` 示例同步、默认只改 `main` 的触发条件。

**Step 2: 写入工作流与硬约束**

写入：
- 读取目标类与同目录 `README.md`
- 仅提取显式示例
- 复用 `ListNode`、`TreeNode`、`TestUtil`
- 禁止修改算法实现
- 失败时只报告不一致

**Step 3: 保存最小验证要求**

写入编译、运行 `main`、回报结果的要求。

### Task 3: 在仓库中注册并校验 Skill

**Files:**
- Modify: `AGENTS.md`
- Create: `docs/plans/2026-03-06-generate-main-examples-skill-design.md`
- Create: `docs/plans/2026-03-06-generate-main-examples-skill.md`

**Step 1: 注册 skill**

在 `AGENTS.md` 的 `Available skills` 中增加 `generate-main-examples` 条目，写明触发词、默认边界和本地文件路径。

**Step 2: 保存设计与计划**

将本次设计和实现计划存入 `docs/plans/`，便于后续迭代。

**Step 3: 运行结构校验**

Run: `python C:\Users\rsqu.rose\.codex\skills\.system\skill-creator\scripts\quick_validate.py .project-skills\generate-main-examples`

Expected: 校验通过，无缺失字段或命名错误
