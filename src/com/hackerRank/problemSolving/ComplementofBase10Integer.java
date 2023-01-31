package com.hackerRank.problemSolving;

public class ComplementofBase10Integer {
    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(5));
        int n = 2100;
        int bin = Integer.parseInt(Integer.toBinaryString(n));
        String comp = getComplement(bin, Integer.toBinaryString(n).length());
        System.out.println(Integer.parseInt(comp, 2));


    }


    static String getComplement(int num, int len){
        String s = Integer.toString(num);
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < len; ++i){
            if (s.charAt(i) == '0'){
                sb.append("1");
            }else{
                sb.append("0");
            }
        }

        return sb.toString();
    }
}
