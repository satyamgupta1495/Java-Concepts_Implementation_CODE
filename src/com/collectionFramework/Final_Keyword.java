package com.collectionFramework;

//?   final -> KEYWORD
//?   finally -> BLOCK
//?   finalize -> METHOD


public class Final_Keyword {
    public static void main(String[] args) {


//!---------------------- FINAL Variable---------------------------------------------------------------------

        final  int x = 100;
        System.out.println(x);

//*------------------- NOTES---- ON FINAL VARIABLE--------------------------------------*//
//?      WE CANNOT CHANGE THE VALUE OF X BECAUSE ITS FINAL!
//?      COMPILE TIME ERROR
//*------------------- NOTES---- ON FINAL VARIABLE--------------------------------------*//
//        x = 300;
//        System.out.println(x);





//!------------------------------FINAL METHOD-----------------------------------------------------------
        class Parent{
            final public void method(){
                System.out.println("Final---METHOD---- CANNOT BE OVERRIDEN!");
            }
        }
//*------------------- NOTES---- ON FINAL---METHOD--------------------------------------*//
//?        If a Method is defined as final in PARENT class then its child class cannot override it
//*------------------- NOTES---- ON FINAL---METHOD--------------------------------------*//

//        class Child extends Parent{
//            public void method(){
//                System.out.println("I cant override final method of my parents class");
//            }
//        }


//!----------------------------Final class---------------------------------------

        final class Dad{
            public void noChild(){
                System.out.println("I dont wanna have child!");
            }
        }

//*------------------- NOTES---- ON FINAL---METHOD--------------------------------------*//
//?        If a CLASS is defined as final then a child class cannot EXTENDS it
//*------------------- NOTES---- ON FINAL---METHOD--------------------------------------*//


//        class child extends Dad{
//            public void father(){
//                System.out.println("I need a father!");
//            }
//        }





    }
}
