package com.hackerRank.problemSolving;

public class Pattern {
    public static void main(String[] args) {
        pattern(5);
    }

    static void pattern(int n){
        char ch = 'a';
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i && ch < 'z'; j++) {
                if (count % 2 != 0){
                    System.out.print(Character.toUpperCase(ch) + " ");
                }
                else{
                    System.out.print(ch + " ");
                }
                ch++;
                count++;
            }
            System.out.println();
        }
    }
}
