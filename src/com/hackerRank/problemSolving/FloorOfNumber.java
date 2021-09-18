package com.hackerRank.problemSolving;

public class FloorOfNumber {

    int floor(int[] array, int target){
        int start = 0;
        int end = array.length-1;

        while(start <= end){

            int mid = start + (end - start)/2;
            if(target < array[mid]){
                end = mid -1;
            }
            else if(target > array[mid]){
                start = mid+1;
            }
            else{
                return mid;
            }
        }
        return end;

    }

    public static void main(String[] args) {
        int[] array = {2,3,5,9,13,14,16,18};
        FloorOfNumber cell = new FloorOfNumber();
        int ans = cell.floor(array, 15);
        System.out.println(ans);


    }
}
