package com.hackerRank.problemSolving;

import java.util.*;

public class KthLargestElement {




    static int findKthLargest(int[] nums, int k) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        System.out.println(nums.length + " isab");
        for (int val:nums) {
            pq.offer(val);
            System.out.println(pq);
            if (pq.size() > k){
                System.out.println("Deleted => " + pq.poll());
                pq.poll();
            }
        }

        System.out.println("Final -> " + pq.poll());
        return  pq.poll();
    }


    static int thirdlargest(int[] nums) {


                Integer max1 = null;
                Integer max2 = null;
                Integer max3 = null;

                for(Integer num : nums){
                    if(num.equals(max1) || num.equals(max2) || num.equals(max3)){
                        continue;
                    }

                    if(max1 == null || num > max1){
                        max3 = max2;
                        max2 = max1;
                        max1 = num;
                    }
                    else if(max2 == null || num > max2){
                        max3 = max2;
                        max2 = num;
                    }
                    else if(max3 == null || num > max3){
                        max3 = num;
                    }

                }

                return max3 == null ? max1 : max3;

            }




    public static void main(String[] args) {

        int[] array = {3,2,1};
//        System.out.println(Arrays.toString(array));
//        findKthLargest(array,4);

//        int[] array = {1,2};
//        int ans = thirdMax(array);
//        System.out.println(ans);

        Integer i = 20;



    }
}
