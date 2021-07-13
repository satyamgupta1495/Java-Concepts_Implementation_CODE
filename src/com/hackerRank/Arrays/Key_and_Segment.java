//? Check if a key is present in every segment of size k in an array.
package com.hackerRank.Arrays;

public class Key_and_Segment {
    static boolean key(int[] arr, int seg, int key) {
        int i;
        boolean b = false;
        for (i = 0; i < arr.length; i = i+seg) {
            for (int j = 0; j < seg; j++) {

                if (i + j < arr.length && arr[i + j] == key)
                    break;
                if (j == seg)
                    return false;
                if (i + j >= arr.length)
                    return false;
            }
        }
        if (i >= arr.length)
            return true;
        else
            return b;

    }

    public static void main(String[] args) {
        int arr[] = {5, 8, 7, 12, 14, 3, 9};

        Key_and_Segment seg1 = new Key_and_Segment();
        if (seg1.key(arr,2,8))
            System.out.println("Yes");
        else
        System.out.println("No");
    }
}
