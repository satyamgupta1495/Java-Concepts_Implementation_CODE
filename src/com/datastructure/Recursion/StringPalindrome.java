package com.datastructure.Recursion;

public class StringPalindrome {

    boolean palindrome(String s, int i)
    {
        if (i >= s.length()/2)  return true;

        if (s.charAt(i) == s.charAt(s.length()-i-1)){
               return palindrome(s, i+1);

            }
            return false;
    }

    public static void main(String[] args) {

        StringPalindrome string = new StringPalindrome();
        System.out.println(string.palindrome("MAM",0));


    }
}
