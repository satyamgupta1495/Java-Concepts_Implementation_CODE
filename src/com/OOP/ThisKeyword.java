package com.OOP;

public class ThisKeyword {

    static int count;
    public ThisKeyword(String name){
        count++;
        System.out.println("Constructor without Parameter");
        System.out.println("Name = " + name);
    }

    public ThisKeyword(int age, String name){
        this(name);
        count++;
        System.out.println("Age = " + age);
    }

    public static void main(String[] args) {
        ThisKeyword th = new ThisKeyword(22,"Satyam");
        System.out.println(ThisKeyword.count);

    }
}
