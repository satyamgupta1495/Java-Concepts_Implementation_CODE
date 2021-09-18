package com.hackerRank.problemSolving;


import java.util.*;

public class IntersectionOfTwoArray {

    public static void main(String[] args)
    {
        int[] nums1 = {9,4,4,9,9,2,1}, nums2 = {9,4,4,2};

//        int[] nums1 = {4,9,5}, nums2 = {9,4,9,8,4};
        System.out.println(Arrays.toString(intersect(nums1,nums2)));
    }

    static int[] intersect(int[] nums1, int[] nums2) {

        if(nums1.length > nums2.length){
            return intersect(nums2, nums1);
        }

        Map<Integer, Integer> map = new HashMap<>();

        for(int num : nums1){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        System.out.println("Map -> " + map);
        List<Integer> list = new ArrayList<>();
        for(int num : nums2){
            int count = map.getOrDefault(num, 0);
            System.out.println("count -> " + count );
            if(count > 0){
                list.add(num);
                System.out.println(num);
                map.put(num, count-1);
            }
        }
        System.out.println("List -> " + list);
        int[] res = new int[list.size()];
        int i = 0;
        for(int num : list){
            res[i++] = num;
        }
        return res;
    }

    public int[] intersect2(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i = 0;
        int j = 0;

        List<Integer> list = new ArrayList<>();


        while(i < nums1.length && j < nums2.length)
        {
            if(nums1[i] == nums2[j]){
                list.add(nums1[i]);
                i++;
                j++;
            }
            else if(nums1[i] > nums2[j]){
                j++;
            }
            else
            {
                i++;
            }
        }

        int[] res = new int[list.size()];
        int k = 0;
        for(int val : list){
            res[k++] = val;
        }
        return res;
    }


}
