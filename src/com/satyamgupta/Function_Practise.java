package com.satyamgupta;

public class Function_Practise {

    // !PRINTING TABLE
//    static void mult(int n){
//        for (int i = 1; i <=10 ; i++) {
//
//            System.out.format("%d X %d = %d\n", n,i,n*i);
//        }
//    }
//
//    public static void main(String[] args) {
////        int n = 9;
////        mult(n);
//
//        add a = new add();
//
//        System.out.println(a.add(8,4));
//        System.out.println(add.factorial(4));
//        System.out.println(add.factR(10));
//
//    }
//}
//
//class add {
//    public int add(int a, int b) {
//        return a + b;
//    }
//
//    static int factorial(int n) {
//        if (n == 0 || n == 1) {
//            return 1;
//        } else {
//            int product = 1;
//            for (int i = 1; i <= n; i++) {
//                product = product * i;
//            }
//            return product;
//        }
//
//    }
//
//    static int factR(int x) {
//        if (x == 0 || x == 1) {
//            return 1;
//        } else {
//            int factR = x * factR(x - 1);
//            return factR;
//        }
//
//    }



    //! PROBLEM 3 RECURSIVE FUNCTION

    //? ITERATIVE METHOD
//    static int sum(int n){
//        int sum = 0;
//        for (int i = 0; i <= n; i++) {
//            sum = sum + i;
//        }
//        return sum;
//    }
    //? RECURSIVE METHOD

//    static  int sum(int n){
//
//        if (n == 1){
//            return 1;
//        }
//        else
//        return n + sum(n-1);
//    }

    //! PROBLEM PATTERN 1
//    static void pattern(int n){
//
//        for (int i = 0; i < n; i++) {  //? number of ROWS
//            for (int j = 0; j < i+1; j++) {         //? NUMBER KITNI BARR STAR PRINT KRNA HAI
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }

    //! PROBLEM PATTERN 2

    static void patternRev(int n){
        for (int i = n; i > 0; i--) {
//            System.out.println("number of rows " + i);       //? number of ROWS
            for (int j = i ; j > 0; j--) {         //? NUMBER KITNI BARR STAR PRINT KRNA HAI
//                System.out.print("number of stars " + j);
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //! PROBLEM 6 FIBONACCI SERIES

//    static int fib(int n) {
//        if (n == 1 || n == 2) {
//            return n-1;
//        }
//        else {
//            return fib(n - 1) + fib(n - 2);
//        }
//    }


//    !PROBLEM 8 PATTERN 2 USING RECURSION
    static void pattern1Rec(int n){

        if (n>0){
            pattern1Rec(n-1);
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }


    public static void main(String[] args) {
//        patternRev(3);
//        System.out.println(sum(5));
//        System.out.println(fib(5));
        pattern1Rec(5);
        
    }



}