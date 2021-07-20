package com.satyamgupta;

class Student{
    int s_rollno;
    String s_name;

    //? MAKING CONSTRUCTOR

//    Student(int rollno, String name){
//        s_name  = name;
//        s_rollno = rollno;
//    }

    //? PASSING NUMBERS FROM CONSTRUCTOR TO CONSTRUCTOR

    Student(){
        s_rollno = 4;
        s_name = "Chris";
    }
    Student(int rollno, String name){
        s_name  = name;
        s_rollno = rollno;
    }


    public void setName(String name){
        s_name = name;
    }
    public String getName(){
        return s_name;
    }

    public void sets_rollno(int rollno){
        s_rollno  = rollno;
    }

    public int getRollno(){
        return s_rollno;
    }

}


public class Getters_Setters {
    public static void main(String[] args) {

//        !OLD METHOD FOR SETTING VALUE AND DOING ALL THIS AHRD WORK
//        Student s = new Student();
//        s.sets_rollno(01);
//        System.out.println(s.getRollno());
//        s.setName("Jack");
//        System.out.println(s.getName());

//        !NEW METHOD USING CONSTRUCTOR
//          Student s = new Student(2, "Satyam");  //*-->Agar Constructor use kiya hai toh Setter use nhi krna padta hai
//          System.out.println(s.getRollno());
//          System.out.println(s.getName());

//          !AGAR YE BHI NHI KRMA HAI TOH

//            NewStudent s = new NewStudent();
//            System.out.println(s.getRollno());
//          System.out.println(s.getName());
    }
}
