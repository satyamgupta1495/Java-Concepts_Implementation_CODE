package com.satyamgupta;

//! PROBLEM 2 AND 2 CHAPTER 11
abstract  class pen{
    abstract void write();
    abstract void refill();
}

class FountainPen extends pen{
    public void write(){
        System.out.println("Writing....");
    }
    public void refill(){
        System.out.println("Refilling...");
    }

    void changeNib(){
        System.out.println("Changing nib...");
    }
}

//! PROBLEM 3

interface BasicAnimal{
    void eat();
    void sleep();
}

class Monkey{
    void jump(){
        System.out.println("Monkey is jumping....");
    }
    void Bite(){
        System.out.println("Monkey is Biting....");
    }
}

class Human extends Monkey implements BasicAnimal{
    public void eat(){
        System.out.println("Human is eating...");
    }
    public void sleep(){
        System.out.println("Human is sleeping...");
    }
    public void speak(){
        System.out.println("Hello Human How are you!");
    }
}


public class Abstractclass_Practice {
    public static void main(String[] args) {

//        !PROBLEM 2 AND 2 CHAPTER 11
//        FountainPen pen = new FountainPen();
//        pen.refill();
//        pen.write();
//        pen.changeNib();

//        !PROBLEM 3 CHAPTER 11
        Human h = new Human();
        h.eat();
        h.sleep();
        h.Bite();

//        !PROBLEM 5

        Monkey m1 = new Human();
//        m1.speak();

        Human hu = new Human();
        hu.speak();



    }
}
