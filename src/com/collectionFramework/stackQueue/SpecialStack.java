package com.collectionFramework.stackQueue;

import java.util.Stack;
public class SpecialStack {

    public static void main(String[] args) {


        int[][] a = new int[7][3];
        a[0][0] = 2;
        a[0][1] = 2;
        a[0][2] = 2;


        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length ; j++) {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }

    }
}
