package com.datastructure;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.StringJoiner;
import java.util.StringTokenizer;

public class Strings {
    public static void main(String[] args) throws UnsupportedEncodingException {
        byte[] a = {71,70,68,69};
        Charset cs = Charset.defaultCharset();
        //! Number as Input and String alphabet as output.
//        String s = new String(a,"US-ASCII");

        String s = new String(a);
//        System.out.println(s);

        String string = ("Satyam is a ");
        String string2 = ("s2-> good boy.");

//? Strings Method

//        System.out.println(string.length());
//
//        System.out.println(string.charAt(2));


        //* Substring method input leta hai starting [index] of a number.
//        System.out.println(string.substring(4));
//        System.out.println(string.substring(2,10));


        //? Concatnate 2 stirngs.
//        System.out.println(string.concat(string2));


        //? Returns the index of the given stirng
//        System.out.println(string.indexOf("is a"));

        //? Returns the index of a char. with last encounter.
//        System.out.println(string.lastIndexOf("s"));

//        System.out.println(string.compareToIgnoreCase(string2));

        //? Returns boolean true is matched else false
//        System.out.println(string.equals(string2));
//        System.out.println(string.equalsIgnoreCase(string2));

        String b ;
        //? Remove whitespaces from in between
//        System.out.println(b = string.trim());

//        System.out.println(string.replace("s","r"));


        StringTokenizer st = new StringTokenizer(string);
//        System.out.println("Token 1 -> "+ st.nextToken());

        //? Count the remaining tokens remaining in the string.

//        System.out.println(st.countTokens());
//        while(st.hasMoreTokens()){
//            System.out.println("-> " +st.nextToken());
//        }


        System.out.println("---------------------------------------------");

        //! String Joiner

//        StringJoiner joiner, joiner2;
//        joiner = new StringJoiner("-","[","]");
//
//        joiner.add("My").add("name").add("Khan.");
//        System.out.println(joiner);
//        System.out.println(joiner.length());
//


//        joiner2 = new StringJoiner("-");

//        joiner2.setEmptyValue("This is an empty value");
//        System.out.println(joiner2);
//
//        joiner2.add("123456789");
//        joiner2.toString().getClass();
//        System.out.println(joiner2);

        System.out.println("---------------------------------------------");

        //! StringBuffer and StringBuilder

        //? String Buffer is threadSafe But StringBuilder is not thread safe which means ki
        //? If one program is accessing the thread other program would have to wait.

        StringBuffer sbf = new StringBuffer("Satyam ");
        sbf.append("Gupta");
        sbf.replace(0,6,"Justin");
        System.out.println(sbf);
        sbf.delete(8,13);


        char[] array = new char[10];
        sbf.getChars(0,6,array,0);

//        for (char ch: array ) {
//            System.out.print(ch+ " ");
//        }

//        sbf.setCharAt(0,'X');
//        System.out.println(sbf);
//
//
//        sbf.subSequence(1,8);
//        System.out.println(sbf.getClass());

        String x = sbf.substring(2);
        System.out.println(x);





    }


}
