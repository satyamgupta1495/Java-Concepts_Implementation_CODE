package com.datastructure.loops;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysMediumQuestions {

    void cyclicallyRotate(int[] arr){
        int temp = arr[arr.length-1],i;
        for ( i = arr.length-1; i > 0 ; i--)
            arr[i] = arr[i-1];
            arr[0] = temp;

    }

    void missingNumber(int[] arr){

        int n = arr.length;
        int m = n+1;
        int total = m*(m+1)/2;
        int sum = Arrays.stream(arr).sum();
        System.out.println(total-sum);


    }

    void duplicateNumbers(int[] arr){

     List<Integer> list = new ArrayList<>();
     Arrays.sort(arr);
//        for (i = 0; i < arr.length-1; i++) {
//            if (arr[i] == arr[j]){
//                list.add(arr[i]);
//                j++;
//            }
//            else if(arr[i] != arr[j]){
//                j++;
//            }
//        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if (arr[i] == arr[j]){
                    System.out.println(arr[j] + " ");
                }
            }
        }

    }


    void factorialOfLargeNumber(int num){

        BigInteger fact = new BigInteger("1");
        for (int i = 1; i <= num ; i++) {
            if (num ==1 ||num ==0){
                System.out.println(" 1 ");
            }
            else{
                fact = fact.multiply(BigInteger.valueOf(i));
             }
        }
        System.out.println(fact);

    }

    void rowWithMax1s(int[][] arr, int row, int column){
        List<Integer> list = new ArrayList<>();
        int count1 = 0, max=0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if(arr[i][j]==1){
                    count1++;
                }
            }
            list.add(count1);
            count1 = 0;
        }
        for (int i = 0; i < list.size(); i++) {
            if (max < list.get(i)){
                max = i;
            }
        }
        System.out.println(max + " row has max no. of 1s");
    }

    void alternateNumbers(int[] arr) {
        int n = arr.length-1;
        int i =-1, temp = 0;
        for (int j = 0; j < n; j++) {
            if (arr[j] < 0){
                i++;
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int pos = i+1, neg = 0;
        while (pos<n && neg < pos && arr[neg] < 0){
            temp = arr[neg];
            arr[neg] = arr[pos];
            arr[pos] = temp;
            pos++;
            neg+=2;
        }

        for (int elem: arr  ) {
            System.out.print(elem+ " ");
        }
}

    void printSpiral(int[][] arr, int m, int n){
        int T=0, B=arr[0].length-1, L = 0, R = arr[0].length-1, dir = 0;

        while(T <= B && L <= R){
            if (dir==0){
                for (int i = L; i <= R ; i++) {
                    System.out.println(arr[T][i]);
                    T++;
                    dir = 1;
                }
            }
            else if (dir == 1){
                for (int i = T; i <= B; i++) {
                    System.out.println(arr[i][R]);
                    R--;
                    dir = 2;
                }
            }else if (dir == 2){
                for (int i = R; i <= L; i--) {
                    System.out.println(arr[B][i]);
                    B--;
                    dir = 3;
                }
            }else if (dir == 3){
                for (int i = B; i <= T; i--) {
                    System.out.println(arr[i][L]);
                    L++;
                    dir = 0;
                }
            }
        }

    }

    void maxSubArray(int[] arr1){
        //! Kadane algorithms.
        int sum = 0;
        int max = arr1[0];
        for (int i = 0; i <arr1.length ; i++) {
            sum = sum + arr1[i];
            if (sum > max) max = sum;
            if (sum  < 0) sum=0;
        }
        System.out.println("Max sum is : " +max);
    }

    public static void main(String[] args) {
        int[][] arr = { {1 ,2, 3 ,4},
                        {5 ,6, 7, 8},
                        {9 ,10 ,11 ,12},
                        {13 ,14 ,15 ,16}};
        ArraysMediumQuestions med = new ArraysMediumQuestions();

        //med.cyclicallyRotate(arr);
        //System.out.println(Arrays.toString(arr));

//        med.missingNumber(arr);
//        med.duplicateNumbers(arr);
//        med.alternateNumbers(arr);
//        med.factorialOfLargeNumber(100);
//          med.rowWithMax1s(arr,4,4);
//        med.printSpiral(arr,4,4);

        int[] arr1 = {-2,-3,4,-1,-2,5,-3};
        med.maxSubArray(arr1);


    }
}
