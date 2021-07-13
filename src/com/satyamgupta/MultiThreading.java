package com.satyamgupta;

class MyThread1 extends  Thread{
    @Override
    public void run() {
        while (true) {
            System.out.println("My Thread 1 is running");
            System.out.println("I am happy");
        }
    }
}

class MyThread2 extends  Thread{
    @Override
    public void run() {
        while (true) {
            System.out.println("My Thread 2 is running");
            System.out.println("I am Sad");
        }
    }
}


public class MultiThreading {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();

//        t1.run(); Pahaele pura ye run hoga....
//        t2.run(); badd mein ye run hoga pura...
        t1.start();
        t2.start();
    }
}
