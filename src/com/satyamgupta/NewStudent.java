package com.satyamgupta;

import java.util.*;

public class NewStudent
{
    public static void main(String[] args)
    {
        Map<Integer, String> student = new HashMap<>();
        student.put(100,"Satyam");
        student.put(101,"Ajay");
        student.put(102,"Aakash");
        student.put(103,"Varun");
        student.put(104,"Selena");

        Scanner scan = new Scanner(System.in);
        int roll = scan.nextInt();

        System.out.println("Roll No -> " + roll);
        System.out.println("Name -> " + student.get(roll));


    }

}
