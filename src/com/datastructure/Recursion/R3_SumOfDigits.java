package com.datastructure.Recursion;

public class R3_SumOfDigits {
    public static void main(String[] args) {

        int n = 99;
        int sum = 0;
        int prod = 0;
        System.out.println("Sum of digit " + "n "+  "is " + getSum(n, sum));
        System.out.println("Product of digit " + "n "+  "is " + getProduct(n, prod));

    }


    static int getSum(int n, int sum){
        if(n == 0) return 0;

        sum = n%10 + getSum(n/10,sum);
        return sum;

    }
    static int getProduct(int n, int prod){
        if(n%10 == n) return n;

        prod = n%10 * getProduct(n/10,prod);
        return prod;

    }



}
