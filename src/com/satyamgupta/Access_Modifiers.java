package com.satyamgupta;


class MyEmployee{

   private int emp_id;
   private String name;

   //! GETTERS AND SETTERS
   public void setName(String n){
      name = n;
   }
   public String getName(){
       return  name;
   }
   public void setId(int id){
       emp_id = id;
   }
   public int getId(){
       return  emp_id;
   }

}

class  Circle{
    private int r ;
    private int di;
    private double pi = 3.14;

    public void setRadius(int radius){
      r = radius;
    }
    public int getRadius(){
        return r;
    }
   public double area(){
       return pi*r*r;
   }

}

public class Access_Modifiers {
    public static void main(String[] args) {

        MyEmployee emp = new MyEmployee();
        // emp.id= 01;
        //! emp.name = "Satyam";         -->Throws an error due to access modifiers


//        emp.setName("Satyam");
//        System.out.println(emp.getName());
//
//        emp.setId(10);
//        System.out.println(emp.getId());

        Circle c = new Circle();

        c.setRadius(2);
        System.out.println(c.getRadius());
        System.out.println(c.area());







    }
}
