package com.satyamgupta;

import java.util.Scanner;

public class Exception_PractiseSet {
    public static void main(String[] args) {

//          !Problem
//        try{
//            int a = /0;
//        }
//        catch (IllegalArgumentException e){
//            System.out.println("HaHa!");
//        }
//        catch (ArithmeticException e){
//            System.out.println("HeHe!");
//        }

//!        PROBLEM 3
        int[] marks = {4,5,7,8,1};
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int index;
        while (flag && i<5){
            try {
                System.out.println("Enter the value of index = ");
                index = sc.nextInt();
                System.out.println("The value of index is = "+marks[index]);
                break;
            }
            catch (Exception e){
                System.out.println("Invalid index!");
                i++;
            }
        }
        if (i>5){
            System.out.println("error");
        }
    }
}
