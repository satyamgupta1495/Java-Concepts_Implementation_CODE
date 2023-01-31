package com.datastructure.Recursion;
import java.util.*;

public class R12_GenerateParanthesis {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        int o = 3;
        int c = 3;
        solve(o, c, "",list);
        System.out.println(list);
    }

    static void solve(int open, int close, String op, List<String> list){

        if(open == 0 && close == 0){
            list.add(op);
            return;
        }

        if(open != 0){
            String op1 = op;
            op1 += "(";
            solve(open-1, close, op1, list);
        }

        if(close > open){
            String op2 = op;
            op2 += ")";
            solve(open, close-1, op2, list);
        }
    }

//! ------------------------MY SOLUTION----------------------------

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
