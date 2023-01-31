package com.hackerRank.problemSolving;

import java.util.*;

public class ValidPalindromeII {

    public static void main(String[] args) {

        int[] nums = {5,4,3,2,1};
        int[] res = Arrays.copyOfRange(nums, 2,4);
        Collections.reverse(Arrays.asList(res));
        System.out.println(Arrays.toString(res));


    }


}
