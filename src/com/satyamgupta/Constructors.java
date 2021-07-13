package com.satyamgupta;

class ConstEmployee{
    private int emp_id ;
    private int emp_salary;
    private String emp_name;

//    ?CONSTRUCTOR

//    ConstEmployee(){
//        emp_id = 10;
//        emp_name = "Satyam";
//        emp_salary = 1000000;
//    }

//    ?CONSTRUCTOR OVERLOADING

    ConstEmployee(String name ){
        emp_name = name;
    }
    ConstEmployee(int id){
        emp_id = id;
    }

//    ?CONSTRUCTOR WITH MULTIPLE INPUT PARAMETER


    ConstEmployee(String name, int id){
        emp_name = name;
        emp_id = id;
    }




    public void setId(int id){
        emp_id = id;
    }
    public int getId(){
        System.out.println("Employee ID is : " +emp_id);
        return  emp_id;
    }
    public void setName(String name){
        emp_name = name;
    }
    public String getName(){
       System.out.println("Employee Name is : " +emp_name);
       return emp_name;
    }
    public void setSalary(int salary){
        emp_salary = salary;
    }
    public int getSalary(){
       System.out.println("Employee Salary is : " +emp_salary);
       return emp_salary;
    }

}



public class Constructors {
    public static void main(String[] args) {
        ConstEmployee emp = new ConstEmployee("Satyam Gupta Ramcharan");
        ConstEmployee emp1 = new ConstEmployee("Justin",01);
        ConstEmployee emp2 = new ConstEmployee(1395);



        emp.getId();
        emp1.getName();
        emp1.getId();
        emp2.getId();
    }
}
