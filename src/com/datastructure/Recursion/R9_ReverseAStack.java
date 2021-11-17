package com.datastructure.Recursion;

import java.util.ArrayList;

public class R9_ReverseAStack {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        ArrayList<Integer> list = new ArrayList<>();
        for (int val : arr) {
            list.add(val);
        }
        System.out.println(list);
        reverse(list);
        System.out.println(list);
    }

    static void reverse(ArrayList<Integer> st){

        if (st.size() == 1){
            return;
        }


        int temp = st.get(st.size()-1);
        st.remove(st.size()-1);
        reverse(st);
        insert(st, temp);

    }

    private static void insert(ArrayList<Integer> st, int temp) {

        if (st.size() == 0){
            st.add(temp);
            return;
        }

        int val = st.get(st.size()-1);
        st.remove(st.size()-1);
        insert(st, temp);
        st.add(val);
    }

}
