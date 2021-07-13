package com.satyamgupta;

import java.util.HashSet;
import java.util.Set;

public class HashMapsExamples {
    public static void main(String[] args) {
        Pen2 pen1 = new Pen2(10,"Blue");
        Pen2 pen2 = new Pen2(10,"Blue");

//        System.out.println(pen1 == pen2);
        System.out.println(pen1.equals(pen2));
        System.out.println(pen1);
        System.out.println(pen2);

        Set<Pen2> pens = new HashSet<>();
        pens.add(pen1);
        pens.add(pen2);

        System.out.println(pens);



    }
}
class Pen2{
    int price;
    String color;
    public Pen2(int price, String color){
        this.price = price;
        this.color = color;
    }

    public boolean equals(Object obj){
        Pen2 that = (Pen2) obj;
        boolean isEqual = this.price == that.price &&
                          this.color.equals(that.color);
        return isEqual;
    }

    public int hashCode(){
        return price + color.hashCode();
    }
}