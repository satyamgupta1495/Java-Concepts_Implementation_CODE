package com.hackerRank.problemSolving;

public class ReverseStringConstantSpace {

    static String swap(String str, int i, int j){
        StringBuilder sb = new StringBuilder(str);
        sb.setCharAt(i,str.charAt(j));
        sb.setCharAt(j,str.charAt(i));
        return sb.toString();
    }

    static String stringReverse(String s){
        int i = 0;
        int j = s.length()-1;
        while(i < j){
            j = s.length()-i-1;
            s = swap(s,i,j);
            i++;
            j--;
        }
        return s;
    }

    public static void main(String[] args) {
        String s = "Sat yam";
        String res = stringReverse(s);
        System.out.println(res);
    }
}
