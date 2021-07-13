package com.satyamgupta;

import java.util.Scanner;

public class Exception_CWH {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        try{
            if (a<9){
                throw new MyException();
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            System.out.println(e);
        }
    }
}

class MyException extends Exception{

    @Override
    public String toString(){
        return super.toString() + " I am toString()!";
    }

    @Override
    public  String getMessage(){
        return super.getMessage() + " I am get message()!";
    }
}