package com.datastructure.Recursion;

public class Palindrome {

    boolean palindromeOrNot(String string)
    {
        if (string.length() == 0 || string.length() == 1) return true;

        if (string.charAt(0) == string.charAt(string.length()-1))
            return palindromeOrNot(string.substring(1, string.length()-1));

        return false;

    }

    public static void main(String[] args) {

        String s = "MiAM";

        Palindrome p = new Palindrome();
        System.out.println(p.palindromeOrNot(s));

    }
}
