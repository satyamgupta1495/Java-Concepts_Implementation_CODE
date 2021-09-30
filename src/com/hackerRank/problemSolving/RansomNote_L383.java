package com.hackerRank.problemSolving;

import java.util.*;

public class RansomNote_L383 {
    public static void main(String[] args) {
        String ransomNote = "aa";
        String magazine = "aabb";
        System.out.println(canConstruct(ransomNote,magazine));

        Scanner scan = new Scanner(System.in);

        String s, t= null;


        s = scan.nextLine();
        scan.next();
        t = scan.nextLine();

        anagram(s,t);
        System.out.println(s);
        System.out.println(t);

    }

    static void anagram(String s, String t){
        Scanner scan = new Scanner(System.in);

        s = scan.next();
        scan.nextLine();
        t = scan.next();



        if(s.length() != t.length()) System.out.println("Not Anagram") ;
        int[] hash = new int[26];
        boolean flag = true;
        for (char c : s.toCharArray())
            ++hash[c-'a'];
        for (char c : t.toCharArray())
            if (--hash[c-'a'] < 0)
                flag = false;

        if (flag){
            System.out.println("Anagram");
        }
        else {
            System.out.println("Not Anagram");
        }

    }
    static boolean canConstruct(String ransomNote, String magazine) {

        int[] hash = new int[26];
        boolean flag = true;
        System.out.println(Arrays.toString(hash));

        for (char ch:ransomNote.toCharArray()) {
            ++hash[ch - 'a'];

        }
        System.out.println(Arrays.toString(hash));
        for (char ch:ransomNote.toCharArray())
            if (--hash[ch - 'a'] < 0)
                flag = false;

        System.out.println(Arrays.toString(hash));

        return flag;

    }
}
