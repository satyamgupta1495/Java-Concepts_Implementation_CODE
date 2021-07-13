package com.hackerRank;

import java.io.Serializable;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

import static java.util.Locale.*;


public class HackerRank_Q2 {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                double payment = scanner.nextDouble();
                scanner.close();

        Locale indiaLocale = new Locale("en","IN");

                NumberFormat ns = NumberFormat.getCurrencyInstance(US);
                NumberFormat nc = NumberFormat.getCurrencyInstance(CHINA);
                NumberFormat nf = NumberFormat.getCurrencyInstance(FRANCE);
                NumberFormat in = NumberFormat.getCurrencyInstance(indiaLocale);

//                String us = ns.format(payment);
                String india = in.format(payment);
                String china = nc.format(payment);
                String france = nf.format(payment);

                System.out.println("US: " + ns.format(payment));
                System.out.println("India: " + india);
                System.out.println("China: " + china);
                System.out.println("France: " + france);
            }
        }

