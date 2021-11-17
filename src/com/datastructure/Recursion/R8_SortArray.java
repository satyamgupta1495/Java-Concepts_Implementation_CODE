package com.datastructure.Recursion;

import java.util.ArrayList;

public class R8_SortArray {
    public static void main(String[] args) {

        int[] num = {1,0,5,2};
        ArrayList<Integer> list = new ArrayList<>();
        for (int val : num) {
            list.add(val);
        }
        System.out.println(list);
        sort(list);
        System.out.println(list);
    }

    private static void sort(ArrayList<Integer> num) {
        if (num.size() == 1) return;

        int temp = num.get(num.size()-1);
        num.remove(num.size()-1);
        sort(num);
        insert(num, temp);
    }

    private static void insert(ArrayList<Integer> num, int temp) {

        if(num.size() == 0 || num.get(num.size()-1) <= temp){
            num.add(temp);
            return;
        }

        int val = num.get(num.size()-1);
        num.remove(num.size()-1);
        insert(num, temp);
        num.add(val);

    }

}
