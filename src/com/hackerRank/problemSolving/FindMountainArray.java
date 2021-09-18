package com.hackerRank.problemSolving;

public class FindMountainArray {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,9,8,7,6};

    }

    static boolean isAgnostic(int[] array, int start, int end){
        int mid = (start + end) / 2;
        return array[mid] > array[mid+1];
    }

    static int search(int[] array,int target){
        int start = 0;
        int end = array.length-1;



        while(start <= end)
        {
            int mid = (start + end) / 2;
            if(isAgnostic(array, start, end)) {

                if (array[mid] < target) {
                    end = mid - 1;
                } else if (array[mid] > target) {
                    start = mid + 1;
                } else {
                    return mid;
                }
            }
            else{

                if (array[mid] == target) {
                    return mid;
                } else if (array[mid] < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }

        }
        return -1;
    }
}
