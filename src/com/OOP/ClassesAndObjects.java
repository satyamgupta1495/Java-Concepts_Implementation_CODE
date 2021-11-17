package com.OOP;

import java.util.*;

public class ClassesAndObjects {
    public static void main(String[] args) {

        Student student1 = new Student("Satyam", 10,4.7f);

        System.out.println(student1.name);
        System.out.println(student1.roll);
        System.out.println(student1.marks);

        Student random = new Student();
        System.out.println(random.name);

    }
}

class Student{
    String name;
    int roll;
    float marks;

    Student(String naam, int roll1, float marks){
        name = naam;
        roll = roll1;
        this.marks = marks;
    }

    Student() {
        this("Default name", 1122, 68.90f);
    }
}