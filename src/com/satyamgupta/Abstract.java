package com.satyamgupta;

//! Abstract class standard set krta hai baki class k liye.

abstract class template{
    public void greet(){};
    public void farewell(){};
}


class T1 extends template{
    public void func1(){
        System.out.println("Function of t1");
    }
}


public class Abstract {
    public static void main(String[] args) {
        T1 temp = new T1();

    }
}
