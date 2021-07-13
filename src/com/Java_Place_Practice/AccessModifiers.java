package com.Java_Place_Practice;

class Modifiers{
    int a = 1;
    public int b = 2;
    protected int c = 3;
    private int d = 4;

    Modifiers(int d){
              this.d = d;
        System.out.println(d);
    }
    public void printNumber(){

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

    }

    public void getD(){
        System.out.println(d);
    }
}

class DerivedModifiers extends Modifiers{

    public void printDerivedNumber(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }
    DerivedModifiers(int d) {
        super(d);
    }

}

public class AccessModifiers {
    public static void main(String[] args) {

//        Modifiers m = new Modifiers();
//        m.printNumber();

        DerivedModifiers d = new DerivedModifiers(10);
        d.printDerivedNumber();




    }
}
