package com.Java_Place_Practice;

interface bicycle{
    int a = 90;
    void applyBrake(int dec);
    void speedUp(int inc);
}

class hero implements bicycle{
    @Override
    public void applyBrake(int dec){
        System.out.println("Applying break..");
    }

    @Override
    public void speedUp(int inc) {
        System.out.println("Increasing speed..");

    }
}


//    ! Inheritance in Interfaces

interface sample{
    void meth1();
    void meth2();

}

//? -----> allowed

interface chileSample extends sample{
    void meth3();
    void meth4();
}

class test implements sample, chileSample{
    public void meth1(){

    }

    @Override
    public void meth2() {

    }

    ;

    @Override
    public void meth3() {

    }

    @Override
    public void meth4() {

    }
}


public class P11_Interfaces {
    public static void main(String[] args) {

//        hero h = new hero();
//        System.out.println(h.a);



    }

}
