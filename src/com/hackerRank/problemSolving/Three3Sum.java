package com.hackerRank.problemSolving;

import java.util.*;

public class Three3Sum {
    public static void main(String[] args) {
//        int[] nums = {-2,-2,-1,-1,-1,0,0,0,2,2,2};
        int[] nums = {-1,0,1,2,-1,-4};
        System.out.println(get3Sum(nums));
    }

    static List<List<Integer>> get3Sum(int[] nums){
        Arrays.sort(nums);

        List<List<Integer>> res = new ArrayList<>();

        for(int i = 0; i < nums.length-2; ++i){
            if (i == 0 || nums[i] != nums[i - 1]){
                int lo = i+1;
                int hi = nums.length-1;
                int sum = -nums[i];

                while(lo < hi){
                    if (nums[lo] + nums[hi] == sum){
                        res.add(Arrays.asList(nums[i], nums[lo], nums[hi]));

                    //! There are 2 possibilities
                        //? 1-> I'll get the triplets
                        //? 2 -> I'll not get the triplets

                    //* I'll not get the triplets
                    while(lo < hi && nums[lo] == nums[lo+1]) lo++;
                    while(lo < hi && nums[hi] == nums[hi-1]) hi--;

                    //* I'll get the triplets
                        lo++;
                        hi--;
                    }else if(nums[lo] + nums[hi] > sum){
                        lo++;
                    }else{
                        hi--;
                    }
                }
            }
        }
        return res;
    }

}
