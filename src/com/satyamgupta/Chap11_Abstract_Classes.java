package com.satyamgupta;


/* ! EK PHONE BANAYA AUR FOLLOWING METHOD IMPLEMENT KRNA HAI (PHONE KYA KYA KARNA HAI!)

1- phoneOn();
2- phoneSwitchoff();
3- makeCall();
4- endCall();
.
.
.
etc */







abstract class Parent{
    Parent(){
        System.out.println("Parent ka constructor hu !");
    }
    public void sayHello(){
        System.out.println("Hello!");
    }
    abstract public void greet();


}

class Child extends Parent{
    @Override
    public void greet() {
        System.out.println("Good morning!");
    }
}
abstract class Child2 extends Parent{           //! Template ka template
    public void th(){
        System.out.println("I AM GOOD!");
    }
}


//? YAA TOH PURA CLASS HI ABSTRACT BANA LO -|^
//!-------------------- OR ----------------------

//? YAA TOH PURA METHOD OVERRIDE KAR LO

class Child3 extends Parent{
    public void th(){
        System.out.println("I AM GOOD!");
    }

    @Override
    public void greet() {

    }
}


public class Chap11_Abstract_Classes {
    public static void main(String[] args) {
        Child c = new Child();
        c.greet();
    }
}
