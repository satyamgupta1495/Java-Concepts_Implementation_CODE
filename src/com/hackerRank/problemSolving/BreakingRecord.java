package com.hackerRank.problemSolving;
import java.util.*;
public class BreakingRecord {
    public static List<Integer> breakingRecords(List<Integer> scores) {
        int min = scores.get(0), max = scores.get(0) ,minCount = 0 ,maxCount = 0;
        List<Integer> list  = new ArrayList<>();
        for (int i = 1; i < scores.size(); i++) {
            if (min > scores.get(i)){
                min = scores.get(i);
//                System.out.print(scores.get(i)+ " ");
                minCount+=1;
            }
            if (max < scores.get(i)){
                max = scores.get(i);
                maxCount+=1;
            }
        }
        list.add(maxCount);
        list.add(minCount);
        System.out.println("Min count = "+ minCount);
        System.out.println("Max count = "+ maxCount);
        return list;
    }
    public static void main(String[] args) {
        List<Integer> list  = new ArrayList<>();
        List<Integer> list1  = new ArrayList<>();
//        int[] arr = {3, 4, 21, 36, 10, 28, 35, 5, 24, 42};
//        Arrays.asList(arr);           17 45 41 60 17 41 76 43 51 40 89 92 34 6 64 7 37 81 32 50
        Collections.addAll(list,17 ,45 ,41 ,60 ,17 ,41 ,76 ,43 ,51 ,40 ,89 ,92 ,34 ,6 ,64 ,7 ,37 ,81 ,32 ,50);
        BreakingRecord br = new BreakingRecord();
        list1 = br.breakingRecords(list);
        for (int elem:list1 ) {
            System.out.println(elem);
        }
    }
}
