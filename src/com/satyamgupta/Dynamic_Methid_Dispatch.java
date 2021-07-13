package com.satyamgupta;


class Phone{
    Phone(){
        System.out.println("This is nokia 3310 ");
    }
    public void on(){
        System.out.println("Turning on the phone.... ");
    }
}
class Smartphone extends Phone{
    Smartphone(){
        System.out.println("This is Samsung S20 ");
    }

    public void music(){
        System.out.println("Playing music....");
    }

    @Override
    public void on(){
        System.out.println("Turning on the Smartphone.... ");
    }
}


public class Dynamic_Methid_Dispatch {
    public static void main(String[] args) {


//        Reference class  = new Sub class

//        Phone obj = new Phone();
        Phone obj = new Smartphone();       //*ALLOWED
        obj.on();

        //obj.music();    //!Not allowed

        /*      Smartphone obj2 = new Phone();   */   //!NOT ALLOWED
//      obj.on();

    }
}
