package com.satyamgupta;


// ! THIS WILL CALL BOTH THE METHODS
//class Demo{
//    static {
//        System.out.println("I am static Method");
//    }
//
//    {
//        System.out.println("I am instance of class Demo");
//    }

//        public static void main(String[]args)
//        {
//                Demo d  = new Demo();
//        }
//}

//! THIS WILL PRINT THE SINGLE VALUE I.E SINGLE METHOD
//
//class Demo{
//    static void staticDemo()
//    {
//        System.out.println("I am static Method");
//    }
//
//    public void instanceDemo()
//    {
//        System.out.println("I am instance of class Demo");
//    }
//
//}

class Demo{
    static{
        System.out.println("I am in static!");
    }
    {
        System.out.println("I am in Instance");
    }
}


public class Class_ForName {
    public static void main(String[] args) throws ClassNotFoundException {

//        Demo d  = new Demo();
//        Demo.staticDemo();

        try {
            Class.forName("Demo");

        }
        catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }
    }
}
