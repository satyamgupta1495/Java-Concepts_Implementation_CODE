package com.satyamgupta;

import java.util.Random;
import java.util.Scanner;

public class Rock_Paper {

    public static void main(String[] args) {
        System.out.println("Choose 0 for Rock");
        System.out.println("Choose 1 for Scissor");
        System.out.println("Choose 2 for Paper");
        int i=0 ;
        while (i < 5) {
            i = i+1;
            Scanner scan = new Scanner(System.in);
            int b = scan.nextInt();
            Random rn = new Random();
            int a = rn.nextInt(2);

            if (a == 0 && b == 0) {
                System.out.println("Computer choosed Scissor");
                System.out.println("YOU WON!!");
            } else if (a == 1 && b == 0) {
                System.out.println("Computer choosed ROCK");
                System.out.println("DRAW!!");
            } else if (a == 2 && b == 0) {
                System.out.println("Computer choosed PAPER");
                System.out.println("YOU LOOSE!!");
            } else if (a == 1 && b == 1) {
                System.out.println("Computer choosed ROCK");
                System.out.println("YOU LOOSE!!");
            } else if (a == 2 && b == 1) {
                System.out.println("Computer choosed PAPER");
                System.out.println("YOU WON!!");
            } else if (a == 0 && b == 1) {
                System.out.println("Computer choosed Scissor");
                System.out.println("DRAW!!");
            } else if (a == 0 && b == 2) {
                System.out.println("Computer choosed Scissor");
                System.out.println("YOU LOOSE!!");
            } else if (a == 2 && b == 2) {
                System.out.println("Computer choosed PAPER");
                System.out.println("YOU WON!!");
            } else if (a == 1 && b == 2) {
                System.out.println("Computer choosed ROCK");
                System.out.println("YOU LOOSE!!");

            }
        }
    }
}
