package com.satyamgupta;

public class Continue_and_Break {
    public static void main(String[] args) {

        for (int i = 0; i < 10 ; i++) {
            if (i == 4 || i == 8){
//                continue;
                break;
            }
            System.out.println(i);
        }
    }
}
