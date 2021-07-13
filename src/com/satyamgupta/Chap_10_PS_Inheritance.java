package com.satyamgupta;


class MyCircle{
    public int radius;

    MyCircle(int a){
        this.radius = a;
        System.out.println("I am circle parameterized constructor");
    }
    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}

class MyCylinder extends MyCircle{
    public int height;

    MyCylinder(int r,int h){
        super(r);
        System.out.println("I am cylinder with parameterized constructor");
        this.height = h;
    }
    public double volume(){
        return Math.PI*radius*radius;
    }

        }

public class Chap_10_PS_Inheritance {
    public static void main(String[] args) {

//        MyCircle c = new MyCircle(6);
         MyCylinder obj = new MyCylinder(12,4);
        System.out.println( obj.volume());

    }
}
