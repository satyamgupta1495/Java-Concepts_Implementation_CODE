package com.Java_Place_Practice;

import java.util.Scanner;

public class P3_Switch_Case {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String n = scan.next();
        switch (n) {
            case "a" : {
                System.out.println("This is the 1st case!");
                break;
            }
            case "b" :
                System.out.println("This is the 2nd case!");
                break;
            case "c" :
                System.out.println("This is the 3rd case!");
                break;
            default :
                System.out.println("This is a default case!");
                break;
        }

        String[] s = {"Jack", "Noah", "Trixie", "Dniel", "Satyam"};
        for(String element:s){
       //     System.out.println(element);
        }
    }





}
