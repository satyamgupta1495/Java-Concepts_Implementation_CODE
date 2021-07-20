package com.datastructure.Recursion;


import java.util.ArrayList;
import java.util.List;

public class SubString {

    static void subString(int[] array, int i, List<Integer> list, int n)
    {

        if (i == n) {
            System.out.println(list);
            return;
        }

        try {
            list.add(array[i]);
            subString(array, i + 1, list,n);
            list.remove(i);
            subString(array, i+1 , list,n);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {

        int[] array = {1,3,2};
        List<Integer> list = new ArrayList<>();
        subString(array,0,list,3);



    }
}
