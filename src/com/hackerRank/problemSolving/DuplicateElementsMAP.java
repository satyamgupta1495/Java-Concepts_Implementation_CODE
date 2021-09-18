package com.hackerRank.problemSolving;

import java.util.*;

public class DuplicateElementsMAP {
            public static ArrayList<Integer> duplicates(int arr[], int n) {
                Map<Integer, Integer> map = new HashMap<>();

                for(int val : arr){
                    if(!map.containsKey(val)){
                        map.put(val, 1);
                    }
                    else{
                        map.put(val,map.get(val) + 1);
                    }
                }

                ArrayList<Integer> list = new ArrayList<>();
                Set<Map.Entry<Integer, Integer>> mapEntry = map.entrySet();
                for(Map.Entry<Integer,Integer> elements : mapEntry){
                    if(elements.getValue() > 1){
                        list.add(elements.getKey());
                    }
                }
                if(list.isEmpty()) list.add(-1);
                Collections.sort(list);

                System.out.println(list);
                return list;
            }



    public static void main(String[] args) {
        int [] arr = {14 ,7 ,14 ,6 ,1 ,11, 3 ,16 ,16, 8, 7, 4 ,11 ,15 ,17, 6, 1 ,13};
        duplicates(arr,arr.length);
//        System.out.println(ans);
    }
}
