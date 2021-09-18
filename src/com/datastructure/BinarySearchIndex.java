package com.datastructure;

public class BinarySearchIndex {
// for index return end+1
    void binSearch(int[] array,int key)
    {
        int lb = 0;
        int ub = array.length-1;
        int mid = (lb + ub) / 2;
        while(lb <= ub)
        {
            if (array[mid] == key) {
                System.out.println(key + " is at " + mid + " position");
                break;
            }
                else if (array[mid] < key)
            {
                lb = mid + 1;
            }
            else
            {
                ub = mid -1;
            }
            mid = (lb + ub) / 2;

        }


    }

    public static void main(String[] args) {

        int[] array = {0,1,3,4,5,6,7,8,9};
        BinarySearchIndex search = new BinarySearchIndex();
        search.binSearch(array,7);

    }
}
