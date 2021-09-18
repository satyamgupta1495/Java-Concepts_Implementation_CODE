package com.datastructure;

public class BinarySearch {

    void binSearch(int[] array,int key)
    {
        int start = 0;
        int end = array.length-1;
        int mid ;
        while(start <= end)
        {
            mid = (start + end) / 2;
            if (array[mid] == key) {
                System.out.println(key + " is at " + mid + " position");
                break;
            }
                else if (array[mid] < key)
            {
                start = mid + 1;
            }
            else
            {
                end = mid -1;
            }


        }


    }

    public static void main(String[] args) {

        int[] array = {0,1,3,4,5,6,7,8,9};
        BinarySearch search = new BinarySearch();
        search.binSearch(array,2);

    }
}
