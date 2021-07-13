package com.satyamgupta;



class rectangle{
    public int area(int x, int y){
        return x * y;
    }
}
public class ObjectAttributes {
    public static void main(String[] args) {
        rectangle r = new rectangle();

        System.out.println( r.area(3,4));
    }
}
