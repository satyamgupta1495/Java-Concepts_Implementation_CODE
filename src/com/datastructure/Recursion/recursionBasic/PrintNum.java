package com.datastructure.Recursion.recursionBasic;

public class PrintNum {
    public static void main(String[] args) {
        printNum(5);
    }

    static  void printNum(int n){

        if (n > 0)
        printNum(n-1);

        System.out.println(n);
    }
}
