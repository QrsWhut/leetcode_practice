# Project Agent Instructions

This repository is a Java LeetCode practice project.

## Scope
- Only practice problems in `lcci`, `lcof`, and `lcof2`.
- Use Java for all solutions.
- Solutions should be placed under `src/main/java` (default: `src/main/java/leetcode/{lcci,lcof,lcof2}/`), one class per problem unless the user specifies otherwise.
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
