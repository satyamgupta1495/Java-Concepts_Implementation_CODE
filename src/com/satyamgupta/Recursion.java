package com.satyamgupta;

import java.util.Scanner;

public class Recursion {

//    static int fact(int n){
//        if (n==0 || n==1){
//            return 1;
//        }
//        else{
//            return n * fact(n-1);
//        }
//    }

//    static int fact(int n){
//   if (n==0 || n==1){
//       return 1;
//   }
//   else{
//       int product = 1;
//       for (int i = 1; i <= n; i++) {
//           product = product * i;
//       }
//      return  product;
//   }
//
//    }


    static int fact(int n){
        if (n==0 || n==1){
            return 1;
        }
        else{
            int res = 0;
            res = n * fact(n-1);
            return res;
        }
    }



    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int b = scan.nextInt();


        System.out.format("Factorial of %d is : %d",b, fact(b));
    }
}
