package com.satyamgupta;

interface MyCamera2{
    void takeSnap();
    void recordVideo();
    private void greet(){
        System.out.println("Good Morning");
    }
    default void record4KVideo(){
        greet();
        System.out.println("Recording in 4k...");
    }
}

interface MyWifi2{
    String[] getNetworks();
    void connectToNetwork(String network);
}

class MyCellPhone2{
    void callNumber(int phoneNumber){
        System.out.println("Calling "+ phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting... ");
    }

}
class MySmartPhone2 extends MyCellPhone2 implements MyWifi2,MyCamera2 {
    public void takeSnap(){
        System.out.println("Taking snap");
    }
    public void recordVideo(){
        System.out.println("Taking snap");
    }
        public void record4KVideo(){
        System.out.println("Taking snap and recoding in 4k");
    }
    public String[] getNetworks(){
        System.out.println("Getting List of Networks");
        String[] networkList = {"Harry", "Prashanth", "Anjali5G"};
        return networkList;
    }
    public void connectToNetwork(String network){
        System.out.println("Connecting to " + network);
    }
}

public class Polymorphism_Interface {
    public static void main(String[] args) {
        MyCamera2 s = new MySmartPhone2();
        s.record4KVideo();
// !       s.getNetworks();    //! --> Throws an error because You can only use SmartPhone as a camera only!
        }
    }

