package com.datastructure.Recursion;

public class StringReversal {

    String reverse(String input)
    {
        if (input.equals("")) return "";
        return reverse(input.substring(1)) + input.charAt(0);
    }

    public static void main(String[] args) {
        String satyam = "Satyam";
        StringReversal s = new StringReversal();
        String res = s.reverse(satyam);
        System.out.println(res);
    }
}
