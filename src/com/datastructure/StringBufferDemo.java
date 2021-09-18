package com.datastructure;

public class StringBufferDemo {

    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Satyam");
        System.out.println(sb.capacity());              //! 16 + 6 ->{Satyam} = 22

        /*
        sb.append("Hello Worldwead-> dr");
        System.out.println(sb.capacity());              //! (old capacity + 1) * 2; i.e after 16 chars

        StringBuffer sb1 = new StringBuffer(100);
        System.out.println(sb1.capacity());
        */



        System.out.println(sb);




    }
}
