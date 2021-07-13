package com.satyamgupta;

public class Grade_Encrypt {
    public static void main(String[] args) {
        char grade = 'B';
        grade = (char)(grade + 8);
        System.out.println(grade);


        //decrypt
        grade = (char)(grade-8);
        System.out.println(grade);
    }
}
