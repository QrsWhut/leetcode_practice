# Project Agent Instructions

This repository is a Java LeetCode practice project.

## Scope
- Only practice problems in `lcci`, `lcof`, and `lcof2`.
- Use Java for all solutions.
- Solutions should be placed under `src/main/java` (default: `src/main/java/com/rsqu/leetcode/{lcci,lcof,lcof2}/`), one class per problem unless the user specifies otherwise.
- Tests (if any) go under `src/test/java`.

## Review workflow
- After the user finishes a solution, review it for:
  - Correctness and edge cases
  - Time/space complexity
  - Readability and Java best practices
  - Missing tests or tricky cases
- Provide concise feedback in Chinese.
- Only suggest changes; do not rewrite large blocks unless asked.

## Reference repository usage
- A reference repo is cloned under `reference/leetcode` (from `git@github.com:QrsWhut/leetcode.git`).
- Use it only to verify problem statements/answers.
- Do **not** copy solutions verbatim; use it as a correctness check.
- Only consult `lcci`, `lcof`, and `lcof2` directories in the reference repo.

## Git / GitHub
- Primary remote: `git@github.com:QrsWhut/leetcode_practice.git` (branch: `master`).
- The `reference/` directory must be ignored from version control.
- After each review, push the updated practice code to the remote unless the user says not to.


## Skills
A skill is a set of local instructions to follow that is stored in a `SKILL.md` file. Below is the list of skills that can be used. Each entry includes a name, description, and file path so you can open the source for full instructions when using a specific skill.
### Available skills
- 部署流程: 将 DataShareService 项目部署到测试站，支持跳过构建和完整构建两种模式 (file: C:/Users/rsqu.rose/.codex/skills/deploy/SKILL.md)
- skill-creator: Guide for creating effective skills. This skill should be used when users want to create a new skill (or update an existing skill) that extends Codex's capabilities with specialized knowledge, workflows, or tool integrations. (file: C:/Users/rsqu.rose/.codex/skills/.system/skill-creator/SKILL.md)
- skill-installer: Install Codex skills into $CODEX_HOME/skills from a curated list or a GitHub repo path. Use when a user asks to list installable skills, install a curated skill, or install a skill from another repo (including private repos). (file: C:/Users/rsqu.rose/.codex/skills/.system/skill-installer/SKILL.md)
### How to use skills
- Discovery: The list above is the skills available in this session (name + description + file path). Skill bodies live on disk at the listed paths.
- Trigger rules: If the user names a skill (with `$SkillName` or plain text) OR the task clearly matches a skill's description shown above, you must use that skill for that turn. Multiple mentions mean use them all. Do not carry skills across turns unless re-mentioned.
- Missing/blocked: If a named skill isn't in the list or the path can't be read, say so briefly and continue with the best fallback.
- How to use a skill (progressive disclosure):
  1) After deciding to use a skill, open its `SKILL.md`. Read only enough to follow the workflow.
  2) If `SKILL.md` points to extra folders such as `references/`, load only the specific files needed for the request; don't bulk-load everything.
  3) If `scripts/` exist, prefer running or patching them instead of retyping large code blocks.
  4) If `assets/` or templates exist, reuse them instead of recreating from scratch.
- Coordination and sequencing:
  - If multiple skills apply, choose the minimal set that covers the request and state the order you'll use them.
  - Announce which skill(s) you're using and why (one short line). If you skip an obvious skill, say why.
- Context hygiene:
  - Keep context small: summarize long sections instead of pasting them; only load extra files when needed.
  - Avoid deep reference-chasing: prefer opening only files directly linked from `SKILL.md` unless you're blocked.
  - When variants exist (frameworks, providers, domains), pick only the relevant reference file(s) and note that choice.
- Safety and fallback: If a skill can't be applied cleanly (missing files, unclear instructions), state the issue, pick the next-best approach, and continue.
