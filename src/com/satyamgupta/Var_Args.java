package com.satyamgupta;

public class Var_Args {

    //! is it a right way of creating an method for adding?

//    static  int sum(int a, int b){
//        return a+b;
//    }
//    static  int sum(int a, int b,int c){
//        return a+b+c;
//    }

// ? ... -> Array mein pack kr k dega ye!

//    static  int sum(int ...arr){
//        int result = 0;
//        for (int a: arr) {
//            result = result +a;
//        }
//
//        return result;
//    }

    //! ONE COMPULSORY ARGUEMENT
    static  int sum(int x, int ...arr){
        int result = 0;
        for (int a: arr) {
            result = result +a;
        }

        return result;
    }


    public static void main(String[] args) {
       // System.out.println("Sum of 2 and 3 is : " + sum(2,3));
      // System.out.println("Sum of 6, 7 and 8 is : " +sum(6, 7, 8));
       System.out.println("Sum of 6, 7, 54 and 8 is : " +sum(6, 54,7, 8));


    }
}
