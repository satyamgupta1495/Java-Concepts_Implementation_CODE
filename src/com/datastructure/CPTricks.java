package com.datastructure;

import java.util.Arrays;

public class CPTricks {
    public static void main(String[] args) {

        //! POWER
        //System.out.println(fastPower(3,5));

        //! PRIME NOT-PRIME
//        int n = 20;
//        boolean[] ans = seiveOfEratosthenes(n);
//        for (int i = 0; i < n; i++) {
//            System.out.println(i + " " +ans[i]);
//        }
        //! GCD
        System.out.println(myMod(2, 7));
    }



    static int trailingZeros(int n){
        int res = 0;
        for (int i = 5; i <= n ; i*=5) {
            res = res + n / i;
        }
        return res;
    }
/*
    GCD (a,b) = gcd(a-b, b)
        OR
    GCD (a,b) = GCD(b, a%b)
        where a % b != 0
 */
    static int gcd(int a, int b){

        if (b == 0) {
            return a;
        }
        return gcd(b, a%b);
    }

    static boolean[] seiveOfEratosthenes(int n){
        boolean[] isPrime = new boolean[n+1];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;
        for (int i = 2; i * i <= n; i++) {
            for (int j = 2*i; j <= n ; j+=i) {
                isPrime[j] = false;
            }
        }
        return isPrime;
    }

    static int fastPower(int a, int b){
        int res = 1;
        while(b > 0){
            if ((b&1) != 0) {   //! check for EVEN or ODD
                                //? even -> last bit == 0
                res = res * a;
            }
            a =a*a;
            b = b >> 1; //! divide by 2 ;)
        }
        return res;
    }

    static int myMod(int a, int b){

        if(b == 0) return a;

        return myMod(b, a%b);

    }

}
