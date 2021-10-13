package com.collectionFramework;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Test2 {
    public static void main(String[] args) {
//
//        String s = "8485025947";
//
//        System.out.println();
//        System.out.println(s.getClass());
//        Long a = Long.parseLong(s);
//        System.out.println(a.TYPE);
//        int i  = 3;
//        for (int j = 0; j < i; j++) {       //! number of rows
//            for (int k = 0; k < j+1; k++) {     //! kitni barr print krna hai
//                System.out.print("*");
//            }
//            System.out.println();
//            }
//        }
//        int a = 4;
//        int sum = mySum(a);
//        if (sum == 0) {
//            System.out.println(1);
//        } else if (sum == a) {
//            System.out.println(Test2.mySum(a));
//        }

        //!


//        List<Character> list1 = new ArrayList<>();



    }

static int mySum(int a){
        int res  =0;
        res = res + mySum(a - 1);
        return  res;
}
}






