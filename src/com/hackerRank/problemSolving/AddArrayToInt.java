package com.hackerRank.problemSolving;

import java.util.*;

public class AddArrayToInt {
    static void addToArrayForm(int[] num, int k) {

        List<Integer> list= new ArrayList<>();
        int nums = 0;
        for(int i = 0; i < num.length; i++){
            nums = nums * 10 + num[i];
        }
        nums += k;
        System.out.println(nums);

        while(nums !=0){
            list.add(nums%10);
            nums = nums / 10;
        }
        Collections.reverse(list);
        System.out.println(list);

    }

    public static void main(String[] args) {
        int[] arr = {9,9,9,9,9,9,9,9,9,9};
//        int[] arr = {1,2,0,0};
        List<Integer> list = new ArrayList<>();
        addToArrayForm(arr,34);

    }
}
