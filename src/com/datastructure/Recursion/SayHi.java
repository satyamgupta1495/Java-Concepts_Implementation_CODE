package com.datastructure.Recursion;

public class SayHi {

    public static void sayHi(int n)
    {

        if (n == 0){
            System.out.println("Done!");
        }

        else{
            System.out.println("Hello World");
            sayHi(n - 1);
        }
        }


    public static void main(String[] args) {
        sayHi(5);
    }
}
