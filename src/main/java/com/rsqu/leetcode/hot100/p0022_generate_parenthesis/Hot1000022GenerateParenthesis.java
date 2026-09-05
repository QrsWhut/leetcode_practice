package com.rsqu.leetcode.hot100.p0022_generate_parenthesis;

import java.util.ArrayList;
import java.util.List;

public class Hot1000022GenerateParenthesis {

    /**
     * 生成所有有效的括号组合。
     *
     * @param n 括号对数
     * @return 所有有效的括号组合
     */
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        if (n <= 0) {
            return result;
        }
        StringBuilder path = new StringBuilder();
        dfs(n, 0, 0, path, result);
        return result;
    }

    /**
     * 按当前位置可选的左右括号继续构造路径。
     *
     * @param n 括号对数
     * @param leftCount 已使用的左括号数量
     * @param rightCount 已使用的右括号数量
     * @param path 当前括号路径
     * @param result 有效括号组合结果
     */
    private void dfs(int n, int leftCount, int rightCount, StringBuilder path, List<String> result) {
        if (n * 2 == leftCount + rightCount) {
            result.add(path.toString());
            return;
        }
        if (leftCount < n) {
            path.append('(');
            dfs(n,leftCount+1,rightCount,path,result);
            path.deleteCharAt(path.length() -1);
        }
        if (rightCount < leftCount) {
            path.append(')');
            dfs(n,leftCount,rightCount+1,path,result);
            path.deleteCharAt(path.length() -1);
        }
    }

    public static void main(String[] args) {
        Hot1000022GenerateParenthesis solution = new Hot1000022GenerateParenthesis();
    }
}
