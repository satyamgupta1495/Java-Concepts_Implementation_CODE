package com.hackerRank.problemSolving;

public class MedianOfTwoArray {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int[] arr = new int[n+m];

        double median = 0d;

        int i = 0;
        int j = 0;
        int k = 0;
        while(i <= n-1 && j <= m-1){
            if(nums1[i] < nums2[j]){
                arr[k] = nums1[i];
                i++;
            }
            else{
                arr[k] = nums2[j];
                j++;
            }
            k++;
        }

        while(i <= n-1){
            arr[k] = nums1[i];
            k++;
            i++;
        }
        while(j <= m-1){
            arr[k] = nums2[j];
            j++;
            k++;
        }

        for (int elem:arr ) {
            System.out.print(elem + " ");
        }

        if (arr.length % 2 == 0)
            median = ((double)arr[arr.length/2] + (double)arr[arr.length/2 - 1])/2;
        else
            median = (double) arr[arr.length/2];

        return median;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int[] arr2 = {7,8,9};
        MedianOfTwoArray marray = new MedianOfTwoArray();
        double ans = marray.findMedianSortedArrays(arr1,arr2);
        System.out.println();
        System.out.println(ans);
    }
}
