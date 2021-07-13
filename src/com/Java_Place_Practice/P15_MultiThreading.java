package com.Java_Place_Practice;

//! Two methods to create THREADS
//* 1 -> Extending Thread class
//* 2 -> Runnable

class MyThread1 extends Thread{
    public void run(){
        while (true){
        System.out.println("Thread is running.");
        System.out.println("happy.");
        }
    }
}
class MyThread2 extends Thread{
    public void run(){
        while (true){
        System.out.println("Thread--2-- is running.");
        System.out.println("sad.");
        }
    }
}

class MyThreadRunnable1 implements Runnable {

    @Override
    public void run() {
        while (true) {
            System.out.println("Thread runnable------||------");
        }
    }
}
class MyThreadRunnable2 implements Runnable {

    @Override
    public void run() {
        while (true) {
            System.out.println("Thread runnable---2------$------");
        }
    }
}

public class P15_MultiThreading {
    public static void main(String[] args) {
//        MyThread1 t = new MyThread1();
//        MyThread2 t1 = new MyThread2();
//        t.start();
//        t1.start();

        MyThreadRunnable1 bullet1 = new MyThreadRunnable1();
        Thread gun1 = new Thread(bullet1);


        MyThreadRunnable2 bullet2 = new MyThreadRunnable2();
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();


    }
}
