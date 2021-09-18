package com.hackerRank.problemSolving;

public class PeakOFMountainArray {

    //! Bitonic Array

        static int peakIndexInMountainArray(int[] arr) {
            int start = 0 ;
            int end = arr.length-1;

            while(start < end){
                int mid = start + (end-start)/2;
                if(arr[mid] > arr[mid+1]){
                    end = mid;
                }else{
                    start = mid+1;
                }
            }
            return start;
        }

    public static void main(String[] args) {
        int[] arr = {2,3,4,9,10,12,17,19,45};
        System.out.println(peakIndexInMountainArray(arr));
    }
}
