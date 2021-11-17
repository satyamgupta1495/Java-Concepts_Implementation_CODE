package com.hackerRank.problemSolving;

import java.util.*;

public class SortCharactersByFrequency {
    public static void main(String[] args) {
        String  s = "abbAbbccc";
        frequencySort(s);
//        System.out.println(frequencySort(s));
    }
    static void frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();

        for(int i = 0; i <= s.length()-1; ++i){
            char ch = s.charAt(i);
            if(!map.containsKey(ch)){
                map.put(ch,1);
            }else{
                map.put(ch,map.getOrDefault(ch,0) + 1);
            }
        }

        List<Map.Entry<Character,Integer>> list = new LinkedList<>(map.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {
            @Override
            public int compare(Map.Entry<Character, Integer> obj1, Map.Entry<Character, Integer> obj2) {
                return (obj1.getValue()).compareTo(obj2.getValue());
            }
        });

        System.out.println(list);
        Collections.reverse(list);

        HashMap<Character, Integer> res = new LinkedHashMap<>();

        for (Map.Entry<Character, Integer> val:list) {
            res.put(val.getKey(), val.getValue());
        }

        System.out.println(res);


        StringBuilder sb = new StringBuilder();


        System.out.println(sb.toString());

    }
}
