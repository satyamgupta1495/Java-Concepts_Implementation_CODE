package com.satyamgupta;


class Base1{
    Base1(){
        System.out.println("I am a base constructor");
    }
    Base1(int a){
        System.out.println("I am a overloaded base constructor with value of a as: " + a);
    }
    public  int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}

class Derived extends Base1{
    Derived(){
        super(3);
     System.out.println("I am a Derived constructor");
}}


public class Constructors_in_Inheritance {
    public static void main(String[] args) {
//        Base1 b = new Base1();
        Derived d = new Derived();


    }
}
