package com.datastructure;

public class counter {
    public static void main(String[] args) {
        int counter = 0;
        int[] arr = {1, 1, 4, 3, 2, 1, 8};
        int a;

        try {
            for (int i = 0; i <= arr.length; i++) {
                a = arr[i + 1] + 1;



            if (a == arr.length) {
                    System.out.println(arr[i]);
                    break;
                } else if (arr[i] == a) {
                    System.out.println(arr[i]);
                }


            }
        }
        catch (ArrayIndexOutOfBoundsException e)          {
            System.out.println(e.getMessage());
        }
    }
}
