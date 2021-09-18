package com.hackerRank.problemSolving;

public class NumberLineJumps {

    static String kangaroo(int x1, int v1, int x2, int v2) {

        if(v1 > v2)
        //! v1 > v2 tabhi toh catch up lr payega v1 v2 se
        {
            int rem = (x2-x1) % (v2-v1);
            if(rem == 0) return "YES";
        }
        return "NO";

    }


    public static void main(String[] args) {
        String ans = kangaroo(0, 2, 5, 3);
        System.out.println(ans);
        System.out.println();
        String ans1 = kangaroo(0, 3 ,4 ,2);
        System.out.println(ans1);
    }
}
