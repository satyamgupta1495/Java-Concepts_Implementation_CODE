package com.satyamgupta;

import java.awt.*;
import java.util.Comparator;
public class CompareImplement implements Comparator<Integer> {
    public static void main(String[] args) {

    }

    @Override
    public int compare(Integer o1, Integer o2) {
        if (o1 > o2) return 1;
        return -1;
    }

}
