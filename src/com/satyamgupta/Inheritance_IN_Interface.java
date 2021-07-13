package com.satyamgupta;

interface sampleInterface{
    void meth1();
    void meth2();
}


//! class sample2 extends sampleInterface

interface ChildSampleInterface extends sampleInterface{
    void meth3();
    void meth4();

}

class MySampleClass implements ChildSampleInterface{
    @Override
    public void meth3() {
        System.out.println("This is meth3");
    }
    @Override
    public void meth4(){
        System.out.println("This is meth4");
    }
    @Override
    public void meth2(){
        System.out.println("This is meth2");
    }
    @Override
    public void meth1(){
        System.out.println("This is meth1");
    }
}

public class Inheritance_IN_Interface {
    public static void main(String[] args) {

    }
}
