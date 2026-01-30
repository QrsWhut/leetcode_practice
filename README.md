# LeetCode Java 练习环境 (Maven 项目)

## 项目说明
基于 Maven 的 LeetCode 刷题练习项目，提供标准化的项目结构和常用数据结构封装。

## 项目结构

```
codePractice/
├── pom.xml                                    # Maven 配置文件
├── README.md                                  # 项目说明文档
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/
│   │           └── rsqu/
│   │               └── leetcode/
│   │                   ├── util/              # 工具类包
│   │                   │   ├── ListNode.java  # 链表节点类
│   │                   │   └── TreeNode.java  # 二叉树节点类
│   │                   └── code/              # 题目代码包
│   │                       └── SolutionTemplate.java  # 题目模板
│   └── test/
│       └── java/
│           └── com/
│               └── rsqu/
│                   └── leetcode/              # 测试代码目录
└── target/                                    # 编译输出目录（自动生成）
```

## 快速开始

### 1. 编译项目
```bash
mvn clean compile
```

### 2. 创建新题目
复制模板文件 `SolutionTemplate.java` 并重命名（如 `Solution1.java`）

```java
package com.rsqu.leetcode.code;

import com.rsqu.leetcode.util.ListNode;
import com.rsqu.leetcode.util.TreeNode;

/**
 * LeetCode 1. 两数之和
 * 难度：简单
 * 链接：https://leetcode.cn/problems/two-sum/
 */
public class Solution1 {
    
    public int[] twoSum(int[] nums, int target) {
        // 你的解法代码
        return new int[]{};
    }
    
    public static void main(String[] args) {
        Solution1 solution = new Solution1();
        
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = solution.twoSum(nums, target);
        
        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }
}
```

### 3. 编译并运行
```bash
# 编译项目
mvn compile

# 运行指定类（方式一：使用 java 命令）
java -cp target/classes com.rsqu.leetcode.code.Solution1

# 运行指定类（方式二：使用 Maven exec 插件，需要先在 pom.xml 中配置 mainClass）
mvn exec:java -Dexec.mainClass="com.rsqu.leetcode.code.Solution1"
```

## 工具类使用

### ListNode - 链表节点
```java
import com.rsqu.leetcode.util.ListNode;

// 创建链表：1 -> 2 -> 3 -> 4 -> 5
ListNode head = ListNode.fromArray(new int[]{1, 2, 3, 4, 5});

// 打印链表
System.out.println(ListNode.toString(head));  // 输出: 1 -> 2 -> 3 -> 4 -> 5
```

### TreeNode - 二叉树节点
```java
import com.rsqu.leetcode.util.TreeNode;

// 创建二叉树（层序遍历，null 表示空节点）
TreeNode root = TreeNode.fromArray(new Integer[]{1, 2, 3, null, 4, 5, 6});

// 打印二叉树
System.out.println(TreeNode.toString(root));  // 输出: [1, 2, 3, null, 4, 5, 6]
```

## 依赖库

项目已预配置以下常用依赖：

- **JUnit 5** (5.9.2) - 单元测试框架
- **Google Guava** (31.1-jre) - 强大的工具库
- **Apache Commons Lang3** (3.12.0) - 通用工具类
- **Apache Commons Collections4** (4.4) - 集合工具类

### 使用示例
```java
// 使用 Guava
import com.google.common.collect.Lists;
List<Integer> list = Lists.newArrayList(1, 2, 3);

// 使用 Apache Commons
import org.apache.commons.lang3.StringUtils;
boolean isEmpty = StringUtils.isEmpty(str);
```

## Maven 常用命令

```bash
# 清理编译输出
mvn clean

# 编译项目
mvn compile

# 运行测试
mvn test

# 打包项目
mvn package

# 执行 Java 程序
mvn exec:java -Dexec.mainClass="完整类名"
```

## 编码规范

- ✅ 所有注释使用中文
- ✅ 遵循阿里巴巴 Java 开发规范
- ✅ 变量和方法使用 camelCase
- ✅ 类名使用 UpperCamelCase
- ✅ 常量使用全大写下划线分隔
- ✅ 文件使用 UTF-8 编码（无 BOM）

## IDE 配置建议

### IntelliJ IDEA
1. 打开项目：File -> Open -> 选择 `pom.xml`
2. 等待 Maven 自动导入依赖
3. 右键运行 `main` 方法即可

### VS Code
1. 安装插件：Java Extension Pack
2. 打开项目文件夹
3. VS Code 会自动识别 Maven 项目

## 常见问题

**Q: 如何添加新的依赖库？**  
A: 在 `pom.xml` 的 `<dependencies>` 节点中添加依赖坐标，Maven 会自动下载。

**Q: 编译报错找不到包？**  
A: 运行 `mvn clean compile` 重新编译，确保所有依赖已下载。

**Q: 如何运行某个题目的代码？**  
A: 使用 `java -cp target/classes 完整类名` 或在 IDE 中直接运行 `main` 方法。

**Q: 可以使用 JDK 11 或更高版本吗？**  
A: 可以，修改 `pom.xml` 中的 `java.version` 属性即可。
