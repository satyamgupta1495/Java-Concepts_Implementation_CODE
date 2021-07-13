package com.Java_Place_Practice;

import java.util.Scanner;

public class P3_Switch_Case {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String n = scan.nextLine();
        switch (n) {
            case "a" -> System.out.println("This is the 1st case!");
            case "b" -> System.out.println("This is the 2nd case!");
            case "c" -> System.out.println("This is the 3rd case!");
            default -> System.out.println("This is a default case!");
        }

        String[] s = {"Jack", "Noah", "Trixie", "Dniel", "Satyam"};
        for(String element:s){
            System.out.println(element);
        }
    }





}
