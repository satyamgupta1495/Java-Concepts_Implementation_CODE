package com.datastructure.DynamicProgramming;

public class PrintSubSet {
    public static void main(String[] args) {
//        String s = "abc";
//        print(s,"", s.length());



    }

    static void print(String a, String op, int n){

        if (n == 0){
            System.out.println(op);
            return;
        }

        String o1 = op;
        String o2 = op;

        o1 += a.charAt(0);
        a = a.substring(1);

        print(a,o1,n-1);
        print(a,o2,n-1);

    }

}
