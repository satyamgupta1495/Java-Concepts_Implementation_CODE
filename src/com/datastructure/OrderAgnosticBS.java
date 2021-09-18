package com.datastructure;

public class OrderAgnosticBS {

    public static void main(String[] args) {

//        int[] array = {0,1,3,4,5,6,7,8,9};
        int[] array = {9,8,7,6,5,4,3,2,1};
        int ans = search(array,8);
        System.out.println(ans);

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
