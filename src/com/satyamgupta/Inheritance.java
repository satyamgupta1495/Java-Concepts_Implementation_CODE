package com.satyamgupta;


class Animals{

    String sound;
    String animal;
    String color;



    public void sound(String sound,String animal){
        System.out.println("Sound of "+animal +" is " +sound);
    };
    public void color(String color,String animal){
        System.out.println("Color of "+animal +" is " +color);
    };

}

class Dog extends Animals{
    public void D_sound(){
        System.out.println("Dog barks!");
    }
    public void D_breed(){
        System.out.println("I have German shepard!");
    }

}

public class Inheritance {
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.sound("Woof Woof","Dog");
        dog.color("Black","Dog");
        dog.D_breed();

    }
}
