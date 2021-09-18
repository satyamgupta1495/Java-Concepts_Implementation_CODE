package com.hackerRank.problemSolving;

import java.util.*;

public class DuplicateElements {

        static boolean containsDuplicate(int[] nums) {

            Set<Integer> set = new HashSet<>();
            for(int val : nums){

                if (set.contains(val)){
                    return true;
                }
                else{
                    set.add(val);

                }

            }
           return false;
        }


    public static void main(String[] args) {
        int [] arr = {1,2,3,4};
        boolean ans = containsDuplicate(arr);
        System.out.println(ans);
    }
}
