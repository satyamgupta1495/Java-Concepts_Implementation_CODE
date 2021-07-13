package com.satyamgupta;

class MyBase{
    MyBase(){
        System.out.println("I am Base class constructor !");
    }
    MyBase(int x){
        System.out.println("I am Base class constructor with the value of x = "+x);
    }
    MyBase(int x,int y, int z){
        System.out.format("I am Base class constructor with the value of x = %d , y = %d, z = %d\n ",x,y,z);
    }
    MyBase(int x,int y){
        System.out.format("I am Base class constructor with the value of x = %d , y = %d \n ",x,y);
    }
}

class MyDerived extends MyBase{
    MyDerived(){
        super();
        System.out.println("I am Derived class constructor !");
    }
    MyDerived(int x,int y,int z){
        super(x,y);  //! USED TO CALL THE PARENT CONSTRUCTOR WITH PARAMETER
        System.out.println("I am Derived class constructor with value of x = "+ x);
    }
}

public class Super_Constructor {
    public static void main(String[] args) {
        MyDerived d= new MyDerived(45,54,4);



    }
}
