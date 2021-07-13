package com.collectionFramework;

import java.util.ArrayList;

class MyContainer<T extends Number>{

    T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public void show(){
        System.out.println(value.getClass().getTypeName());
    }


//?   (ERROR CODE 01)
//    public  void demo(ArrayList<Integer> obj){    }

    public  void demo(ArrayList<? super T> obj){    } //?   (ERROR CODE 01)



}
public class Generics {
    public static void main(String[] args) {

        MyContainer<Integer> Myobj = new MyContainer<>();
        Myobj.value = 23;
        Myobj.show();

        Myobj.demo(new ArrayList<Integer>());  //? (ERROR CODE 01) Throws an error becoz it can only accept Integer value.


    }
}
