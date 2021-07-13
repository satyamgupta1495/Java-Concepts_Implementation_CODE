package com.satyamgupta;

public class Exception_Handling_Throws {
    public static  void main(String[] args) {
        int i, j;
        i = 8;
        j = 9;

        try {
            int k = i/j;
            if (k==0){

//                ? YOou have to create the class for each exception

                throw new customException("This is not Possible!");
            }
            System.out.println(k);
        }
        catch(customException e){
            System.out.println("Custom Error "+e.getMessage());
        }
    }
}
