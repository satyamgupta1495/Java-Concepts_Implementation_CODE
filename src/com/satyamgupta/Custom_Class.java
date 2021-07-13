package com.satyamgupta;



class Employee{
    int id;
    String name;
    int salary;
    public void printDetails(){
        System.out.println("My Name is : "+name);
        System.out.println("My ID is : "+id);
    }
    public void getSalary(){
        System.out.println("Your monthly Salary is : " +salary);
    }
}


public class Custom_Class {
    public static void main(String[] args) {

        Employee satyam = new Employee();
        satyam.id = 12;
        satyam.salary = 1000000;
        satyam.name = "Satyam Gupta";

        satyam.printDetails();
        satyam.getSalary();



    }
}
