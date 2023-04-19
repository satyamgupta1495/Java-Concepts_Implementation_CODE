package com.hackerRank.gfgPTOD;

import java.util.ArrayList;

public class UnequalArrays {
    public static void main(String[] args) {

    }

    public static long solve(int N, int[] A, int[] B) {
        ArrayList<Integer> even = new ArrayList<>(2);
        ArrayList<Integer>odd = new ArrayList<>(2);
        int totalSum = 0;
        for(int i = 0; i < N; ++i){
            totalSum += A[i]-B[i];
            even.add(A[i]%2,A[i]);
            even.add(B[i]%2,B[i]);
        }

        if(totalSum != 0 || even.get(0).size() != odd])

    }
}
