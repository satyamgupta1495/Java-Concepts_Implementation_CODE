package com.collectionFramework.stackQueue;

import java.util.*;

public class CollectionStack {

    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(10);
        st.push(20);
        st.push(70);

        System.out.println("Elements : " +st);

        st.pop();

        System.out.println("Elements : " +st);


        System.out.println(st.peek());
        System.out.println(st.empty());
    }
}
