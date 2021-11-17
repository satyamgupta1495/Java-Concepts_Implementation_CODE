package com.datastructure.Recursion;

import java.util.HashSet;
import java.util.Set;

public class R11_LetterCasePermutation {

        public static void main(String[] args) {
            String s = "C";
            Set<String> set = new HashSet<>();
            permute(s, "", s.length(), set);
            System.out.println(set);
        }

        static void permute(String ip, String op, int n, Set<String> set){
            if (n == 0) {
                // System.out.println(op);
                set.add(op);
                return;
            }
            String op1 = op;
            String op2 = op;
            if(Character.isDigit(ip.charAt(0))){
                op1 +=  " " + ip.charAt(0);
                op2 +=  " " + ip.charAt(0);
            }else{
                op1 +=  " " + Character.toString(ip.charAt(0)).toLowerCase();
                op2 +=  " " + Character.toUpperCase(ip.charAt(0));
            }
            ip = ip.substring(1);
            permute(ip, op1, n-1, set);
            permute(ip, op2, n-1, set);
        }
}


