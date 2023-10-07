package com.datastructure.Recursion.recursionBasic;

public class Practise {

    public static void main(String[] args) {
        String s = "Satyam";
        int[] arr = {2,3,4,5,6,7,8};
//        reverseString(s, s.length());
//        System.out.println(fibbonacci(7));
//        System.out.println(binarySearch(arr, 0, arr.length-1, 6));
        int res = 0;
//        System.out.println(factorial(7, res));
        System.out.println("Ans - " + sumOfNumbers(1235));
    }

    public static void reverseString(String s, int n){
        if(n < 1) return;
        reverseString(s, n-1);
        System.out.println(n);
        System.out.print(s.charAt(n-1));
        return;
    }

    public static int fibbonacci(int n){
        if(n <= 1) return n;
        int res = fibbonacci(n-1) + fibbonacci(n-2);
        return res;

    }

    public static int factorial(int n, int res){
        if(n == 1) return 1;
        return res = n * factorial(n-1, res);
    }

    public static int sumOfNumbers(int n){
        if(n == 0) return 0;
        System.out.println("n = " + n);
        return (n %10) + sumOfNumbers(n/10);
    }

    public static int binarySearch(int[] arr, int s, int e, int target){
        if(s > e){
            return -1;
        }

        int mid = s + ((e-s)/2);
        if(arr[mid] == target){
            return mid;
        }
        if(target < arr[mid]  ){
            return binarySearch(arr,  s,mid-1, target);
        }
        return binarySearch(arr, mid+1, e, target);
    }

}
