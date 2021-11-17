package com.datastructure.Recursion;

public class R1_Product1toN {

    public static void main(String[] args) {
        printProduct(5);
    }

    static void printProduct(int n){
        if(n < 1) return;
        printProduct(n-1);
        System.out.println(n*n);
    }
}
