package com.datastructure;

public class CelingOfNumber {
    public static void main(String[] args) {
        int[] arr = {2,3,4,9,10,12,17,19,45};
        int ans = celing(arr,13);
        System.out.println(ans);
    }

    static int celing(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = start + (end-start) /2;
            if(arr[mid] == target) return mid;
            else if(target < arr[mid]) {
                end = end-1;
            }
            else{
                start = start+1;
            }
        }
        return start;
    }
}
