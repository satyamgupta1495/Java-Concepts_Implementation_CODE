package com.satyamgupta;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class String_Methods {

    private static final String IS = "SATYAMMMMM" ;

    public static void main(String[] args) {
        //TO LOWERCASE---------------------
//    Scanner scan  = new Scanner(System.in);
//    String name = scan.nextLine();
//    name = name.toLowerCase();
//    System.out.println(name);


        //REPLACE SPACES WITH UNDERSCORE===============
//    String text = "Satyam Is a good boy!";
//    text = text.replace(" ","_");
//    System.out.println(text);
//
//    }

//          STRING REPLACE NAME
//        String letter = "Dear <|name|>, thanks alot";
//        letter = letter.replace("<|name|>", "Satyam");
//        System.out.println(letter);


//        FINDING THE POSITION OF SPACES
//        String  mystring = "THIS IS A STING WIT  DOUBLE   SPACE";
//        System.out.println(mystring.indexOf("  "));
//        String str = mystring.replace("  ","__");
//        System.out.println(str);

        String mystring = "THIS IS ALL LOWERCASE";
        String d = mystring.toLowerCase();
        System.out.println(d);

        String mystring1 = "THIS IS ALL UPPERCASE";
        String f = mystring1.toUpperCase();
        System.out.println(f);

        String mystring2 = "THIS IS ALL REPLACED";
        String g = mystring2.replace("REPLACED", "NEW ONE");
        System.out.println(g);

//        String mystring3 = "THIS IS SPLITTED";
//        String h = mystring3.split(IS);

        String mystring4 = "            TRIMMEDDD                          ";
        String h =  mystring4.trim();
        System.out.println(h);

        
    }

}

