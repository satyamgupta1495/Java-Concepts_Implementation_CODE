package com.hackerRank.problemSolving;

import java.util.HashMap;

public class ContiguousArray {
    public static void main(String[] args) {

        int[] nums = { 0,1,0,0,1,0};

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                nums[i] = -1;
            }
        }

        int sum = 0;
        int max = 0;

        System.out.println(map);
        for(int i = 0; i < nums.length; ++i){
            sum += nums[i];
            if (sum == 0){
                max = Math.max(max, i+1);
            }

            if(map.containsKey(sum)){
                int last = map.get(sum);
                System.out.println(map.get(sum));
                max = Math.max(max, i-last);
            }else{
                map.put(sum, i);
            }
        }
        System.out.println(map);
        System.out.println(max);
    }
}
