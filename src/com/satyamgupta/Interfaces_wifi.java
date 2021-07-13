package com.satyamgupta;


interface Camera{
    void takingSnap();
    void recordVideo();

    private void greet(){
        System.out.println("GOOD MORNING....!");
    }
    default void record4k(){
        greet();
        System.out.println("Interface Recording in 4k...");
    }
}

interface Wifi{
    String[] getNetworks();
    void connectToNetwork(String network);
}

class Cellphone{
    void callNumber(int phoneNumber){
        System.out.println("Calling...." +phoneNumber);
    }
    void pickCall(int phoneNumber){
        System.out.println("Connecting..." +phoneNumber);
    }

}

class SmartPhone extends Cellphone implements Wifi, Camera{

    public void recordVideo(){
        System.out.println("Recording Video...");
    }
    public void takingSnap(){
        System.out.println("Taking Snap...");
    }

//    public void record4k(){
//        System.out.println("Recording in 4k...");
//    }

    public String[] getNetworks(){
        String[] networkList = {"Satyam 5G", "Lg Stylus m400", "Airtel 4G"};
        return networkList;
    }

    public void connectToNetwork(String network){
        System.out.println("Connecting to network...");
    }

}

public class Interfaces_wifi {
    public static void main(String[] args) {

        SmartPhone s = new SmartPhone();
        s.record4k();
        String[] nl = s.getNetworks();
        for (String elements:nl) {
            System.out.println(elements);
        }




    }
}
