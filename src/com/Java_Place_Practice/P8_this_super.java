package com.Java_Place_Practice;


class ClassA{
    int a;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        a = a;
    }

    ClassA(int a){
        this.a = a;
    }

    public int return1(){
        return 1;
    }
}


public class P8_this_super {
    public static void main(String[] args) {

        ClassA a = new ClassA(2);
        System.out.println(a.getA());
    }
}
