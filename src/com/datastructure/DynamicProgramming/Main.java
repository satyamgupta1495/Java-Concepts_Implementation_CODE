package com.datastructure.DynamicProgramming;

import java.util.*;

public class Main {
    public static PriorityQueue<List<Integer>> res_queue = new PriorityQueue<>(
            (a,b) -> a.get(0)*a.get(1) - (b.get(0)*b.get(1))
    );

    public static List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        PriorityQueue<int[]> queue = new PriorityQueue<>(
                (a,b) -> a[0]*a[1] - (b[0]*b[1])
        );

        List<List<Integer>> result = new ArrayList<>();
        if(nums1.length == 0 || nums2.length == 0 || k==0){
            return result;
        }
        // Adding all the nums1 and nums2 first element to the array
        for(int i=0; i<nums1.length && i<k; i++){
            queue.offer(new int[]{nums1[i], nums2[0], 0});
        }

        while(k-- > 0 && !queue.isEmpty()){
            int[] cur = queue.poll();

            List<Integer> tempList = new ArrayList<>();
            tempList.add(cur[0]);
            tempList.add(cur[1]);
            res_queue.add(tempList);
            result.add(tempList);

            if(cur[2] == nums2.length - 1){
                continue;
            }

            queue.offer(new int[]{cur[0], nums2[cur[2]+1], cur[2]+1});
        }
        return result;
    }

    public static List<int[]> getPositiveNegativeArrays(int[] nums){

        int negLen = 0;

        for(Integer i: nums){
            if(i >= 0){
                break;
            }
            negLen++;
        }

        List<int[]> resultList = new ArrayList<>();
        int[] posArr = new int[nums.length - negLen];
        int[] negArr = new int[negLen];

        int j=0;
        for(int i=0; i < negLen; i++){
            negArr[j] = nums[i];
            j++;
        }

        j = 0;
        for(int i=negLen; i < nums.length; i++){
            posArr[j] = nums[i];
            j++;
        }

        resultList.add(negArr);
        resultList.add(posArr);
        return resultList;
    }


    public static void main(String[] args) {
        System.out.println("Hello World!");
        // [-2, -1, 0, 1, 2]
        int[] num1 = {-12, -8, -6, 7, 9};
        int[] num2 = {-3, -1, 0, 1, 2};


        List<int[]> resultList_1 = getPositiveNegativeArrays(num1);
        List<int[]> resultList_2 = getPositiveNegativeArrays(num2);

        System.out.println("--------");

        List<List<Integer>> l1 = kSmallestPairs(resultList_1.get(1), resultList_2.get(1), 3);
        List<List<Integer>> l2 = kSmallestPairs(resultList_1.get(1), resultList_2.get(0), 3);

        List<List<Integer>> l3 = kSmallestPairs(resultList_1.get(0), resultList_2.get(1), 3);
        List<List<Integer>> l4 = kSmallestPairs(resultList_1.get(0), resultList_2.get(0), 3);



        System.out.println(res_queue.poll().toString());
        System.out.println(res_queue.poll().toString());
        System.out.println(res_queue.poll().toString());
    }
}
