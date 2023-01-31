package com.hackerRank.problemSolving;

public class AddDigits {
    public static void main(String[] args) {
        int n = 34598;
        System.out.println(add(n));

    }

    static int add(int n){
        String s = String.valueOf(n);
        int sum = 0;
        for(char ch : s.toCharArray()){
            sum += Character.getNumericValue(ch);
        }
        return Integer.toString(sum).length() > 1 ? add(sum) : sum;
    }


    class Solution {
        public int addDigits(int num) {
            if(num == 0) return 0;
            if(num%9 == 0) return 9;
            return num%9;
        }
    }

}
