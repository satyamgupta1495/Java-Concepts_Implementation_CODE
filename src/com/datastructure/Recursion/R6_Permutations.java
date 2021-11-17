package com.datastructure.Recursion;

import java.util.*;


public class R6_Permutations {

    static HashSet<String> res = new HashSet<>();
    public static void main(String[] args) {

    List<List<Integer>> numAns = new ArrayList<>();
        int[] nums = {1,2,3};

        permuteNumber(nums,0, nums.length-1, numAns);


        System.out.println(numAns);
//        System.out.println(numAns);
    }

    static void permuteNumber(int[] nums, int s, int e, List<List<Integer>> numAns){
        if (s == e){
            ArrayList<Integer> ans = new ArrayList<>();
            for (int val: nums) {
                ans.add(val);
            }
            numAns.add(ans);

            return;
        }

        for (int i = s; i <= e ; i++) {
            nums = swapNo(nums, s, i);
            permuteNumber(nums, s+1, e, numAns);

            nums = swapNo(nums, s, i);
        }

    }

    static int[] swapNo(int[] nums, int s, int e) {
        int temp = nums[s];
        nums[s] = nums[e];
        nums[e] = temp;

        return nums;
    }

    static void permute(String s, int l, int r){
        if (l == r) {
            System.out.println(s);
            return;
        }

        for (int i = l; i <= r ; i++) {
            s = swap(s,l, i);
            permute(s,l+1, r);
            res.add(s);
            s = swap(s,l, i);

        }
    }

    static String swap(String s, int l, int r){
        StringBuilder sb = new StringBuilder(s);
        char temp = s.charAt(l);
        sb.setCharAt(l, sb.charAt(r));
        sb.setCharAt(r, temp);
        return sb.toString();
    }


}
