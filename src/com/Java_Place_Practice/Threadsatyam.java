package com.Java_Place_Practice;


class a1 extends Thread{
    public void run() {
        while (true) {
            System.out.println("This is thread------------11111111----------");
        }
    }
}
class a2 extends Thread{
    public void run() {
        while (true) {
            System.out.println("This is thread------------22222222----------");
        }
    }
}

class Runnable1 implements Runnable{
    @Override
    public void run() {
        while (true) {
            System.out.println("This is thread------------11111111----------");
        }
    }
}
class Runnable2 implements Runnable{
    @Override
    public void run() {
        while (true) {
            System.out.println("This is thread------------222222222----------");
        }
    }
}


public class Threadsatyam {
    public static void main(String[] args) {

//        a1 a = new a1();
//        a2 b = new a2();
//        a.start();
//        b.start();

//        Runnable1 r1 = new Runnable1();
//        Thread t1 = new Thread(r1);
//
//        Runnable2 r2 = new Runnable2();
//        Thread t2 = new Thread(r2);
//
//        t1.start();
//        t2.start();
//
//        t1.setDaemon(true);

    }
}
