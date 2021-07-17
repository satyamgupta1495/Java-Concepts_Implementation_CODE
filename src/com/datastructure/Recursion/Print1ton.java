package com.datastructure.Recursion;

public class Print1ton {

    void print(int n)
    {
        if (n == 1) {
            System.out.println(1);
        } else {
            print(n-1);      //! Pahele call karega sabb baad mein print karega
            System.out.println(n);
        }
    }

    public static void main(String[] args)
    {
        Print1ton n = new Print1ton();
        n.print(7);

    }
}
