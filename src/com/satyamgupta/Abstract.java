package com.satyamgupta;

//! Abstract class standard format set krta hai baki class k liye.
//! Just a concept!


/*
        1-> You cannot create an ojects of abstract classes.
        2-> But you can create the objects of clasess which extends it.
        3-> You dont have to provide any method body.


 */
abstract class template{

    //! No need to define the body -> Whichever clas extend this Abstract class will have to provide the implementation

    public void greet(){};
    public void farewell(){
        System.out.println("abstract method");
    };
}


class T1 extends template{
    public void func1(){
        System.out.println("Function of t1");
    }
}


public class Abstract {
    public static void main(String[] args) {
        T1 temp = new T1();
        temp.farewell();

    }
}
