package com.Java_Place_Practice;

public class Recurssion {

    static int rec(int n){
        if (n == 0){
            return 0;
        }
        else {
        int ans = n + rec(n-1);
        return ans;
    }}

    static void pattern(int n){
        if (n>0){
            pattern(n-1);
            for (int i = 0; i < n ; i++) {
                System.out.print("*");
            }
        }
        System.out.println(" ");
    }


    public static void main(String[] args) {
        int n = 4;
//        System.out.println(rec(n));
        pattern(4);
    }
}
