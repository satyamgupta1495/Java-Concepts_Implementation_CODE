package com.Java_Place_Practice;

import java.lang.reflect.Type;
import java.util.Arrays;

public class P5_Multi_dim_arrays {
    public static void main(String[] args) {
        int[][] flat = {{101,102}, {103,104}, {201,202}, {203,204}};
        String[][] arr = {{"Ferrari","Lamborghini"}, {"Tata","Mahindra"}, {"Bugati","Ducati"}} ;
        String[][] name = {{"Mr.", "Mrs."}, {"Joe", "Smith"}};
//
//        System.out.println(name[0][0]+ " " + name[1][0]);
//        System.out.println(name[0][1]+ " " + name[1][1] );

//        for (int i = 0; i < flat.length; i++) {
//            for (int j = 0; j < flat[i].length; j++) {
//                System.out.print(flat[i][j] + " ");
//            }
//            System.out.println("  ");
//        }

//        !Cars
//        for (int i = 0; i < arr.length ; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.println(arr[i][j]);
//            }
//            System.out.println(" ");
//        }

//        !Copying Array

        char[] copyFrom = {'u','p','t','s','a','t','y','a','m'};
        char[] copyto = new char[6];
        System.arraycopy(copyFrom,3,copyto,0,6);
        System.out.println(new String(copyto));

//        String a = Arrays.toString(copyFrom);
//        System.out.println(a);
//        System.out.println(a.getClass());

        String f = "Fame" ;

        char[] r = new char[10];


        for (int i = 0; i < f.length() ; i++) {
                r[i] = f.charAt(i);
        }
        System.out.println(r.getClass());

    }


}
