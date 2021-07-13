package com.Java_Place_Practice;

public class p6_Practice_Q {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(j);
            }
            System.out.println(" ");
        }
        for (int k = 9; k >= 6 ; k--) {
            for (int l = k; l > 5 ; l--) {
                System.out.print(l);
            }
            System.out.println(" ");
        }



    }
}
