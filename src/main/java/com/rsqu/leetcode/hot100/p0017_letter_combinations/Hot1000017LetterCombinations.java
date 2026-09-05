package com.rsqu.leetcode.hot100.p0017_letter_combinations;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Hot1000017LetterCombinations {

    /**
     * 返回数字字符串对应的所有字母组合。
     *
     * @param digits 数字字符串
     * @return 所有可能的字母组合
     */
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.isEmpty()) {
            return result;
        }
        Map<Character, String> phoneMap = new HashMap<>(8);
        phoneMap.put('2', "abc");
        phoneMap.put('3', "def");
        phoneMap.put('4', "ghi");
        phoneMap.put('5', "jkl");
        phoneMap.put('6', "mno");
        phoneMap.put('7', "pqrs");
        phoneMap.put('8', "tuv");
        phoneMap.put('9', "wxyz");
        StringBuilder stringBuilder = new StringBuilder();
        dfs(digits,0,result,phoneMap,stringBuilder);
        return result;
    }

    private void dfs(String digits, int curNum, List<String> res, Map<Character, String> phoneMap , StringBuilder stringBuilder) {
        if (curNum == digits.length()) {
            res.add(stringBuilder.toString());
            return;
        }
        char cur = digits.charAt(curNum);
        String curStr = phoneMap.get(cur);
        for (char c : curStr.toCharArray()) {
            stringBuilder.append(c);
            dfs(digits,curNum+1,res,phoneMap,stringBuilder);
            stringBuilder.deleteCharAt(stringBuilder.length()-1);
        }
    }

    public static void main(String[] args) {
        Hot1000017LetterCombinations solution = new Hot1000017LetterCombinations();
    }
}
