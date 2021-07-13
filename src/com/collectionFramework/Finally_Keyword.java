package com.collectionFramework;

//? Finally is used with try-catch
//? It executes after try-catch blocks but before control is transfered back to its origin
//? Its get executed whether there is exception occurs or not


public class Finally_Keyword {
    public static void main(String[] args) {
        try {
            int num1 = 2;
            int num2 = 0;
            System.out.println("Division is "+num1/num2);
        }
        catch (Exception e){
            System.out.println("Exception occured "+ e.getMessage());
        }
        finally{
            System.out.println("There is a exception in you code Bitch!");
        }
    }
}
