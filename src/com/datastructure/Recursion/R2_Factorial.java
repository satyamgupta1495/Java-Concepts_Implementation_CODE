package com.datastructure.Recursion;

public class R2_Factorial {
    public static void main(String[] args) {
//        System.out.println(printFactorial(5));
        printFactorial(5);
    }

    static int printFactorial(int n){
        if(n < 1) return 1;
        int ans = n * printFactorial(n-1);
        System.out.println(ans);
        return ans;
//        return n * printFactorial(n-1);
    }
 }
