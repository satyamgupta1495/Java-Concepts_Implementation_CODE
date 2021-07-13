package com.Java_Place_Practice;

import java.util.Random;
import java.util.Scanner;

public class P4_Rock_Paper_Scissor {
    public static void main(String[] args) {
        Random rand = new Random();
        int c = rand.nextInt(2);

        System.out.println("0 -> Rock , 1 -> Paper , 2 -> Scissor ");
        System.out.print("Enter your choice : ");


        Scanner scan = new Scanner(System.in);
        int p = scan.nextInt();

        if (c == 0 && p == 1 ){
            System.out.println("Computer : Rock \n " + "You Win ");
        }
        else {
            System.out.println("You Loose!");
        };
        if (c == 0 && p == 2 ){
            System.out.println("Computer : Rock \n " + "You Loose ");
        }
        else {
            System.out.println("You Win!");
        };

        }

    }
