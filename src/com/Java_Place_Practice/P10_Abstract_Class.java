package com.Java_Place_Practice;

//! Abstract class standard set krta hai baki class k liye.


abstract class Parent{
    public Parent(){
        System.out.println("Base 1 ka constructor hu");
    }

     public void sayHello(){
        System.out.println("Hello");
 }
    abstract public void greet();

}

class child extends Parent {

    @Override
    public void greet() {

    }

}

abstract class child2 extends Parent{

}

public class P10_Abstract_Class {
    public static void main(String[] args) {

        child c = new child();
//!        Parent p = new Parent();  -> not allowed

    }
}
