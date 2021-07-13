package com.Java_Place_Practice;

class Phone{
    public void on(){
        System.out.println("Turning on phone....");
    }
    public void greet(){
        System.out.println("Swagat haii...");
    }
    public void notoverriden(){
        System.out.println("You cannot override me...");
    }
}
class SmartPhone extends Phone{


    public void Son(){
        System.out.println("Turning on Smartphone....");
    }


    public void Sgreet(){
        System.out.println("Good Morning..");
    }
    public void Snotoverriden(){
        System.out.println("You cannot override me Smartphone...");
    }
}


public class P9_dynamic_method_dispatch {
    public static void main(String[] args) {


//        * Allowed
        Phone p = new Phone();
        p.greet();
        p.on();


//        !Not allowed -> Base class ka hi method run ho skta hai Derived ka nhi bahlehi obj derieved ka q na bana ho.
//        Phone p = new SmartPhone();
//        p.Son();
//        p.Sgreet();
//        p.Snotoverriden();

//!        SmartPhone s = new Phone(); --> Not allowed.

    }
}
