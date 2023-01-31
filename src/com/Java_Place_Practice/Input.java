package com.Java_Place_Practice;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean flag = false;
        int T = scan.nextInt();
        for(int i = 0; i < T; ++i){
            String s1 = scan.nextLine();
            for (int j = 0; j < s1.length(); j++) {
                    flag = Character.isDigit(s1.charAt(i));
                System.out.println(s1.charAt(i) + " " + flag);
                    break;

            }


        }

        if(flag){
            System.out.println("No");
        }else System.out.println("Yes");
    }
}
