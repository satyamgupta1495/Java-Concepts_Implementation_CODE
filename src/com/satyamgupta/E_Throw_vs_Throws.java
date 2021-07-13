package com.satyamgupta;


class NegativeRadiusException extends Exception{

    @Override
    public String toString(){
        return super.toString() + " I am toString()!";
    }

    @Override
    public  String getMessage(){
        return super.getMessage() + " I am get message()!";
    }
}

public class E_Throw_vs_Throws {

    public static  double area(int r) throws NegativeRadiusException {
        if (r < 0) {
            throw new NegativeRadiusException();
        }
        return Math.PI *r*r;
    }

    public static int divide(int a ,int b) throws ArithmeticException{
        return a/b;
    }
    public static void main(String[] args) {
      try {
//          int c = divide(3, 0);
//          System.out.println(c);

          double ar = area(-3);
          System.out.println(ar);
      }

      catch (Exception e){
          System.out.println(e);
      }

    }
}
