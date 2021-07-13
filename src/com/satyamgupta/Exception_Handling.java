package com.satyamgupta;

import java.util.*;

public class Exception_Handling {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int num = scan.nextInt();
        int num2 = scan.nextInt();
        try{
            System.out.println(num/num2);
        }
        catch (ArithmeticException e){
            System.out.println("ArithmeticException error occured! "+e.getMessage());
        }
    }
}
