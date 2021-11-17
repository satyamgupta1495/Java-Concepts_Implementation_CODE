package com.datastructure.Recursion;

public class R10_PermutationWithSpaces {
    public static void main(String[] args) {
        String s = "ABC";

        spacesPermute(s.substring(1), s.substring(0,1), s.length()-1);

    }
    static void spacesPermute(String ip, String op, int n){
        if (n == 0){
            System.out.println(op);
            return;
        }
        String op1 = op;
        String op2 = op;

        op1 += ip.charAt(0);
        op2 += "_" + ip.charAt(0);
        ip = ip.substring(1);

        spacesPermute(ip, op1, n-1);
        spacesPermute(ip, op2, n-1);
    }

}
