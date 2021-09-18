package com.OOP;



class Computer{
    static int keyboard = 64;

    void print(){

//?      Local variable mein static keyword nhi use kr skte!
//!      static int a = 89;

        System.out.println(keyboard + " -Printed using print method");
    }
}

public class ObjectsAndClasses {

    public static void main(String[] args) {

//? Collection of objects is called class. It is a logical entity.
        Computer c = new Computer();

//! Object -> c
//? means a real-world entity such as a pen, chair, table, computer, watch, etc.

        c.print();
        System.out.println(Computer.keyboard + " -Printed directly using class");

    }
}
