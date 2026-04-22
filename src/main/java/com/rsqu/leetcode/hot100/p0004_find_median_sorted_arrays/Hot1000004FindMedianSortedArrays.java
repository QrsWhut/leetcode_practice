package com.rsqu.leetcode.hot100.p0004_find_median_sorted_arrays;

public class Hot1000004FindMedianSortedArrays {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int totalLen = len1 + len2;
        int targetIndex = totalLen / 2;
        boolean isOdd = (totalLen & 1) == 1;
        int one = 0;
        int two = 0;
        int prev = 0;
        int curr = 0;

        for (int count = 0; count <= targetIndex; count++) {
            prev = curr;
            if (one < len1 && (two >= len2 || nums1[one] <= nums2[two])) {
                curr = nums1[one];
                one++;
            } else {
                curr = nums2[two];
                two++;
            }
        }

        if (isOdd) {
            return curr;
        }
        return (prev + curr) / 2.0D;
    }

    public static void main(String[] args) {
        Hot1000004FindMedianSortedArrays solution = new Hot1000004FindMedianSortedArrays();
    }
}
