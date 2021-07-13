package com.collectionFramework;

public class Finalize_Keyword {
    public static void main(String[] args) {
        Finalize_Keyword c1 = new Finalize_Keyword();
        Finalize_Keyword c2 = new Finalize_Keyword();

        c1 = null;
        c2 = null;
        System.gc();
    }
    public void finalize() throws  Throwable{
        System.out.println("Garbage Collected!");
    }
}
