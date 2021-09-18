package com.satyamgupta;

import java.util.Scanner;

//! ARRAYS are not continous in HEAP memory because of JVM

public class Array {

    public static void main(String[] args) {

//      !SYNTAX  : int [] array_name = new datatype [number of elements];

//        int[] a = {45, 85, 56, 47, 12, 36};
//        boolean isInArray = false;
//        Scanner scan = new Scanner(System.in);
//        int b = scan.nextInt();
//        int sum = 0;
////        int b = 845;
//        for(int i = 0; i<a.length; i++){
//            if (b == a[i]){
//                isInArray = true;
//                break;
//            }
//
//            sum = sum + a[i];
//        }
//        if (isInArray==true){
//            System.out.println("Number is present!");
//            System.out.println("Total sum is:- "+sum);
//        }
//        else
//        {
//            System.out.println("Number is not present!");
//            System.out.println("Total sum is:- "+sum);
//        }

        int[] marks = {1,8,3,79,2,54};
        System.out.println("Before changing  marks := "+marks[0]);
        change2(marks);
        System.out.println("After changing  marks := " +marks[0]);


    }
    static void change2 (int[] arr){
        arr[0] = 899;
    }
}
