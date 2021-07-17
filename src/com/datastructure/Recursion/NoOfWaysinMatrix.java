package com.datastructure.Recursion;

public class NoOfWaysinMatrix {

    int printWays(int n, int m)
    {
        if (n == 1 || m == 1) return 1;
        else{
            return printWays(n-1, m) + printWays(n, m-1);
        }
    }

    public static void main(String[] args) {

        NoOfWaysinMatrix ways = new NoOfWaysinMatrix();
        int num = ways.printWays(3,3);
        System.out.println(num);

    }
}
