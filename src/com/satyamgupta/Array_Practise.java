package com.satyamgupta;
import java.lang.String;
import java.util.Scanner;

public class Array_Practise {
    public static void main(String[] args) {


//        !PROBLEM 1
//        float[] marks = {45.7f, 78.4f, 63.2f, 100.0f};
//        float sum = 0;
//        for (float elements:marks){
//            sum = sum +elements;
//        }
//        System.out.println(sum);
//        }
//

//        !PROBLEM 2
//        float[] marks = {45.7f, 78.4f, 63.2f, 100.0f};
//        float num = 643.2f;
//        boolean isInArray = false;
//        for (float elements : marks) {
//            if (num==elements) {
//                isInArray = true;
//                break;
//            }
//        }
//        if (isInArray) {
//            System.out.println("Value is in array");
//        }
//        else
//        {
//            System.out.println("Value is not in array");
//        }

//      !PROBLEM 3
//        float[] marks = {45.7f, 78.4f, 63.2f, 100.0f};
//        float sum = 0;
//        for (float elements : marks) {
//            sum = sum + elements;
//        }
//        System.out.println("The Average Value of your marks is :- " + sum / marks.length);
//    }

//    !PROBLEM 4
//        int[][] mat1 = {{1, 2, 3},
//                {3, 2, 1}};
//        int[][] mat2 = {{4, 5, 6},
//                {4, 5, 6}};
//        int[][] result = {{0, 0, 0},
//                {0, 0, 0}};
//
//        for (int i = 0; i < mat1.length; i++) { //ROW NUMBER OF TIMES CHALEGA
//            for (int j = 0; j < mat1[i].length; j++) {  //COLUMN NUMBER OF TIMES CHALEGA
//                System.out.format("Setting value for %d and %d\n", i, j);
//                result[i][j] = mat1[i][j] + mat2[i][j];
//            }
//        }
//        for (int i = 0; i < mat1.length; i++) {
//            for (int j = 0; j < mat1[i].length; j++) {
//                System.out.print(result[i][j] + " ");
//
//            }
//            System.out.println("");
//        }

//        * PRACTICE
//        int [][] mat1 = {{1,5,6},{2,7,1}};
//        int [][] mat2 = {{2,9,3},{4,8,7}};
//        int [][] result = {{0,0,0},{0,0,0}};
//
//        for (int i = 0; i<mat1.length;i++) {
//            for (int j = 0; j<mat1[i].length;j++){
//                System.out.format("Displaying value %d and %d\n", i,j);
//                result[i][j] = mat1[i][j] + mat2[i][j];
//            }
//
//        }
//        for (int i = 0; i<mat1.length;i++) {
//            for (int j = 0; j<mat1[i].length;j++){
//                System.out.print(result[i][j] + " " );
//            }
//            System.out.println("");
//
//        }


//      !PROBLEM 5
//        int[] arr = {1,2,3,4,5,6,7,8,9};
//        int l = arr.length;
//        int a =  Math.floorDiv(arr.length,2);
//        for (int i = 0; i<a; i++){
//            //SWAPPING
//            int temp = arr[i];
//            arr[i] = arr[l-i-1];
//            arr[l-i-1] = temp;
//
//        }
//        for (int element:arr) {
//            System.out.println(element);
//
//        }



//        int[] a  = {6,5,4,3,2,1,0};
//        int len = a.length;
//        int n = Math.floorDiv(len,2);
//        for (int i = 0; i<n; i++){
//            int temp = a[i];
//            a[i] = a[len-i-1];
//            a[len-i-1] = temp;
//        }
//        for (int elements:a) {
//            System.out.println(elements + " ");
//        }


//        !STRING ARRAY
//        String [][] cars = {{"Ferrari", "Lamborghini","Renault", "Skoda"},{"100,000$","300,000$","1000$","45000$"}};
//
//        for (int i = 0; i< cars.length; i++){
//            for (int j = 0; j<cars[i].length; j++){
//                System.out.print(cars[i][j]);
//                System.out.print(" ");
//            }
//            System.out.println(" ");
//        }

//       !PROBLEM 8
//        int[] a  = {6,5,4,3,2,678,1,0};
//        int max = 0;
//        for (int e: a) {
//            if (e>max){
//                max = e;
//            }
//
//        }
//        System.out.println("Maximum value is : " +max);
//
//
//        System.out.println(Integer.MAX_VALUE);
//        System.out.println(Integer.MIN_VALUE);

//        int[] a  = {6,5,4,3,2,678,1,0};
//        int[] a  = {1,2,3,4,5,6,7,8,9};
//        Boolean isSorted = true;
//        for (int i =0; i<a.length-1; i++){
//            if(a[i]> a[i+1]){
//                isSorted = false;
//                break;
//            }
//        }
//        if(isSorted=false) {
//            System.out.println("This Array is not sorted!");
//        }
//        else{
//            System.out.println("This Array is sorted!");
//        }


        Scanner scan  = new Scanner(System.in);
        int num = scan.nextInt();
        switch(num){
            case 1:
                System.out.println("You choose 1");
                break;
        }






    }




    }

