package com.newbeginning;
import java.io.PrintStream;
import java.util.Arrays;

public class StringsAndFunctions {
    public static void main(String[] args) {
        String s = "Satyam Gupta";
        System.out.println("Length : " + s.length());
        System.out.println("Substring : " + s.substring(0, 6));
        System.out.println("Replace : " + s.replace(" ", "-"));
        System.out.println("Char at : " + s.charAt(7));
        System.out.println("Trim : " + s.trim());
        System.out.println("Contains : " + s.contains("Gupta"));
        System.out.println("Equals ignore case : " + s.equalsIgnoreCase("satyam gupta"));
        System.out.println("Split : " + Arrays.toString(s.split(" ")));
        PrintStream var10000 = System.out;
        CharSequence[] var10002 = new CharSequence[]{"get", "set", "net"};
        var10000.println("Join : " + String.join("-", var10002));
        System.out.println("Value of int : " + String.valueOf(84850));
        System.out.println("To char Arr : " + Arrays.toString(s.toCharArray()));
        System.out.println("======================================================================");
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println("Append : " + String.valueOf(sb.append(" World")));
        System.out.println("Insert at : " + String.valueOf(sb.insert(1, "X")));
        System.out.println("Delete Range : " + String.valueOf(sb.delete(1, 5)));
        sb.setCharAt(2, 'S');
        System.out.println("Set char at : " + String.valueOf(sb));
        System.out.println("Reverse : " + String.valueOf(sb.reverse()));
    }
}
