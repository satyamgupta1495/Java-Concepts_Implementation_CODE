package com.grind75;

//! https://leetcode.com/problems/valid-palindrome/description/
public class IsPalindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, ae canal: Panama";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        boolean flag = false;
        String newStr = s.strip().replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        if(newStr.length() <= 1) return true;
        int i = 0;
        int j = newStr.length()-1;
        System.out.println(newStr);

        while(i < j){
            if(newStr.charAt(i) == newStr.charAt(j)){
                flag = true;
                i++;
                j--;
            }else {
                break;
            }
        }
        return flag;
    }

//    public static void helper(String str, int i, int j){
//        if(i)
//    }
}
