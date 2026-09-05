package com.rsqu.leetcode.hot100.p0005_longest_palindrome;


public class Hot1000005LongestPalindrome {

    public String longestPalindrome(String s) {
        int len = s.length();
        String curMax = "";
        for (int i = 0; i < len; i++) {
            String single = findSingle(s, i);
            String aDouble = findDouble(s, i);
            if (single.length()>aDouble.length() && single.length() > curMax.length()){
                curMax = single;
            } else if (single.length()<=aDouble.length() && aDouble.length() > curMax.length()){
                curMax = aDouble;
            }
        }
        return curMax;
    }
    private String findSingle(String s,int curIndex) {
        if (curIndex == 0) {
            return s.substring(0,1);
        }
        int left = curIndex-1;
        int right = curIndex+1;
        while (left>=0 && right<s.length()){
            if (s.charAt(left) == s.charAt(right)){
                left--;
                right++;
            } else {
                return s.substring(++left,right);
            }
        }
        return s.substring(++left,right);
    }

    private String findDouble(String s,int curIndex) {

        if (curIndex+1==s.length()){
            return "";
        }
        if (s.charAt(curIndex)!=s.charAt(curIndex+1)){
            return "";
        }
        int left = curIndex-1;
        int right = curIndex+2;
        while (left>=0 && right<s.length()){
            if (s.charAt(left) == s.charAt(right)){
                left--;
                right++;
            } else {
                return s.substring(++left,right);
            }
        }
        return s.substring(++left,right);
    }

    public static void main(String[] args) {
        Hot1000005LongestPalindrome solution = new Hot1000005LongestPalindrome();
    }
}