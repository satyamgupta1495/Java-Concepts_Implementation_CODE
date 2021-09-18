package com.hackerRank.problemSolving;

public class SearchInRotatedArray {

    static int search(int[] array){

        int pivot = array[0];
        int end = array.length-1;
        int start = 0;

        while(start <= end){
            int mid = start + (end-start)/2;
            if(mid > mid+1) {
                return pivot = array[mid];
            }
            else if( mid < mid-1){
                return mid-1;
            }else{
                end--;
            }
        }

        return pivot;
    }

    public static void main(String[] args) {
        int[] arr = {3,4,5,6,7,0,1,2,3,4};
        int ans = search(arr);
        System.out.println(ans);
    }
}
