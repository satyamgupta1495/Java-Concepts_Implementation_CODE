package com.satyamgupta;
//
//abstract class Pen1{
//    abstract void fill();
//    abstract void changeNib();
//}
//
//interface monkey1{
//    void jump();
//    void bite();
//}
//
//interface human1{
//
//    private void dance(String name) {
//        System.out.println(name+" can Dance!");
//    }
//
//    private void sing(String name){
//        System.out.println(name+" can Sing!");
//    };
//
//    default void skills(String name){
//        dance(name);
//        sing(name);
//    }
//}
//
//class Satyam extends Pen1 implements human1,monkey1{
//
//    @Override
//    void changeNib() {
//        System.out.println("Changing nib....");
//    }
//
//    @Override
//    void fill() {
//        System.out.println("Filling again....");
//    }
//
//    public void bite(){
//        System.out.println("Taking a bite of apple...");
//    }
//
//    public  void jump(){
//        System.out.println("Jumping on a trampoline...");
//    }
//}
//
//public class Test {
//
//    public static void main(String[] args) {
//        Satyam s1 = new Satyam();
//        s1.changeNib();
//        s1.fill();
//        s1.skills("Satyam");
//        s1.jump();
//        s1.bite();
//
//    }
//
//}

class Parent1 {
    public void parent(){
        System.out.println("I am a parent...");
        protectedParent();
        privateParent();
    }

    private void privateParent(){
        System.out.println("This method is private in Parent....");
    }
    protected void protectedParent(){
        System.out.println("This method is protected in Parent....");
    }



}

class Child1 extends Parent1{
    public void kid(){
        System.out.println("I extend class Parent1 and I am his child...");
    }
}

public class Test{
    public static void main(String[] args) {
        Child1 c = new Child1();
        c.parent();
        c.kid();


    }
}

