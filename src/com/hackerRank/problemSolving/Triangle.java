package com.hackerRank.problemSolving;

public class Triangle {
    public static void main(String[] args) {
        int n = 10201;
        System.out.println(isTriangular(n));
        System.out.println(tri(n));

    }


   static int tri(int n) {
       int count = 0;
       for (int i = 1; i <= n; i++) {
           int triangular = 0;
           int res = 0;
           int prev = 0;
           for (int j = 1; j <= i; j++) {

               triangular = triangular + j;
               prev = triangular;

           }

           if ((triangular-n) == prev){
               count++;
           }
           System.out.println(i + " = " + triangular);

       }
       System.out.println(count);
       return 1;
    }

    static boolean isTriangular(int num)
    {
        if (num < 0)
            return false;

        int c = (-2 * num);
        int b = 1, a = 1;
        int d = (b * b) - (4 * a * c);

        if (d < 0)
            return false;
        float root1 = ( -b +
                (float)Math.sqrt(d)) / (2 * a);
        float root2 = ( -b -
                (float)Math.sqrt(d)) / (2 * a);
        if (root1 > 0 && Math.floor(root1)
                == root1)
            return true;
        if (root2 > 0 && Math.floor(root2)
                == root2)
            return true;
        return false;
    }
}
