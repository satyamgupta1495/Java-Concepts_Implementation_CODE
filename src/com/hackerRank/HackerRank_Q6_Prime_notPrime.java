package com.hackerRank;

import java.util.Scanner;

public class HackerRank_Q6_Prime_notPrime {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);) {
            System.out.println(scanner.nextBigInteger().isProbablePrime(100) ? "prime" : "not prime");
        }

//        todo REGEX KARNA HAI + exception handling
    }

}
