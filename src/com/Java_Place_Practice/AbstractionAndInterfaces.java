package com.Java_Place_Practice;

interface MakeNewPhone
{
    final int a = 10;

    //! agar ye implement hua toh public banana hoga method ko jo bhi class implement karegi iss method ko
    void camera();

    //! funny thing is all the classes implementing this interface
    //! will not be able to use this private method
    //? so whats the use? -> well if the logic of default method is too big
    //? we can use private methods
    private void greet(){
        System.out.println("Good morning!");
    }

    //Default Method
    //! You can't edit the interfaces once any class implements it.
    // so as a quick fix ye default method add kiya hai java 8 mein

    default void newMethodAfterImplementing(){
        greet();
        System.out.println("New method added!");
    }

}

abstract class NewPhone{
    abstract void call();

    void switchOn()
    {
        System.out.println("Booting up.... ");
    }
    void switchOff()
    {
        System.out.println("Switching off.... ");
    }
    void call(int num){
        System.out.println("Calling...." + num);
    }

}

class NewSmartPhone implements MakeNewPhone{
    void print(){
        System.out.println("smartphone");
    }

//    @Override
//    void call() {
//        System.out.println("method implemented");
//    }


    @Override
    public void camera() {
        System.out.println("Implemented camera ");
    }
}

public class AbstractionAndInterfaces {
    public static void main(String[] args) {
        NewSmartPhone p = new NewSmartPhone();
//        p.call();
//        p.switchOn();
//        p.call(9890);
        p.newMethodAfterImplementing();
        System.out.println(NewSmartPhone.a);


    }
}
