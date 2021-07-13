package com.datastructure;


import java.util.Arrays;

public class SumTwo {
    public static void main(String[] args) {

        int target = 33 ;
        int[] array = { 100,2,7,11,15,22};
        int i = 0;
        int j = array.length-1;
        Arrays.sort(array);
        for(int k = 0; k < array.length; k++ ){
            System.out.println("Index " + k + " = "+ array[k]);
        }


        while (i<j){
            if (array[i] + array[j] == target){
                System.out.println(i);
                System.out.println(j);
                return;
            }
            else if (array[i] + array[j] > target){
                j--;
            }
            else {
                i++;
            }
        }






//        for(int i = 0; i < array.length; i++){
//            for(int j = 0; j < array.length; j++){
//                if (i != j){
//                    if (array[i] + array[j] == target){
//                        System.out.println(i);
//                    }
//                }
//            }
//
//        }



    }
}


//! Printing the array
//        for(int element: array )
//                System.out.println(element);