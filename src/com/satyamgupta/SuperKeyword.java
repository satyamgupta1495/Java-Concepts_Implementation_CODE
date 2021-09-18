package com.satyamgupta;

/*
    used for invoking parent class...

    1-> Variable
    2-> Method
    3-> Constructor

 */

class NewAnimals{
    String color = "Black";

    NewAnimals(){
        System.out.println("Parent class constructor invoked");
    }

    void eat(){
        System.out.println("eating....");
    }
}

class Rhino extends NewAnimals {
    String color = " White";
    Rhino(){
        //! invoking parent class constructor
        super();
    }

    void printcolor() {
        System.out.println(color);

        //! refering immediate parent class instance variable.
        System.out.println(super.color);

        //! invoking parent class method
        super.eat();
    }
}
public class SuperKeyword {

    public static void main(String[] args) {
        Rhino animal = new Rhino();
        animal.printcolor();
    }
}
