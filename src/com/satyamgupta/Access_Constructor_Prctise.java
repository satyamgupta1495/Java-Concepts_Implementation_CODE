package com.satyamgupta;

class Cylinder{
    private int radius;
    private  int heigth;

    Cylinder(int r, int h){
        this.heigth = h;
        this.radius = r;

    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeigth() {
        return heigth;
    }

    public void setHeigth(int heigth) {
        this.heigth = heigth;
    }
}

class Rectangle{

    private int length;
    private int breadth;

    Rectangle(){
    length = 4;
    breadth = 5;
    }

    Rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;

    }


        public double calcTriangle(int h, int b){
           double result  =  0.5*b*h;
           return result;
        };




//    public int getLength(){
//        return length;
//    }
//
//    public int getBreadth(){
//        return  breadth;
//    }
}

class Triangle {

    private int height;
    private int base;

    Triangle(int h, int b) {
        this.height = h;
        this.base = b;
    }

    public int getHeight() {
        return height;

    }

    ;

    public void setHeight(int h) {
        this.height = h;
    }

    ;

    public int getBase() {
        return base;
    }

    ;

    public void setBase(int b) {
        this.base = b;
    }

    ;

    public float calcTriangle(){
        float res = 0.5f*base*height;
        return res;
    }
}

public class Access_Constructor_Prctise {
    public static void main(String[] args) {

        //! PROBLEM ONE
//       Cylinder myCylinder = new Cylinder(9,12);
//        myCylinder.setHeigth(12);
//        myCylinder.setRadius(7);
//        System.out.println(myCylinder.getHeigth());
//        System.out.println(myCylinder.getRadius());
//

//        Rectangle rec = new Rectangle();
//        System.out.println(rec.getBreadth());
//        System.out.println(rec.getLength());

        Triangle t = new Triangle(20,10);
        System.out.println(t.getHeight());
        System.out.println(t.calcTriangle());


    }
}