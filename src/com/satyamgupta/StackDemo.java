package com.satyamgupta;

import java.util.Stack;

public class StackDemo {

    static boolean validParenthesis(String str){
        Stack st = new Stack();

        char[] ch = str.toCharArray();

        for (int i = 0; i < str.length(); i++) {
            if (ch[i] == '(' || ch[i] == '{' || ch[i] == '[') {
                st.push(ch[i]);
            }
            else{
                if (st.isEmpty()) return false;
                char temp = (char)st.peek();
                st.pop();
                if (ch[i] == ')' && temp == '(' || ch[i] == '}' && temp == '{' || ch[i] == ']' && temp == '[' ){
                    return true;
                }
                else return false;
            }
        }
        return st.isEmpty();
    }

    public static void main(String[] args) {
        String str = "(){}}{";
        boolean ans = validParenthesis(str);
        System.out.println(ans);


    }
}
