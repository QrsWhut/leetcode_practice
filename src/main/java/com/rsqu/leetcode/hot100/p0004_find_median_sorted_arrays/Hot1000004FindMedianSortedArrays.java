package com.rsqu.leetcode.hot100.p0004_find_median_sorted_arrays;

public class Hot1000004FindMedianSortedArrays {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int tarIndex = (len1+len2)/2;
        boolean isSingle = true;
        if ((len1+len2)%2==0) {
            isSingle = false;
        }
        int one = 0,two = 0;
        int count = 0;
        while (one < len1 && two < len2){
            double cur;
            if (nums1[one]>nums2[two]){
                cur = nums2[two];
                two++;
            }else {
                cur = nums2[one];
                one++;
            }
            count++;
            if (isSingle&&count==tarIndex){
                if (nums1[one]>nums2[two]){
                    cur = nums2[two];
                }else {
                    cur = nums2[one];
                }
                return cur;
            } else if(count==tarIndex){
                double nextCur;
                if (nums1[one]>nums2[two]){
                    nextCur = nums2[two];
                }else {
                    nextCur = nums2[one];
                }
                return (cur+nextCur)/2;
            }
        }
        if (one>=len1){
            double cur = nums2[two];
            two++;
            count++;
            if (isSingle&&count==tarIndex){
                cur = nums2[two];
                return cur;
            } else if(count==tarIndex){
                double nextCur;
                nextCur = nums2[two];
                return (cur+nextCur)/2;
            }
        } else {
            double cur = nums1[one];
            one++;
            count++;
            if (isSingle&&count==tarIndex){
                cur = nums1[one];
                return cur;
            } else if(count==tarIndex){
                double nextCur;
                nextCur = nums1[one];
                return (cur+nextCur)/2;
            }
        }
        return 0D;
    }

    public static void main(String[] args) {
        Hot1000004FindMedianSortedArrays solution = new Hot1000004FindMedianSortedArrays();
    }
}