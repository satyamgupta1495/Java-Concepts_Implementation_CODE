package com.collectionFramework;

import java.util.*;

public class C0_Collections_Comparable_Comparator {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student(101, "Saxyam"));
        students.add(new Student(190, "Satyam"));
        students.add(new Student(102, "Selena"));
        students.add(new Student(130, "Justin"));
        students.add(new Student(180, "Anuj"));

        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.marks == o2.marks) return (o1.name.compareTo(o2.name) );
                return 0;
            }
        });

        students.forEach(System.out::println);


    }
}
