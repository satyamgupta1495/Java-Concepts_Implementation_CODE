package com.datastructure;

import java.util.Scanner;

public class BuildingStrings {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            if (scanner.next() == " ") sb = sb.append(" ");
            else sb = sb.append(scanner.next());
        }
        System.out.println(sb);

    }



}
