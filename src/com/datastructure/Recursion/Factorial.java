package com.datastructure.Recursion;

public class Factorial {

    int factorial(int n)
    {

        if (n == 0 || n == 1) return 1;
        else{
           return n*factorial(n-1);
        }

    }

    public static void main(String[] args) {

        Factorial fact = new Factorial();
        int res = fact.factorial(5);
        System.out.println(res);
    }
}
