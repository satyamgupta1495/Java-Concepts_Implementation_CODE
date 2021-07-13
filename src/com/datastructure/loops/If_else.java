package com.datastructure.loops;

import javax.naming.Name;

public class If_else {


    If_else(int data){

        System.out.println("Data " + data);
    }

    private Name personName;

    public Name getPersonName() {
        return personName;
    }


    public static void main(String[] args) {

        int a = 10;
        int b = 20;


//        if (a>b){
//            System.out.println("A is Greater");
//        }
//        else{
//            System.out.println("B is Greater");
//        }

        switch (a) {
            case 10 -> {
                a = 10;
                System.out.println("This is case 10");
            }
            case 20 -> {
                a = 20;
                System.out.println("This is case 20");
            }
            default -> System.out.println("This is default case");
        }

        If_else e = new If_else(77);


    }
}
