package com.hackerRank.problemSolving;

public class Palindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome2(s));
    }
    static boolean isPalindrome(String s) {
        String ans = s.toString().strip().toLowerCase().replaceAll("[^a-zA-Z0-9]","");
        StringBuilder sb = new StringBuilder();
        for(char ch : ans.toCharArray()){
            sb.append(ch);
        }
        sb = sb.reverse();
        return sb.toString().equals(ans);
    }

    static boolean isPalindrome2(String s) {
        String ans = s.toString().strip().toLowerCase().replaceAll("[^a-zA-Z0-9]","");
        System.out.println(ans);

        for(int i = 0; i < ans.length()/2; ++i){
            int j =  ans.length()-i-1;
            System.out.println(ans.charAt(i));
            System.out.println(ans.charAt(j));

            if(ans.charAt(i) != ans.charAt(j)){
                return false;
            }

        }

        return true;
    }
}
