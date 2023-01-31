package com.datastructure.Recursion;

import java.util.*;

public class Solution {

    public static void main(String[] args){
        int n = 3;
        List<String> list = new ArrayList<>();
        int o = n-1;
        int c = n;


        generateParanthesis("", o, c, n*2, list);
        System.out.println(list);
    }

    static void generateParanthesis(String op, int o, int c, int n, List<String> list){
        if(n == 0){
            if(isValid(op)){
                list.add(op);

            }
            return;
        }

        String op1 = op;
        String op2 = op;

        op1 += "(";
        op2 += ")";

        generateParanthesis(op1, o-1, c-1, n-1, list);
        generateParanthesis(op2, o-1, c-1, n-1, list);
    }

    static boolean isValid(String s){

        Stack<Character> st = new Stack<>();
        for (char ch : s.toCharArray()) {

            if(ch == '('){
                st.push(ch);
            }else if(st.empty()){
                return false;
            }else if(ch == ')' && st.pop() != '('){
                return false;
            }

        }
        return st.empty();
    }


}