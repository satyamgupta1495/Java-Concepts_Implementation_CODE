package com.OOP;
//? Static variables are Memory efficient, they dont create objects

class Employee{
    int empId;
    String name;
    //* String companyName;
    static String companyName = "Google";

    Employee(int empId, String name){
        this.empId  = empId;
        this.name = name;
//*     this.companyName = companyName;

    }

    void display(){
        System.out.println(" Employee ID = " + empId);
        System.out.println(" Employee Name = " + name);
        System.out.println(" Company Name = " + companyName);
    }
}

public class StaticKeyword {

    public static void main(String[] args) {
        Employee emp1 = new Employee(100, "Satyam Gupta" );
        Employee emp2 = new Employee(101, "Rahul Gupta");

        emp1.display();
        emp2.display();

    }
}
