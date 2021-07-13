package com.Java_Place_Practice;

interface Wifi{
    String[] getNetworks();
    void connectToNetwork();
}

interface Camera{
    void takeSelfie();
    void recordVideo();
    private void meth(){
        System.out.println("This is a private method!");
    }
    default void greet(){
        meth();
        System.out.println("Hello there!");
    }
}

abstract class myPhone implements Wifi, Camera{
    abstract void bootUp() ;
    abstract void shutDown();
}

class BrandNewPhone extends myPhone{

    public void buy(){
        System.out.println("Bought new Phone...");
    }
    @Override
    public void bootUp(){
        System.out.println("Booting up the phone....");
    };

    @Override
    public String[] getNetworks(){
        String[] net = {"Wifi1", "Wifi2", "Wifi3", "Wifi4"};
        for (String elem: net) {
            System.out.println(elem);
        }
        return net;
    }

    @Override
    public void connectToNetwork() {
        System.out.println("Connecting to the network....");
    }

    @Override
    public void takeSelfie() {
        System.out.println("Taking Selfie...");
    }

    @Override
    public void recordVideo() {
        System.out.println("Recording video.....");
    }

    @Override
    public void shutDown(){
        System.out.println("Shutting down...");
    }
}


public class Inheritance_practice {
    public static void main(String[] args) {
        BrandNewPhone bp = new BrandNewPhone();
        bp.greet();

//        bp.buy();
//        bp.bootUp();
//        bp.connectToNetwork();
//        bp.getNetworks();
//        bp.takeSelfie();
//        bp.recordVideo();
//        bp.shutDown();

    }
}
