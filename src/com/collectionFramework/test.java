package com.collectionFramework;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Test2 {
    public static void main(String[] args) {
        print(5);
    }

    static void print(int n){
        if(n < 0) return;

        print(n-1);
        System.out.println(n);
    }
}






