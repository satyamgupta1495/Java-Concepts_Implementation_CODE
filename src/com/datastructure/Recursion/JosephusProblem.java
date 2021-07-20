package com.datastructure.Recursion;

public class JosephusProblem  {

    int winner(int n, int k)
    {
        if (n == 1) return 1;
        else
        {
            return ((winner(n-1,k) + k)%n);
        }
    }

    public static void main(String[] args) {

        JosephusProblem jsol = new JosephusProblem();
        int res = jsol.winner(5,3);
        System.out.println(res);
    }
}
