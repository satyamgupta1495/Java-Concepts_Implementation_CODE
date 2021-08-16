package com.hackerRank.Arrays;

public class PrimeNumbers {

    static boolean isPrime(int num){
        int c = 2;
        if(num <=1){
            return false;
        }

        while(c*c <= num){
            if (num % c == 0){
                return false;
            }
            c++;
        }

        return c*c > num;

    }

    public static void main(String[] args) {

        System.out.println(isPrime(4));

    }
}
