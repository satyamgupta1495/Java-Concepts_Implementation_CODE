package com.satyamgupta;

//? INTERFACES  can extends INTERFACES


interface Bicycle{
    // final hai !
    int a = 45;
    void applyBreak(int decrement);
    void speedUp(int increment);
}

interface HornBicycle extends Bicycle{
    void blowHornDDLJ();
    void blowHornKGF2();
}

//? class AvonCycle implements  HornBicycle, Bicycle{
//*         BOTH ARE VALID
class AvonCycle implements  HornBicycle{

    @Override
    public void blowHornDDLJ() {
        System.out.println("Playing DDLJ horn....");
    }

    @Override
    public void blowHornKGF2() {
        System.out.println("Mein hu na..... popopopop");
    }

    void blowHorn(){
        System.out.println("PEEEE PEEEE POOP POOOOP");
    };

   public void applyBreak(int decrement){
        System.out.println("Applying Break");
    }
   public void speedUp(int increment){
        System.out.println("Speeding up");
    }
}

public class Interfaces {
    public static void main(String[] args) {
        AvonCycle cycle = new AvonCycle();
        cycle.applyBreak(10);
        System.out.println(cycle.a);
        cycle.blowHornDDLJ();
        cycle.speedUp(2);

    }
}
