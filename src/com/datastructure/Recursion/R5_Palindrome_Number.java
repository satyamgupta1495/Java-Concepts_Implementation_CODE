package com.datastructure.Recursion;

public class R5_Palindrome_Number {
    public static void main(String[] args) {

        int n = 5335;
        int m = reverse(n,4);
        System.out.println(n == m);


    }

    static int reverse(int n, double pow){

        if(n%10 == n) return n;
        return (n%10) *  (int)Math.pow(10,pow-1) +  reverse(n/10,pow-1);

    }

}
