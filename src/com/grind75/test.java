package com.grind75;

public class test {
    public static void main(String[] args) {

        StringBuilder s = new StringBuilder("babad");

        String res = longestPalindrome(s.toString());
        System.out.println(res);

    }

    public static String longestPalindrome(String s){

        //b a b a d

        int start = 0, end = 0;

        for (int i = 0; i < s.length(); i++) {
            int len1 = expandFromCenter(s, i, i);
            int len2 = expandFromCenter(s, i, i+1);
            int len = Math.max(len1, len2);

            if(end-start < len){
                start = i - (len-1)/2;
                end = i + len/2;

            }
        }

        return s.substring(start, end+1);

    }

    private static int expandFromCenter(String s, int i, int j) {

        while (i > 0 && j < s.length() && s.charAt(i) == s.charAt(j)){
            i--;
            j++;
        }

        return j-i-1;

    }
}
