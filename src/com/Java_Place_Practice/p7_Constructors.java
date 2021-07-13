package com.Java_Place_Practice;

import java.util.Scanner;

class Employee{
    private int id;
    private String name;

    Employee(){
        id = 40;
        name = "Your-Name-Here";
    }
    public void setId(int n){
        this.id = n;
    }
    public int getId(){
        return (id);
    }
    public void setname(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

}


class GuessTheNumber{

    private int number = 10;
    public void play() {

        int attempt = 3;
        while (attempt > 0) {
            Scanner scan = new Scanner(System.in);
            int guess = scan.nextInt();
            attempt--;

            if (guess > number) {
                System.out.println("Too high!");
            } else if (guess < number) {
                System.out.println("Too low!");
            } else if (number == guess) {
                System.out.println("You won!");
                break;
            }

        }
    }
}

class Cylinder{
    private int radius;
    private  int height;

    Cylinder(int r , int h){
        radius = r;
        height = h;
    }

//    public int setRadius

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}

class Base{
    protected int a=10 , b=40;

    Base(){
        System.out.println("I am a base class constructor");
    }
}

class Derived extends Base{
    Derived(){
        System.out.println("I am derived class constructor");
    }

    public void add(){
        System.out.println(a+b);
    }
}

class Addition{

    Addition(){
        System.out.println("This is normal constructor");
    }

    Addition(int a, int b){
        System.out.println("This is Parameterized constructor with value of a = "+a + "Value of b = " + b);
    }
}

class Sum extends Addition{
    Sum(){
        System.out.println("I am derived class constructor of class sum.");
    }
    Sum(int a, int b){
        super(a,b);
        System.out.println("I am derived class method of class sum.");
    }

}

public class p7_Constructors {
    public static void main(String[] args) {

//        !Practicing constructor

//        Employee e = new Employee();
//        System.out.println(e.getId());
//        System.out.println(e.getName());

//        !Guess the number Game
//        GuessTheNumber n = new GuessTheNumber();
//        n.play();

//        !Cylinder
//        Cylinder cy = new Cylinder(10,20);
//        cy.getHeight();
//        cy.getRadius();

//        !Derived and Base class test -> Derived class constructor 1st calls base class contructor
//        Derived d = new Derived();
//        d.add();

//        !SUPER Constructor
        Sum s = new Sum(1,8);





    }
}
