package com.hackerRank.problemSolving;

import java.util.Arrays;

public class TrappingRainWater {
    public static void main(String[] args) {
        int[] arr = {4,2,0,3,2,5};
        trap(arr);
    }
    static int trap(int[] height) {

        int count = 0;
        int max = height[0];
        int[] left = new int[height.length];
        int[] right = new int[height.length];

        for(int val : height){
            if(val > max){
                max = val;
            }
            left[count] = max;
            count++;
        }
        max = height[height.length-1];
        count = height.length-1;
        for(int i = height.length-1; i >= 0; i--){
            if(height[i] > max){
                max = height[i];
            }
            right[count] = max;
            count--;
        }

        int ans = 0;
        for(int i = 0 ; i < height.length; i++){
            ans += Math.abs(Math.min(left[i],right[i]) - height[i]);
        }

        //! For debugging Purposes
        System.out.println(Arrays.toString(height));
        System.out.println(Arrays.toString(left));
        System.out.println(Arrays.toString(right));
        System.out.println(ans);

        return ans;

    }
}
