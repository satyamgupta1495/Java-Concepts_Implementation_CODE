package com.collectionFramework;

import java.util.Arrays;

public class CustomArrayList {

    private static int DEFAULT_SIZE = 10;
    private int[] arr;
    private int size = 0;

    public CustomArrayList() {
        this.arr = new int[DEFAULT_SIZE];
    }

    public void add(int n){
        if (isFull()){
            resize();
        }

        arr[size++] = n;
    }

    private boolean isFull() {
        return size == arr.length;
    }

    private void resize() {
        int[] temp = new int[arr.length*2];

        for(int i = 0; i < arr.length; ++i){
            temp[i] = arr[i];
        }
        arr = temp;
    }

    private int get(int index){
        return arr[index];
    }

    private void replace(int index, int n){
        arr[index] = n;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "arr=" + Arrays.toString(arr) + " size = " + size + " " +  '}';
    }

    public static void main(String[] args) {
        CustomArrayList a = new CustomArrayList();
        for (int i = 1; i <= 17; i++) {
            a.add(i);
        }
        a.replace(2,100);
        System.out.println(a);
    }
}
