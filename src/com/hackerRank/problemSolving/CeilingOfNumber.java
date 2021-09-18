package com.hackerRank.problemSolving;

public class CeilingOfNumber {

    int ceiling(int[] array, int target){
        int start = 0;
        int end = array.length-1;

        while(start <= end){

            int mid = start + (end-start)/2;

            if (target < array[mid]){
                end = mid-1;
            }
            else if (target > array[mid]){
                start = mid+1;
            }
            else {
                return mid;
            }
        }
        return start;

    }

    public static void main(String[] args) {
        int[] array = {2,3,5,9,13,14,15,16,18};
        CeilingOfNumber cell = new CeilingOfNumber();
        int ans = cell.ceiling(array, 15);
        System.out.println(ans);
    }
}
