package com.datastructure;

public class BitWiseOperators {
    public static void main(String[] args) {

        int a = 20;
        int b = 3;

        System.out.println(a >> 2);

        //! Left shift doubles the values
        System.out.println(a << 1);
        System.out.println(a << b);

        //! Right Shift divides the values
        System.out.println(a >> 1);
        System.out.println(a >> 2);
        System.out.println(a >> 3);

        evenOdd(60);

    }

    static void evenOdd(int n){
        if((n&1) == 1){
            System.out.println("ODD");
        }else{
            System.out.println("EVEN");
        }
    }
}
