package com.OOP;

public class Person {

    static int count;       //! Static keyword is imp here
    public Person(){
         count++;
        System.out.println("Creating a new Object " + count);
    }


    public static void main(String[] args) {
        Person p = new Person();
        Person p1 = new Person();
        Person p2 = new Person();

    }
}
