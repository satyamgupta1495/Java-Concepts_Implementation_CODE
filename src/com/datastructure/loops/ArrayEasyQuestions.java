package com.datastructure.loops;

import com.datastructure.sorttingAlgorithms.BubbleSort;

public class ArrayEasyQuestions {

    public boolean keySegment(int[] arr, int seg, int key){
        int size = arr.length;
        boolean b = false;

        int i;
        for (i = 0; i < size; i+=seg) {
            for (int j = 0; j < seg; j++) {
                if (i+j < size && arr[i+j] == key)
                    break;
                if (j == seg)
                    return false;
                if (i+j >= size)
                    return false;
            }
        }
        if (i>=size ) return true;
        else return b;
    }

    public void arrayReverse(int[] arr){
        int[] b = new int[arr.length];
        for (int i = arr.length-1 ;i >= 0 ; i--) {
            b[i] = arr[i];
            System.out.println(b[i] + " ");
        }
    }

    public void Kth_Largest(int[] arr, int kth){
        int size  = arr.length;
        com.datastructure.sorttingAlgorithms.BubbleSort b = new BubbleSort();
        b.bubbleSort(arr);
        b.printArray(arr);
        System.out.println("------------> " + arr[size - kth]);
    }

    public void frequencyOfNumbers(int[] arr, int num){
        int freq = 0;
        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i]){
                freq+=1;
            }
        }
        System.out.println(num + " is occured "+ freq + " times");

    }

    public void rangeandCoefficient(int[] arr){
        com.datastructure.sorttingAlgorithms.BubbleSort b = new BubbleSort();
        b.bubbleSort(arr);
        b.printArray(arr);
        System.out.print("\n Range : " + (arr[arr.length-1] - arr[0]));
        System.out.print("\n Max : "+ arr[arr.length-1]);
        System.out.print("\n Min : " + arr[0]);
        float coe =(float) (arr[arr.length-1] - arr[0]) / (arr[arr.length-1] + arr[0]);
        System.out.print("\n Coefficient : "+ coe);
    }

    public void unionAndIntersection(int[] arr1, int[] arr2){
     int i = 0 , j= 0;
     while(i < arr1.length && j < arr2.length){
         if (arr1[i] == arr2[j]){
             System.out.println(arr1[i]);
         }
         else if (arr1[i] > arr2[j]){
             i++;
         }
         else {

             j++;
         }
     }
    }
    String timeConversion(String s){

        int hour = Integer.parseInt(s.substring(0, 2)) % 12;
        if (s.endsWith("PM"))
            hour += 12;
        return String.format("%02d", hour) + s.substring(2, 8);
    }

    public static String dayOfProgrammer(int year) {
//        int dayOfPgrm = 256;
//        if(year >= 1700 || year <= 2700){
//            String y = Integer.toString(year);
//
//            if (year / 4 == 0)
//            {
//                int res = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31;
//                res = dayOfPgrm - res;
//                System.out.println(res+".09."+year);
//
//            }
//            else if(year / 4 != 0)
//            {
//                int res = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31;
//                res = dayOfPgrm - res;
//                System.out.println(res+".09."+year);
//            }
//            else if(year == 1918){
//               int res = 31 + 14 + 31 + 30 + 31 + 30 + 31 + 31;
//                res = dayOfPgrm - res;
//                System.out.println(res+".09."+year);
//            }
//        }
        int dayOfPgrm = 256;
        String y = Integer.toString(year);
        String rest = null;
        if(year >= 1700 || year <= 2700){
            if (year / 4 == 0)
            {
                int res = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31;
                System.out.println(res);
                rest = dayOfPgrm - res+".01."+y;

//                 System.out.println(res+".09."+year);
            }
            else if(year / 4 != 0)
            {
                int res = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31;
                res = dayOfPgrm - res;
                System.out.println(res);
                rest = res +".02."+y;

            }
            else if(year == 1918){
                int res = 31 + 14 + 31 + 30 + 31 + 30 + 31 + 31;
                res = dayOfPgrm - res;
                rest = res+".03."+y;
            }
        }
        return rest;

    }


    public static void main(String[] args) {
        ArrayEasyQuestions demo = new ArrayEasyQuestions();
        int [] arr = {1, 3, 4, 5, 7,3,3} ;

/*
        boolean ans  = demo.keySegment(arr, 5,25);
        if (ans == true){
            System.out.println("YES");
            }
        else {
        System.out.println("NO");}
*/
//        demo.arrayReverse(arr);
//        demo.Kth_Largest(arr, 2);
//        demo.frequencyOfNumbers(arr,3);
//        demo.rangeandCoefficient(arr);

//        demo.unionAndIntersection(arr1,arr2);

//        System.out.println(demo.timeConversion("01:05:45PM"));
        System.out.println(demo.dayOfProgrammer(2017));
    }
}
