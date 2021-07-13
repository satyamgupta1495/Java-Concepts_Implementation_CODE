package com.collectionFramework;

public class String_Methods {
    public static void main(String[] args) {
        String s1 = "This is a string";
        String t = new String(s1);
        for (int i = 0; i < s1.length(); i++) {
            System.out.println(s1.charAt(i));
        }
        System.out.println(t.replaceAll("This is a string","This is a replacement string!"));

        System.out.println(s1.compareTo(t));
        System.out.println(s1.equals(t));

        String org = "I am trying to code";
        String subString = org.substring(15,19);
        System.out.println("Original String : "+org);
        System.out.println("Sub string : "+subString);

        System.out.println(subString.replaceAll("code","sleep"));

        System.out.println(org.replace("code","Sleep"));
    }
}
