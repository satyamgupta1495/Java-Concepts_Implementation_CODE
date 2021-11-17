package com.datastructure.Recursion;

public class R4_ReverseNumber {
    public static void main(String[] args) {
        Integer n = 1234;
        int ans = reverse(n, n.toString().length());
        System.out.println(ans);
    }

    static int reverse(int n, double pow){

        if(n%10 == n) return n;
        return (n%10) *  (int)Math.pow(10,pow-1) +  reverse(n/10,pow-1);

    }

}
