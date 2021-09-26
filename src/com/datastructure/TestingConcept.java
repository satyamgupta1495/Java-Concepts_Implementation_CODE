package com.datastructure;

import java.util.ArrayList;
import java.util.Arrays;

public class TestingConcept {
    public static void main(String[] args) {
        String a = new String("Satyam");
        String b = new String("Satyam");

//        System.out.println(a.equals(b)); //? True
//        System.out.println(a==b);        //! False

//        System.out.println(2 << 1);    //! Multiply
//        System.out.println(4 >> 1);   //? Divide
//
//        System.out.println('a' + 'b');
//        System.out.println('a' + 45);

        //! append()
        //? reverse()
        //! setCharAt(index, char)
        //? insert(index, char)
        //! replace()



        System.out.println();
        StringBuilder builder = new StringBuilder();
        for (char i = 'a'; i <= 'z'; i++) {
            builder.append(i);
        }
        System.out.println("String builded -> " + builder);

        builder.insert(2,'X');
        System.out.println("After inserting -> " + builder);

        builder.reverse();
        System.out.println("String Reversed -> " + builder);

        builder.setCharAt(3,'x');
        System.out.println(builder);

        System.out.println("Substring -> " + builder.substring(2,7));

        StringBuilder builder1 = new StringBuilder();
//        builder1.append("123456789");
//        builder1.replace(0,5,"x");
//        System.out.println(builder1);

        System.out.println(builder.compareTo(builder1));

        String s = "  Satyam Gupta    ";
        builder1.append("Satyam");
        System.out.println(s.equals(builder1.toString()));

        System.out.println(String.join("-",builder,builder));
        System.out.println(String.valueOf(s));

        System.out.println(Arrays.toString(s.toCharArray()));

        System.out.println(s.strip());

        System.out.println(Arrays.toString(s.split("a")));


        //! Plindrome Program

        StringBuilder sb = new StringBuilder();
        sb.append("Satyam");
        System.out.println(sb.equals(sb.reverse()));


    }
}
