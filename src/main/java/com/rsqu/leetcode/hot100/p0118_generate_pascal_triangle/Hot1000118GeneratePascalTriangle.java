package com.rsqu.leetcode.hot100.p0118_generate_pascal_triangle;

import java.util.ArrayList;
import java.util.List;

public class Hot1000118GeneratePascalTriangle {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>(numRows);
        for (int i = 1; i <= numRows; i++) {
            List<Integer> row = new ArrayList<>(i);
            row.add(1);
            for (int j = 1; j < i - 1; j++) {
                row.add(result.get(i - 2).get(j - 1) + result.get(i - 2).get(j));
            }
            if (i > 1) {
                row.add(1);
            }
            result.add(row);
        }
        return result;
    }

    public static void main(String[] args) {
        Hot1000118GeneratePascalTriangle solution = new Hot1000118GeneratePascalTriangle();
    }
}