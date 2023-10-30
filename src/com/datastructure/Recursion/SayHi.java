package com.datastructure.Recursion;

public class SayHi {

    public static void skipChar(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        if(up.charAt(0) == 'a'){
            skipChar(p, up.substring(1));
        }else{
            skipChar(p + up.charAt(0), up.substring(1));
        }
    }
    public static String skipChar(String up){
        if(up.isEmpty()){
            return "";
        }
        char ch = up.charAt(0);

        if(up.charAt(0) == 'a'){
            return skipChar(up.substring(1));
        }else{
            return ch + skipChar(up.substring(1));
        }
    }


    public static void main(String[] args) {
        String p = "";
        String up = "abcaahdab";
        String ans = skipChar(up);
        System.out.println(ans);
    }
}
