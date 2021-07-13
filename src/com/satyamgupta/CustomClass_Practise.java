package com.satyamgupta;



class NewEmployee{
    int salary;
    String emp_name;
    String newName;
    public int getSalary(int salary){
        System.out.println("Employee Salary is : " +salary);
        return  salary;
    }
    public void setName(String name){
       emp_name = name;

    }
    public String getName(){
        System.out.println("Employee New Name is : " +emp_name);
        return  emp_name;
    }
//    public void getDetails(){
//        System.out.println("");
//        System.out.println("Employees Full details are: ");
//        getName(String name);
//        getSalary();
//    }

}

class Square{
    int side;
    public int area(int side){
        return  side *side;
    }
    public int perimeter(int side){
        return  4*side;
    }
}

public class CustomClass_Practise {

    public static void main(String[] args) {
//        !PROBLEM 1
        NewEmployee emp = new NewEmployee();
//        emp.name = "Satyam Gupta";
//        emp.salary = 1000000000;
//        emp.getSalary();

        emp.setName("Justin");
        emp.getName();
//        emp.getDetails();
//        --------------------------
//        emp.getName("John");
//        emp.getSalary(10000000);
//        emp.setName("Satyam");

//        !PROBLEM 3

//        Square sq = new Square();
//        System.out.println(sq.area(3));
//        System.out.println(sq.perimeter(3));









    }
}
