package com.hackerRank.problemSolving;

import java.util.Arrays;

public class Anagram {

    boolean isAnagram(String a, String b){

        char[] arr1 = a.toCharArray();
        char[] arr2 = b.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (arr1.length != arr2.length) {
            return false;
        }
        int i = 0;
        if(arr1[i] == arr2[i]) {
            while (i < arr1.length) {
                if (arr1[i] == arr2[i]) i++;

            }
            return true;
        }
        return false;
        }

    public static void main(String[] args) {

        Anagram ana = new Anagram();
        System.out.println(ana.isAnagram("b", "d"));
    }
}
